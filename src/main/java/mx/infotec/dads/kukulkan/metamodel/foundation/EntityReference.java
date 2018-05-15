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

/**
 * The DataModelElement represent a Table mapped into a specific technology.
 *
 * @author Daniel Cortes Pichardo
 */
public class EntityReference implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    private AssociationType type;

    private Entity source;
    private Entity target;
    private String propertyName;
    private String propertyNamePlural;

    public EntityReference(Entity source, Entity target, String propertyName, String propertyNamePlural,
            AssociationType type) {
        this.source = source;
        this.target = target;
        this.propertyName = propertyName;
        this.propertyNamePlural = propertyNamePlural;
        this.type = type;
    }

    public EntityReference(Entity target) {
        this.target = target;
    }

    public Entity getTarget() {
        return target;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getPropertyNamePlural() {
        return propertyNamePlural;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setPropertyNamePlural(String propertyNamePlural) {
        this.propertyNamePlural = propertyNamePlural;
    }

    @Override
    public int hashCode() {
        return target.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return target.equals(obj);
    }

    public Entity getSource() {
        return source;
    }

    public void setSource(Entity source) {
        this.source = source;
    }

    public AssociationType getType() {
        return type;
    }

    public void setType(AssociationType type) {
        this.type = type;
    }
}
