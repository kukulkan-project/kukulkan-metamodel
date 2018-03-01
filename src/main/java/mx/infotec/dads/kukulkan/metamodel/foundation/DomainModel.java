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
import java.util.ArrayList;
import java.util.List;

/**
 * The DataModelContext class is an abstraction of the DataModel of the
 * application and it is agnostic technology model.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public abstract class DomainModel implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The domain model group. */
    private List<DomainModelGroup> domainModelGroup;

    /** The generated elements. */
    private List<GeneratedElement> generatedElements = new ArrayList<>();

    /**
     * Instantiates a new domain model.
     */
    public DomainModel() {
    }

    /**
     * Gets the domain model group.
     *
     * @return the domain model group
     */
    public List<DomainModelGroup> getDomainModelGroup() {
        return domainModelGroup;
    }

    /**
     * Sets the domain model group.
     *
     * @param dataModelGroup
     *            the new domain model group
     */
    public void setDomainModelGroup(List<DomainModelGroup> dataModelGroup) {
        this.domainModelGroup = dataModelGroup;
    }

    /**
     * Gets the generated elements.
     *
     * @return the generated elements
     */
    public List<GeneratedElement> getGeneratedElements() {
        return generatedElements;
    }

    /**
     * Sets the generated elements.
     *
     * @param generatedElements
     *            the new generated elements
     */
    public void setGeneratedElements(List<GeneratedElement> generatedElements) {
        this.generatedElements = generatedElements;
    }

    /**
     * Adds the generated element.
     *
     * @param generatedElement
     *            the generated element
     */
    public void addGeneratedElement(GeneratedElement generatedElement) {
        this.generatedElements.add(generatedElement);
    }
}
