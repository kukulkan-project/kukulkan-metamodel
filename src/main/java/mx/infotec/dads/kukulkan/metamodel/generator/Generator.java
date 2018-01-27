/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2016 Daniel Cortes Pichardo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.kukulkan.metamodel.generator;

import java.util.Collection;

import mx.infotec.dads.kukulkan.metamodel.context.GeneratorContext;

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
     * @return the name
     */
    String getName();

    /**
     * The version of the Generator.
     *
     * @return the version
     */
    String getVersion();

    /**
     * A brieft description of the functionalities of the generator.
     *
     * @return the description
     */
    String getDescription();

    /**
     * Main key words for searching and classifying.
     *
     * @return the keywords
     */
    String getKeywords();

    /**
     * Get the Layer used by the generator.
     * 
     * @return List<Layer>
     */
    @Deprecated
    Collection<? extends Layer> getLayers();

    /**
     * Process the GeneratorContext in order to generate the target elements.
     *
     * @param context
     *            the context
     */
    void process(GeneratorContext context);

}
