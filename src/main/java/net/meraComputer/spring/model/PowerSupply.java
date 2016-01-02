package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class PowerSupply  implements Serializable {
    private static final long serialVersionUID = 7035385051553754066L;

    public enum POWER {P450, P600}

    private Long OID;
    private PowerSupplyWatt powerSupplyWatt;

    public PowerSupplyWatt getPowerSupplyWatt() {
        return powerSupplyWatt;
    }

    public void setPowerSupplyWatt(PowerSupplyWatt powerSupplyWatt) {
        this.powerSupplyWatt = powerSupplyWatt;
    }

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }
}
