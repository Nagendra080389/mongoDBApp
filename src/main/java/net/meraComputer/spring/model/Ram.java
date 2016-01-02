package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class Ram  implements Serializable {
    private static final long serialVersionUID = 3028232650587805168L;

    public enum SLOT {DDR2,DDR3}
    private Long OID;
    private RamSlot ramSlot;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public RamSlot getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(RamSlot ramSlot) {
        this.ramSlot = ramSlot;
    }
}
