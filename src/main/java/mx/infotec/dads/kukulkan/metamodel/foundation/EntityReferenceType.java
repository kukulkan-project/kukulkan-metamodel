package mx.infotec.dads.kukulkan.metamodel.foundation;

/**
 * EntityReferenceType
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class EntityReferenceType {

    private Entity target;
    private String toTargetPropertyName;
    private String toTargetPropertyNamePlural;
    private AssociationType associationType;

    private String order;

    public String getOrder() {
        if (order == null) {
            return target.getName();
        } else {
            return order;
        }
    }

    public String getName() {
        return target.getName();

    }

    private boolean isAutoReference;

    public EntityReferenceType() {
    }

    private EntityReferenceType(Entity target) {
        this.target = target;
        this.toTargetPropertyName = "00";// for ordering
        this.toTargetPropertyName = "00";// for ordering
        this.order = "00";
        this.isAutoReference = true;
    }

    public static EntityReferenceType createToTargetReference(EntityAssociation association) {
        return new EntityReferenceType().addTargetReference(association);
    }

    public static EntityReferenceType createToSourceReference(EntityAssociation association) {
        return new EntityReferenceType().addSourceReference(association);
    }

    public static EntityReferenceType createAutoReference(Entity entity) {
        return new EntityReferenceType(entity);
    }

    private EntityReferenceType addTargetReference(EntityAssociation association) {
        this.target = association.getTarget();
        this.toTargetPropertyName = association.getToTargetPropertyName();
        this.toTargetPropertyNamePlural = association.getToTargetPropertyNamePlural();
        this.associationType = association.getType();
        return this;
    }

    private EntityReferenceType addSourceReference(EntityAssociation association) {
        this.target = association.getSource();
        this.toTargetPropertyName = association.getToSourcePropertyName();
        this.toTargetPropertyNamePlural = association.getToSourcePropertyNamePlural();
        this.associationType = association.getType();
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
}
