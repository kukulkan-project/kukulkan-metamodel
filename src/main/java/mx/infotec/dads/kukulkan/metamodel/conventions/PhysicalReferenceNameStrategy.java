package mx.infotec.dads.kukulkan.metamodel.conventions;

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
    String getPhysicalReferenceName(String snakeConventionName);
}
