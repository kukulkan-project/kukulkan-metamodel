package mx.infotec.dads.kukulkan.metamodel.translator;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModel;
import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;

/**
 * The TranslatorService convert from Generic Type to a DomainModel
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@FunctionalInterface
public interface TranslatorService {

    DomainModel translate(ProjectConfiguration pConf, Source from);
}
