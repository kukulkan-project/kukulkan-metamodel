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
public class EntityDefaultComparator implements Comparator<Entity> {

    @Override
    public int compare(Entity o1, Entity o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
