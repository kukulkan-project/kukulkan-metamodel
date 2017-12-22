package mx.infotec.dads.kukulkan.metamodel.translator.dsl;

import java.util.List;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelElement;

/**
 * Visitor Context
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class VisitorContext {

    private List<DomainModelElement> elements;

    public VisitorContext(List<DomainModelElement> dmeList){
        this.elements= dmeList;
    }
    public List<DomainModelElement> getElements() {
        return elements;
    }

    public void setElements(List<DomainModelElement> elements) {
        this.elements = elements;
    }

}
