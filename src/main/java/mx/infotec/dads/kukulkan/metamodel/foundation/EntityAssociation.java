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

    private Entity source;
    private String sourcePropertyName;
    private String sourcePropertyNamePlural;

    private Entity target;
    private String targetPropertyName;
    private String targetPropertyNamePlural;

    private AssociationType type;

    public EntityAssociation(Entity source, Entity target) {
        this.source = source;
        this.target = target;
    }

    public boolean isOwnerSide() {
        return ownerSide;
    }

    public AssociationType getType() {
        return type;
    }

    public void setOwnerSide(boolean ownerSide) {
        this.ownerSide = ownerSide;
    }

    public void setType(AssociationType type) {
        this.type = type;
    }

    public Entity getSource() {
        return source;
    }

    public void setSource(Entity source) {
        this.source = source;
    }

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public String getSourcePropertyName() {
        return sourcePropertyName;
    }

    public void setSourcePropertyName(String sourcePropertyName) {
        this.sourcePropertyName = sourcePropertyName;
    }

    public String getTargetPropertyName() {
        return targetPropertyName;
    }

    public void setTargetPropertyName(String targetPropertyName) {
        this.targetPropertyName = targetPropertyName;
    }

    public boolean isBidirectional() {
        return targetPropertyName != null;
    }

    public boolean isCycle() {
        return source.getName().equals(target.getName());
    }

    public String getSourcePropertyNamePlural() {
        return sourcePropertyNamePlural;
    }

    public void setSourcePropertyNamePlural(String sourcePropertyNamePlural) {
        this.sourcePropertyNamePlural = sourcePropertyNamePlural;
    }

    public String getTargetPropertyNamePlural() {
        return targetPropertyNamePlural;
    }

    public void setTargetPropertyNamePlural(String targetPropertyNamePlural) {
        this.targetPropertyNamePlural = targetPropertyNamePlural;
    }

    @Override
    public String toString() {
        return "[source: " + source + ", " + "propertyName: " + sourcePropertyName + "], " + "[target: " + target + ", "
                + "propertyName: " + targetPropertyName + "], " + "[type: " + type + "]";
    }
}
