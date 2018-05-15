package mx.infotec.dads.kukulkan.metamodel.util;

import java.util.Comparator;

import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;
import mx.infotec.dads.kukulkan.metamodel.foundation.EntityReference;

/**
 * Default Comparator for {@link Entity}
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class EntityReferenceComparator implements Comparator<EntityReference> {
    
    @Override
    public int compare(EntityReference o1, EntityReference o2) {
        return o1.getTarget().getName().compareTo(o2.getTarget().getName());
    }

}
