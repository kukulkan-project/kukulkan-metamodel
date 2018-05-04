/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 Daniel Cortes Pichardo
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
package mx.infotec.dads.kukulkan.metamodel.context;

import java.io.Serializable;
import java.nio.file.Path;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Generator Context Class is used for create a set of elements generated
 * for a specific tecnology (Java, C#, Python, and so on). For instance, there
 * could be a set of elements that we would generate per each module of our
 * architecture and each module could be composed by differents elements
 * (controllers, services, data acces elements, and so on) and on each layer
 * there could be elements that we would like to generate, so The context Class
 * encapsulate a set o families of generated elements that could be generated in
 * each tecnology (Java and its frameworks, C# and its frameworks, python and
 * its framework, and so on).
 *
 * @author Daniel Cortes Pichardo
 * @version 1.0.0
 * @since 1.0.0
 */

public abstract class BaseContext implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The id. */
    private String id;

    /** The packaging. */
    private String packaging;

    /** The output dir. */
    @JsonIgnore
    private transient Path outputDir;

    public String getId() {
        return id;
    }

    public String getPackaging() {
        return packaging;
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }

    public BaseContext() {

    }

}
