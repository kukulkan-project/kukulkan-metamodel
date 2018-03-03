package mx.infotec.dads.kukulkan.metamodel.foundation;

import java.io.Serializable;

/**
 * Entity Association.
 *
 * @author Daniel Cortes Pichardo
 */
public class EntityAssociation implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    private boolean ownerSide;
    
    private String fieldName;
    
    private Entity to;

    private AssociationType type;

    public boolean isOwnerSide() {
        return ownerSide;
    }

    public Entity getTo() {
        return to;
    }

    public AssociationType getType() {
        return type;
    }

    public void setOwnerSide(boolean ownerSide) {
        this.ownerSide = ownerSide;
    }

    public void setTo(Entity to) {
        this.to = to;
    }

    public void setType(AssociationType type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
