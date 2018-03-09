package mx.infotec.dads.kukulkan.metamodel.util;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratedElement;

/**
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class Filter {

    private Filter() {

    }

    public static List<GeneratedElement> filter(List<GeneratedElement> elements, String keyToFind) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(keyToFind);
        return elements.stream().filter(ge -> isInArray(keyToFind, ge.getKeywords())).collect(Collectors.toList());
    }

    public static boolean isInArray(String keyToFind, String[] keywords) {
        Objects.requireNonNull(keyToFind);
        if (keywords == null) {
            return false;
        }
        for (String key : keywords) {
            if (key.equals(keyToFind)) {
                return true;
            }
        }
        return false;
    }
}
