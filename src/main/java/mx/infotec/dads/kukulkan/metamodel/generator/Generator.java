package mx.infotec.dads.kukulkan.metamodel.generator;

import java.util.Collection;

/**
 * Generator interface, it is the abstraction of a generation component used for
 * creating custom generators into the platform.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface Generator {

    /**
     * The name of the Generator, it must be unique in all the platform.
     * 
     * @return
     */
    String getName();

    /**
     * The version of the Generator
     * 
     * @return
     */
    String getVersion();

    /**
     * A brieft description of the functionalities of the generator
     * 
     * @return
     */
    String getDescription();

    /**
     * Main key words for searching and classifying
     * 
     * @return
     */
    String getKeywords();

    /**
     * Get the Layer used by the generator.
     * 
     * @return List<Layer>
     */
    Collection<? extends Layer> getLayers();
}
