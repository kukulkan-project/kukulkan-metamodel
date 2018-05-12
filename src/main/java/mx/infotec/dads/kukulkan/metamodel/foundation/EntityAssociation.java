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

    private String toTargetPropertyName;
    private String toTargetPropertyNamePlural;

    private Entity target;
    private String toSourcePropertyName;
    private String toSourcePropertyNamePlural;

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

    public boolean isBidirectional() {
        return toSourcePropertyName != null;
    }

    public boolean isCycle() {
        return source.getName().equals(target.getName());
    }

    public String getToTargetPropertyName() {
        return toTargetPropertyName;
    }

    public String getToTargetPropertyNamePlural() {
        return toTargetPropertyNamePlural;
    }

    public String getToSourcePropertyName() {
        return toSourcePropertyName;
    }

    public String getToSourcePropertyNamePlural() {
        return toSourcePropertyNamePlural;
    }

    public void setToTargetPropertyName(String toTargetPropertyName) {
        this.toTargetPropertyName = toTargetPropertyName;
    }

    public void setToTargetPropertyNamePlural(String toTargetPropertyNamePlural) {
        this.toTargetPropertyNamePlural = toTargetPropertyNamePlural;
    }

    public void setToSourcePropertyName(String toSourcePropertyName) {
        this.toSourcePropertyName = toSourcePropertyName;
    }

    public void setToSourcePropertyNamePlural(String toSourcePropertyNamePlural) {
        this.toSourcePropertyNamePlural = toSourcePropertyNamePlural;
    }

    /**
     * getAssociationName, param is implemented as String in order to be used
     * with freemarker
     * 
     * @param isUnderscoreFormatt
     * @return
     */
    public String getAssociationName() {
        return source.getTableName() + "_" + target.getTableName();
    }

    @Override
    public String toString() {
        return "[source: " + source + ", " + "propertyName: " + toTargetPropertyName + "], " + "[target: " + target
                + ", " + "propertyName: " + toSourcePropertyName + "], " + "[type: " + type + "]";
    }
}
