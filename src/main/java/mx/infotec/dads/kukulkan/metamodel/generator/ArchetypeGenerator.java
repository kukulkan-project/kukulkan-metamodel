package mx.infotec.dads.kukulkan.metamodel.generator;

import static mx.infotec.dads.kukulkan.metamodel.util.Validator.requiredNotEmpty;

import mx.infotec.dads.kukulkan.metamodel.context.GeneratorContext;

/**
 * ArchetypeGenerator
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public abstract class ArchetypeGenerator<T> implements Generator {

    @Override
    public void process(GeneratorContext context) {
        Class<T> typeParameterClass = null;
        T particularContext = requiredNotEmpty(context.get(typeParameterClass));
    }
}
