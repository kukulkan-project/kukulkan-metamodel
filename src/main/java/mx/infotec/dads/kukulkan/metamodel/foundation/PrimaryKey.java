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
package mx.infotec.dads.kukulkan.metamodel.foundation;

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;

import mx.infotec.dads.kukulkan.metamodel.util.PKGenerationStrategy;

/**
 * PrimaryKey container for PrimaryKey descriptio.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.0.0
 * @since 1.0.0
 */

public class PrimaryKey implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The name. */
    private String name;

    /** The type. */
    private String type;

    /** The qualified label. */
    private String qualifiedLabel;

    /** The properties. */
    @SuppressWarnings("rawtypes")
    private Collection<Property> properties;

    /** The is composed. */
    private boolean isComposed;

    /** The generation type. */
    private PKGenerationStrategy generationType;

    /**
     * Adds the property.
     *
     * @param propertyHolder
     *            the property holder
     * @return true, if successful
     */
    @SuppressWarnings("rawtypes")
    public boolean addProperty(Property propertyHolder) {
        return properties.add(propertyHolder);
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Checks if is composed.
     *
     * @return true, if is composed
     */
    public boolean isComposed() {
        return isComposed;
    }

    /**
     * Sets the composed.
     *
     * @param isComposed
     *            the new composed
     */
    public void setComposed(boolean isComposed) {
        this.isComposed = isComposed;
    }

    /**
     * Gets the qualified label.
     *
     * @return the qualified label
     */
    public String getQualifiedLabel() {
        return qualifiedLabel;
    }

    /**
     * Sets the qualified label.
     *
     * @param qualifiedLabel
     *            the new qualified label
     */
    public void setQualifiedLabel(String qualifiedLabel) {
        this.qualifiedLabel = qualifiedLabel;
    }

    /**
     * Gets the generation type.
     *
     * @return the generation type
     */
    public PKGenerationStrategy getGenerationType() {
        return generationType;
    }

    /**
     * Sets the generation type.
     *
     * @param generationType
     *            the new generation type
     */
    public void setGenerationType(PKGenerationStrategy generationType) {
        this.generationType = generationType;
    }

    /**
     * Gets the properties.
     *
     * @return the properties
     */
    @SuppressWarnings("rawtypes")
    public Collection<Property> getProperties() {
        return properties;
    }

    /**
     * Sets the properties.
     *
     * @param properties
     *            the new properties
     */
    @SuppressWarnings("rawtypes")
    public void setProperties(Collection<Property> properties) {
        this.properties = properties;
    }

    /**
     * Creates the ordered data model.
     *
     * @return the primary key
     */
    public static PrimaryKey createOrderedDataModel() {
        PrimaryKey pk = new PrimaryKey();
        pk.setProperties(new TreeSet<>());
        return pk;
    }
}
