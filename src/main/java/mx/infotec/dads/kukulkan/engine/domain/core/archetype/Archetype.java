package mx.infotec.dads.kukulkan.engine.domain.core.archetype;

import mx.infotec.dads.kukulkan.engine.domain.core.AbstractElement;
import mx.infotec.dads.kukulkan.engine.domain.core.ArchetypeType;

/**
 * The class Archetype is an abstraction of a real archetype or project
 * template.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Archetype extends AbstractElement {
    private static final long serialVersionUID = 1L;

    private ArchetypeType type;

    public ArchetypeType getType() {
        return type;
    }

    public void setType(ArchetypeType type) {
        this.type = type;
    }
}
