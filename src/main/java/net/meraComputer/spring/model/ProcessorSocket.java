package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class ProcessorSocket  implements Serializable {

    private static final long serialVersionUID = -6686108161283164324L;
    private Long OID;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }


}
