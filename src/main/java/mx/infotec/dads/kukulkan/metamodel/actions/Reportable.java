package mx.infotec.dads.kukulkan.metamodel.actions;

import mx.infotec.dads.kukulkan.metamodel.context.GeneratorContext;
import mx.infotec.dads.kukulkan.metamodel.generator.Layer;

/**
 * Reportable Action,
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface Reportable extends Layer {

    void reportableAction(GeneratorContext context);

}
