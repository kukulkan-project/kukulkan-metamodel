package mx.infotec.dads.kukulkan.metamodel.conventions;

import mx.infotec.dads.kukulkan.metamodel.foundation.EntityAssociation;
import mx.infotec.dads.kukulkan.metamodel.util.Pair;

/**
 * Primary Key Name Strategy
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@FunctionalInterface
public interface AssociationNameStrategy {

    /**
     * Get the name of the primary key
     * 
     * @param entity
     * @return
     */
    Pair<PhysicalName, PhysicalName> getPhysicalAssociationName(EntityAssociation entity);
}
