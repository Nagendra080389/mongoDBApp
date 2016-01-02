package net.meraComputer.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class Cabinet implements Serializable{


    private static final long serialVersionUID = 1241979815412929403L;

    public enum SIZE {MICRO_ATX, MINI_ATX}
    @Id
    private Long OID;
    @DBRef
    private CabinetType cabinetType;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public CabinetType getCabinetType() {
        return cabinetType;
    }

    public void setCabinetType(CabinetType cabinetType) {
        this.cabinetType = cabinetType;
    }
}
