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

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Optional;

import org.apache.metamodel.MetaModelException;

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

public class GeneratorContext extends HashMap<Object, Object> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String version;

    private String description;

    private String license;

    private String homepage;

    private String basePackage;

    private Path outputDir;

    public GeneratorContext() {

    }

    public GeneratorContext(Object key, Object value) {
        this.put(key, value);
    }

    /**
     * Associates the specified value with the specified key in this map. If the map
     * previously contained a mapping for the key, the old value is replaced.
     *
     * @param key
     *            key with which the specified value is to be associated
     * @param value
     *            value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or <tt>null</tt> if
     *         there was no mapping for <tt>key</tt>. (A <tt>null</tt> return can
     *         also indicate that the map previously associated <tt>null</tt> with
     *         <tt>key</tt>.)
     */
    public Object put(Class<?> key, Object value) {
        if (key.isInstance(value)) {
            return super.put(key, value);
        }
        throw new MetaModelException("The :" + value.getClass().getName() + " cannot be cast to " + key.getName());
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code Optional.empty} if this map contains no mapping for the key.
     *
     */
    public <T> Optional<T> get(Class<T> key) {
        Object object = super.get(key);
        if (object != null) {
            return Optional.of(key.cast(object));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Object> get(Object key) {
        Object object = super.get(key);
        if (object != null) {
            return Optional.of(object);
        } else {
            return Optional.empty();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }
}
