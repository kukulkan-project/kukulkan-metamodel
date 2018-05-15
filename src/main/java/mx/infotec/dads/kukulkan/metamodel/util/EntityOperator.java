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
            return entity.getName().equals(association.getTarget().getName());
        } else {
            return false;
        }
    }

    public static boolean hasTypedValue(Entity entity, EntityAssociation association) {
        return isOwnerAssociation(entity, association) || isInBidirectional(entity, association);
    }

    public static boolean isOwnerReference(Entity entity, EntityAssociation association) {
        switch (association.getType()) {
        case ONE_TO_ONE:

            break;
        case ONE_TO_MANY:

            break;
        case MANY_TO_ONE:

            break;
        case MANY_TO_MANY:

            break;
        default:
            break;
        }
        return false;
    }

    public static Set<String> computeReferenceTypes(Entity targetEntity, List<EntityAssociation> associations) {
        Stream<String> stream = associations.stream()
                .filter(association -> EntityOperator.isOwnerAssociation(targetEntity, association)
                        || EntityOperator.isInBidirectional(targetEntity, association))
                .map(association -> {
                    if (EntityOperator.isOwnerAssociation(targetEntity, association)) {
                        return association.getTarget().getName();
                    } else {
                        return association.getSource().getName();
                    }
                });
        return Stream.concat(stream, Stream.of(targetEntity.getName()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(String::toString))));
    }

    public static Set<EntityReference> computeEntityReferences(Entity entity, List<EntityAssociation> associations) {
        Set<EntityReference> entities = new TreeSet<>(new EntityReferenceComparator());
        associations.forEach(association -> {
            if (isOwnerAssociation(entity, association)) {
                System.out.println(association.getTarget().getName());
                if (association.getType().equals(AssociationType.ONE_TO_ONE)
                        && association.getToSourcePropertyName() == null) {
                    entities.add(
                            new EntityReference(entity, association.getTarget(), association.getToTargetPropertyName(),
                                    association.getToTargetPropertyNamePlural(), association.getType()));
                } else if (association.getType().equals(AssociationType.MANY_TO_ONE)) {
                    entities.add(
                            new EntityReference(entity, association.getTarget(), association.getToTargetPropertyName(),
                                    association.getToTargetPropertyNamePlural(), association.getType()));
                } else if (association.getType().equals(AssociationType.MANY_TO_MANY)) {
                    entities.add(
                            new EntityReference(entity, association.getTarget(), association.getToTargetPropertyName(),
                                    association.getToTargetPropertyNamePlural(), association.getType()));
                }
            } else if ((association.getType().equals(AssociationType.ONE_TO_ONE)
                    || association.getType().equals(AssociationType.ONE_TO_MANY))
                    && (association.getToSourcePropertyName() != null)) {
                // is notOwnerAssociation
                System.out.println(association.getSource().getName());
                entities.add(new EntityReference(entity, association.getSource(), association.getToSourcePropertyName(),
                        association.getToSourcePropertyNamePlural(), association.getType()));
            }
        });
        return entities;
    }
}
