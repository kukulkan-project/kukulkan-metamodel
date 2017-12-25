package mx.infotec.dads.kukulkan.metamodel.generator;

import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratorContext;

/**
 * Layer interface is an abstraction of a physical layer used for describe
 * architectural layers in software development.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface Layer {

    /**
     * The name of the Layer
     * 
     * @return
     */
    String getName();

    /**
     * Process the GeneratorContext in order to generate the target elements
     * 
     * @param context
     */
    void process(GeneratorContext context);

}
