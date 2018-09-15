package mx.infotec.dads.kukulkan.metamodel.foundation;

import java.io.Serializable;

import mx.infotec.dads.kukulkan.metamodel.builders.EntityAssociationBuilder;

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
    
    private boolean bidirectional;

    private String toTargetPropertyName;
    private String toTargetPropertyNamePlural;
    private String toTargetPropertyNameUnderscore;
    private String toTargetPropertyNameUnderscorePlural;
    private String toTargetReferencePhysicalName;

    private Entity target;
    private String toSourcePropertyName;
    private String toSourcePropertyNamePlural;
    private String toSourcePropertyNameUnderscore;
    private String toSourcePropertyNameUnderscorePlural;
    private String toSourceReferencePhysicalName;

    private AssociationType type;
    
    @SuppressWarnings("rawtypes")
    private Property displayField;

    public EntityAssociation(){
        
    }
    
    public EntityAssociation(Entity source, Entity target) {
        this.source = source;
        this.target = target;
    }

    public static EntityAssociationBuilder createEntityAssociation(){
        return new EntityAssociationBuilder();
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
    
    @SuppressWarnings("rawtypes")
    public Property getDisplayField() {
        return displayField;
    }

    public void setDisplayField(Property<?> displayField) {
        this.displayField = displayField;
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
        return bidirectional;
    }
    
    public void setBidirectional(boolean bidirectional) {
        this.bidirectional = bidirectional;
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
    
    public String getToTargetPropertyNameUnderscore() {
        return toTargetPropertyNameUnderscore;
    }

    public void setToTargetPropertyNameUnderscore(String toTargetPropertyNameUnderscore) {
        this.toTargetPropertyNameUnderscore = toTargetPropertyNameUnderscore;
    }

    public String getToSourcePropertyNameUnderscore() {
        return toSourcePropertyNameUnderscore;
    }

    public void setToSourcePropertyNameUnderscore(String toSourcePropertyNameUnderscore) {
        this.toSourcePropertyNameUnderscore = toSourcePropertyNameUnderscore;
    }

    public String getToTargetPropertyNameUnderscorePlural() {
        return toTargetPropertyNameUnderscorePlural;
    }

    public void setToTargetPropertyNameUnderscorePlural(String toTargetPropertyNameUnderscorePlural) {
        this.toTargetPropertyNameUnderscorePlural = toTargetPropertyNameUnderscorePlural;
    }

    public String getToSourcePropertyNameUnderscorePlural() {
        return toSourcePropertyNameUnderscorePlural;
    }

    public void setToSourcePropertyNameUnderscorePlural(String toSourcePropertyNameUnderscorePlural) {
        this.toSourcePropertyNameUnderscorePlural = toSourcePropertyNameUnderscorePlural;
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

    public String getToTargetReferencePhysicalName() {
        return toTargetReferencePhysicalName;
    }

    public void setToTargetReferencePhysicalName(String toTargetReferencePhysicalName) {
        this.toTargetReferencePhysicalName = toTargetReferencePhysicalName;
    }

    public String getToSourceReferencePhysicalName() {
        return toSourceReferencePhysicalName;
    }

    public void setToSourceReferencePhysicalName(String toSourceReferencePhysicalName) {
        this.toSourceReferencePhysicalName = toSourceReferencePhysicalName;
    }
}
