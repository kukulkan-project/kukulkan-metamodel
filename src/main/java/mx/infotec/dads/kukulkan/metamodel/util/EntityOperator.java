package mx.infotec.dads.kukulkan.metamodel.util;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mx.infotec.dads.kukulkan.metamodel.foundation.AssociationType;
import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityAssociation;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityReference;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityReferenceType;

/**
 * Entity Operator
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class EntityOperator {

    private EntityOperator() {

    }

    public static boolean isOwnerAssociation(Entity entity, EntityAssociation association) {
        return entity.getName().equals(association.getSource().getName());
    }

    public static boolean isInBidirectional(Entity entity, EntityAssociation association) {
        if (association.isBidirectional()) {
            // is a cycle
            return entity.getName().equals(association.getTarget().getName());
        } else {
            return false;
        }
    }

    public static boolean hasTypedValue(Entity entity, EntityAssociation association) {
        return isOwnerAssociation(entity, association) || isInBidirectional(entity, association);
    }

    public static Set<EntityReferenceType> computeReferenceTypes(Entity currentEntity,
            List<EntityAssociation> associations) {
        Stream<EntityReferenceType> stream = associations.stream()
                .filter(association -> EntityOperator.isOwnerAssociation(currentEntity, association)
                        || EntityOperator.isInBidirectional(currentEntity, association))
                .map(association -> {
                    if (EntityOperator.isOwnerAssociation(currentEntity, association)) {
                        return EntityReferenceType.createToTargetReference(association, true);
                    } else {
                        return EntityReferenceType.createToSourceReference(association, false);
                    }
                });
        return Stream.concat(stream, Stream.of(EntityReferenceType.createAutoReference(currentEntity))).collect(
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(EntityReferenceType::getName))));
    }

    public static Set<EntityReferenceType> computeFkEntityReferences(Entity entity,
            List<EntityAssociation> associations) {
        Set<EntityReferenceType> entities = new TreeSet<>(Comparator.comparing(EntityReferenceType::getName));
        associations.forEach(association -> {
            if (isLeftOwner(entity, association)) {
                if (association.getType().equals(AssociationType.ONE_TO_ONE)
                        || association.getType().equals(AssociationType.MANY_TO_ONE))
                    entities.add(EntityReferenceType.createToTargetReference(association, true));
            } else if (isRightOwner(association) && association.getType().equals(AssociationType.ONE_TO_MANY)
                    && association.isBidirectional()) {
                // is notOwnerAssociation
                entities.add(EntityReferenceType.createToSourceReference(association, false));
            }
        });
        return entities;

    }

    public static Set<EntityReference> computeEntityReferences(Entity entity, List<EntityAssociation> associations) {
        Set<EntityReference> entities = new TreeSet<>(new EntityReferenceComparator());
        associations.forEach(association -> {
            if (isLeftOwner(entity, association)) {
                entities.add(EntityReference.createTargetReference(entity, association));
            } else if (isRightOwner(association)) {
                // is notOwnerAssociation
                entities.add(EntityReference.createSourceReference(entity, association));
            }
        });
        return entities;

    }

    public static boolean isLeftOwner(Entity entity, EntityAssociation association) {
        if (isOwnerAssociation(entity, association)) {
            boolean isOneToOne = association.getType().equals(AssociationType.ONE_TO_ONE)
                    && association.getToSourcePropertyName() == null;
            boolean isManyToOne = association.getType().equals(AssociationType.MANY_TO_ONE);
            boolean isManyToMany = association.getType().equals(AssociationType.MANY_TO_MANY);
            return isOneToOne || isManyToOne || isManyToMany;
        }
        return false;
    }

    public static boolean isRightOwner(EntityAssociation association) {
        boolean isOneToOne = association.getType().equals(AssociationType.ONE_TO_ONE);
        boolean isOneToMany = association.getType().equals(AssociationType.ONE_TO_MANY);
        boolean hasLeftReference = association.getToSourcePropertyName() != null;
        return (isOneToOne || isOneToMany) && (hasLeftReference);
    }

}
