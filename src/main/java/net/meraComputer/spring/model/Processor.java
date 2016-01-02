package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class Processor  implements Serializable {
    private static final long serialVersionUID = -3933667672224429113L;

    public enum SOCKET {LGA1, LGA2, AM3, AM2}

    private Long OID;
    private String name;
    @DBRef
    private ProcessorSocket processorSocket;

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
}
