package mx.infotec.dads.kukulkan.metamodel.conventions;

import mx.infotec.dads.kukulkan.metamodel.foundation.EntityAssociation;

/**
 * Primary Key Name Strategy
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@FunctionalInterface
public interface PhysicalReferenceNameStrategy {

	/**
	 * Get the name of the primary key
	 * 
	 * @param entity
	 * @return
	 */

	String getPhysicalReferenceName(EntityAssociation entityAssociation, boolean toSource);
}
