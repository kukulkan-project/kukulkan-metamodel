package mx.infotec.dads.kukulkan.metamodel.actions;

import mx.infotec.dads.kukulkan.metamodel.context.GeneratorContext;

/**
 * Auditable Action,
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface Auditable {

    void creationAction(GeneratorContext context);

    void modificationAction(GeneratorContext context);

}
