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

/**
 * The DataModelGroup class, it is a Group element used to represent a package o
 * module in a real application.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class DomainModelGroup implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The name. */
    protected String name;

    /** The brief description. */
    protected String briefDescription;

    /** The description. */
    protected String description;

    /** The domain model elements. */
    private Collection<Entity> entities;

    /** The domain groups */
    private Collection<DomainModelGroup> domainModelGroup;

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
     * Gets the brief description.
     *
     * @return the brief description
     */
    public String getBriefDescription() {
        return briefDescription;
    }

    /**
     * Sets the brief description.
     *
     * @param briefDescription
     *            the new brief description
     */
    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the domain model elements.
     *
     * @return the domain model elements
     */
    public Collection<Entity> getEntities() {
        return entities;
    }

    /**
     * Sets the domain model elements.
     *
     * @param entities
     *            the new domain model elements
     */
    public void setEntities(Collection<Entity> entities) {
        this.entities = entities;
    }

    public Collection<DomainModelGroup> getDomainModelGroup() {
        return domainModelGroup;
    }

    public void setDomainModelGroup(Collection<DomainModelGroup> domainModelGroup) {
        this.domainModelGroup = domainModelGroup;
    }

}
