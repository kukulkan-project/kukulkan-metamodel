package mx.infotec.dads.kukulkan.metamodel.util;

import java.time.LocalDate;

import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;

/**
 * Defaul Values for most entities
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class DefaultValues {

    private DefaultValues() {
    }

    /**
     * Get default value for ProjectConfiguration object
     * 
     * @return ProjectConfiguration
     */
    public static ProjectConfiguration getDefaulProjectConfiguration() {
        ProjectConfiguration conf = new ProjectConfiguration();
        conf.setAuthor("kukulkan");
        conf.setVersion("0.0.1");
        conf.setYear(String.valueOf(LocalDate.now().getYear()));
        return conf;
    }
}
