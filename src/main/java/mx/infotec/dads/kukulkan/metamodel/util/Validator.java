package mx.infotec.dads.kukulkan.metamodel.util;

import java.util.Optional;

/**
 * Validator
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Validator {

    private Validator() {
    }

    public static <T> T requiredNotEmpty(Optional<T> optional) {
        return requiredNotEmpty(optional, "this value cannot be null or empty");
    }

    public static <T> T requiredNotEmpty(Optional<T> optional, String message) {
        if (optional != null && optional.isPresent()) {
            return optional.get();
        } else {
            throw new MetaModelException(message);
        }
    }
}
