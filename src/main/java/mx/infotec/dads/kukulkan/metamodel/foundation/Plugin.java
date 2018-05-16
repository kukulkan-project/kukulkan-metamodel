package mx.infotec.dads.kukulkan.metamodel.foundation;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.Serializable;

public class Plugin implements Serializable {

    private String name;
    private ObjectNode data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectNode getData() {
        return data;
    }

    public void setData(ObjectNode data) {
        this.data = data;
    }


}
