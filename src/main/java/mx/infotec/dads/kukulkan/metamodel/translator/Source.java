package mx.infotec.dads.kukulkan.metamodel.translator;

import java.util.Optional;

/**
 * GeneratorSource, it is use by {@link TranslatorService} as parameter
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@FunctionalInterface
public interface Source {

    <T> Optional<T> getSource(Class<T> clazz);
}
