package net.meraComputer.spring.listener;

import net.meraComputer.spring.service.CascadeSave;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;
import org.springframework.data.mapping.model.MappingException;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;


/**
 * Created by Nagendra on 02-01-2016.
 * Listener for MongoDB to save child Object when @DBRef is mentioned.
 */
public class CascadeSaveMongoEventListener extends AbstractMongoEventListener<Object> {

    private MongoTemplate mongoTemplate;

    @Required
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void onBeforeConvert(final Object source) {
        ReflectionUtils.doWithFields(source.getClass(), new ReflectionUtils.FieldCallback() {

            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                ReflectionUtils.makeAccessible(field);

                if (field.isAnnotationPresent(DBRef.class) && field.isAnnotationPresent(CascadeSave.class)) {
                    final Object fieldValue = field.get(source);

                    Class fieldClass = fieldValue.getClass();
                    if (Collection.class.isAssignableFrom(field.getType())) {
                        fieldClass = getParameterType(fieldValue);
                    }

                    DbRefFieldCallback callback = new DbRefFieldCallback();

                    ReflectionUtils.doWithFields(fieldClass, callback);

                    if (!callback.isIdFound()) {
                        throw new MappingException("Cannot perform cascade save on child object without id set");
                    }

                    if (Collection.class.isAssignableFrom(field.getType())) {
                        @SuppressWarnings("unchecked")
                        Collection<Object> models = (Collection<Object>) fieldValue;
                        for (Object model : models) {
                            mongoTemplate.save(model);
                        }
                    } else {
                        mongoTemplate.save(fieldValue);
                    }
                }
            }
        });
    }

    private Class getParameterType(Object fieldValue) {
        Object next = null;
        if(fieldValue instanceof Collection){
            Iterator iterator = ((Collection) fieldValue).iterator();
            while (iterator.hasNext()){
                next = iterator.next();
            }
        }
        return next.getClass();
    }


    private static class DbRefFieldCallback implements ReflectionUtils.FieldCallback {
        private boolean idFound;

        public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
            ReflectionUtils.makeAccessible(field);

            if (field.isAnnotationPresent(Id.class)) {
                idFound = true;
            }
        }

        public boolean isIdFound() {
            return idFound;
        }
    }
}
