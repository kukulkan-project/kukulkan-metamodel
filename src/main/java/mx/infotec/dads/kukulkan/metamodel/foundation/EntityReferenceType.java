package mx.infotec.dads.kukulkan.metamodel.foundation;

/**
 * A EntityReferenceType is a Holder of a reference of and {@link Entity} to its
 * References
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class EntityReferenceType {

    private Entity target;
    private String toTargetPropertyName;
    private String toTargetPropertyNamePlural;
    @SuppressWarnings("rawtypes")
    private Property displayField;
    private AssociationType associationType;

    private boolean owner;
    private boolean isAutoReference;

    public String getName() {
        return target.getName();

    }

    public EntityReferenceType() {
    }

    private EntityReferenceType(Entity target) {
        this.target = target;
        this.toTargetPropertyName = "00";// for ordering
        this.toTargetPropertyName = "00";// for ordering
        this.isAutoReference = true;
        this.owner = true;
    }

    public static EntityReferenceType createToTargetReference(EntityAssociation association, boolean owner) {
        return new EntityReferenceType().addTargetReference(association, owner);
    }

    public static EntityReferenceType createToSourceReference(EntityAssociation association, boolean owner) {
        return new EntityReferenceType().addSourceReference(association, owner);
    }

    public static EntityReferenceType createAutoReference(Entity entity) {
        return new EntityReferenceType(entity);
    }

    private EntityReferenceType addTargetReference(EntityAssociation association, boolean owner) {
        this.target = association.getTarget();
        this.toTargetPropertyName = association.getToTargetPropertyName();
        this.toTargetPropertyNamePlural = association.getToTargetPropertyNamePlural();
        this.associationType = association.getType();
        this.owner = owner;
        return this;
    }

    private EntityReferenceType addSourceReference(EntityAssociation association, boolean owner) {
        this.target = association.getSource();
        this.toTargetPropertyName = association.getToSourcePropertyName();
        this.toTargetPropertyNamePlural = association.getToSourcePropertyNamePlural();
        this.associationType = association.getType();
        this.owner = owner;
        return this;
    }

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public String getToTargetPropertyName() {
        return toTargetPropertyName;
    }

    public void setToTargetPropertyName(String toTargetPropertyName) {
        this.toTargetPropertyName = toTargetPropertyName;
    }

    public String getToTargetPropertyNamePlural() {
        return toTargetPropertyNamePlural;
    }

    public void setToTargetPropertyNamePlural(String toTargetPropertyNamePlural) {
        this.toTargetPropertyNamePlural = toTargetPropertyNamePlural;
    }
    
    public Property<?> getDisplayField() {
        return displayField;
    }

    public void setDisplayField(Property<?> displayField) {
        this.displayField = displayField;
    }

    public AssociationType getAssociationType() {
        return associationType;
    }

    public void setAssociationType(AssociationType type) {
        this.associationType = type;
    }

    public boolean isAutoReference() {
        return isAutoReference;
    }

    @Override
    public int hashCode() {
        return target.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return target.equals(obj);
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }
}
