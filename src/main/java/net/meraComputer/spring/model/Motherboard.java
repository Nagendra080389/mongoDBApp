package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class Motherboard implements Serializable {

    private static final long serialVersionUID = 4363961081639037466L;
    private Long OID;
    private String name;
    private ProcessorSocket processorSocket;
    private CabinetType cabinetType;
    private RamSlot ramSlot;
    private PowerSupplyWatt powerSupplyWatt;
    private GraphicCardSlot graphicCardSlot;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessorSocket getProcessorSocket() {
        return processorSocket;
    }

    public void setProcessorSocket(ProcessorSocket processorSocket) {
        this.processorSocket = processorSocket;
    }

    public CabinetType getCabinetType() {
        return cabinetType;
    }

    public void setCabinetType(CabinetType cabinetType) {
        this.cabinetType = cabinetType;
    }

    public RamSlot getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(RamSlot ramSlot) {
        this.ramSlot = ramSlot;
    }

    public PowerSupplyWatt getPowerSupplyWatt() {
        return powerSupplyWatt;
    }

    public void setPowerSupplyWatt(PowerSupplyWatt powerSupplyWatt) {
        this.powerSupplyWatt = powerSupplyWatt;
    }

    public GraphicCardSlot getGraphicCardSlot() {
        return graphicCardSlot;
    }

    public void setGraphicCardSlot(GraphicCardSlot graphicCardSlot) {
        this.graphicCardSlot = graphicCardSlot;
    }
}
