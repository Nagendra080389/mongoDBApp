package net.meraComputer.spring.daoImpl;

import net.meraComputer.spring.dao.UserDao;
import net.meraComputer.spring.model.UserAccount;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by Nagendra on 01-01-2016.
 */
public class UserDaoImpl implements UserDao {

    private MongoTemplate mongoTemplate;

    @Required
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void saveUser(UserAccount user) {
        if(mongoTemplate.collectionExists("userAccount")) {
            mongoTemplate.save(user);
        }else {
            mongoTemplate.createCollection("userAccount");
            mongoTemplate.save(user);
        }
    }

    @Override
    public UserAccount findUser(String userName, String password) {
        Criteria criteria = Criteria.where("username").is(userName).and("password").is(password);
        Query query = new Query();
        query.addCriteria(criteria);
        List<UserAccount> userAccounts = mongoTemplate.find(query, UserAccount.class, "userAccount");
        if(!userAccounts.isEmpty()){
            return userAccounts.get(0);
        }else {
            return null;
        }
    }

    @Override
    public UserAccount findByUserName(String username) {


        Criteria criteria = Criteria.where("username").in(username);
        Query query = new Query();
        query.addCriteria(criteria);
        List<UserAccount> userAccounts = mongoTemplate.find(query, UserAccount.class, "userAccount");
        if(!userAccounts.isEmpty()){
            return userAccounts.get(0);
        }else {
            return null;
        }
    }
}
