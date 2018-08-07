package mx.infotec.dads.kukulkan.metamodel.conventions;

import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;

/**
 * Primary Key Name Strategy
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface PrimaryKeyNameStrategy {

    /**
     * Get the name of the primary key
     * 
     * @param entity
     * @return
     */
    String getName(Entity entity);
}
