package mx.infotec.dads.kukulkan.metamodel.builders;

import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityAssociation;

/**
 * Entity Association Builder
 *
 * @author Daniel Cortes Pichardo
 */
public class EntityAssociationBuilder {

    /**
     * The java property.
     */
    private EntityAssociation entityAssociation;

    public EntityAssociationBuilder(Entity primaryEntity, Entity foreignEntity) {
        this.entityAssociation = new EntityAssociation(primaryEntity, foreignEntity);
    }

    public EntityAssociationBuilder() {
        this.entityAssociation = new EntityAssociation();
    }

    public EntityAssociationBuilder bidirectional(boolean bidirectional) {
        entityAssociation.setBidirectional(bidirectional);
        return this;
    }

    public EntityAssociationBuilder ownerside(boolean ownerSide) {
        entityAssociation.setOwnerSide(ownerSide);
        return this;
    }

    public EntityAssociationBuilder source(Entity source) {
        entityAssociation.setSource(source);
        return this;
    }

    public EntityAssociationBuilder target(Entity target) {
        this.entityAssociation.setTarget(target);
        return this;
    }

    public EntityAssociationBuilder toSourcePropertyName(String toSourcePropertyName) {
        entityAssociation.setToSourcePropertyName(toSourcePropertyName);
        return this;
    }

    public EntityAssociationBuilder toSourcePropertyNamePlural(String toSourcePropertyNamePlural) {
        entityAssociation.setToSourcePropertyNamePlural(toSourcePropertyNamePlural);
        return this;
    }

    public EntityAssociationBuilder toSourcePropertyNameUnderscore(String toSourcePropertyNameUnderscore) {
        entityAssociation.setToSourcePropertyNameUnderscore(toSourcePropertyNameUnderscore);
        return this;
    }

    public EntityAssociationBuilder toSourcePropertyNameUnderscorePlural(String toSourcePropertyNameUnderscorePlural) {
        entityAssociation.setToSourcePropertyNameUnderscorePlural(toSourcePropertyNameUnderscorePlural);
        return this;
    }

    public EntityAssociationBuilder toTargetPropertyName(String toTargetPropertyName) {
        entityAssociation.setToTargetPropertyName(toTargetPropertyName);
        return this;
    }

    public EntityAssociationBuilder toTargetPropertyNamePlural(String toTargetPropertyNamePlural) {
        entityAssociation.setToTargetPropertyNamePlural(toTargetPropertyNamePlural);
        return this;
    }

    public EntityAssociationBuilder toTargetPropertyNameUnderscore(String toTargetPropertyNameUnderscore) {
        entityAssociation.setToTargetPropertyNameUnderscore(toTargetPropertyNameUnderscore);
        return this;
    }

    public EntityAssociationBuilder toTargetPropertyNameUnderscorePlural(String toTargetPropertyNameUnderscorePlural) {
        entityAssociation.setToTargetPropertyNameUnderscorePlural(toTargetPropertyNameUnderscorePlural);
        return this;
    }

    public EntityAssociation build() {
        return entityAssociation;
    }
}
