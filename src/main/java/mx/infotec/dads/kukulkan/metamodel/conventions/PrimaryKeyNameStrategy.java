package mx.infotec.dads.kukulkan.metamodel.conventions;

import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;

/**
 * Primary Key Name Strategy
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@FunctionalInterface
public interface PrimaryKeyNameStrategy {

    /**
     * Get the name of the primary key
     * 
     * @param entity
     * @return
     */
    PhysicalName getPrimaryKeyPhysicalName(Entity entity);
}
