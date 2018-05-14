package mx.infotec.dads.kukulkan.metamodel.util;

import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityAssociation;

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
}
