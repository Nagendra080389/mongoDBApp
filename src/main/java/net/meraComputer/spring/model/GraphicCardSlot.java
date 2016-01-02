package net.meraComputer.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amarendra on 08/08/15.
 */
@Document
public class GraphicCardSlot  implements Serializable {

    private static final long serialVersionUID = -2696531553205206616L;
    private Long OID;
    private List<GraphicCard> graphicCardList;

    public Long getOID() {
        return OID;
    }

    public void setOID(Long OID) {
        this.OID = OID;
    }

    public List<GraphicCard> getGraphicCardList() {
        return graphicCardList;
    }

    public void setGraphicCardList(List<GraphicCard> graphicCardList) {
        this.graphicCardList = graphicCardList;
    }
}
