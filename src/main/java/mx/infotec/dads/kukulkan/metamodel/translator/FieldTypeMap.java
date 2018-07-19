package mx.infotec.dads.kukulkan.metamodel.translator;

import mx.infotec.dads.kukulkan.metamodel.foundation.GrammarFieldType;

/**
 * 
 * @author FieldTypeMap
 *
 */
@FunctionalInterface
public interface FieldTypeMap<T> {

    GrammarFieldType fieldTypeFrom(T from);
}
