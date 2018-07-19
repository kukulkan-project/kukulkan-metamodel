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
 * GrammarPropertyType.
 *
 * @author Daniel Cortes Pichardo
 */
public interface GrammarFieldType extends Serializable {

    /**
     * Gets the grammar field Type.
     *
     * @return the FieldType
     */
    public FieldType getFieldType();

    /**
     * Gets the java name.
     *
     * @return the java name
     */
    public String getJavaName();

    /**
     * Gets the java qualified name.
     *
     * @return the java qualified name
     */
    public String getJavaQualifiedName();

    /**
     * Gets the java equivalent class.
     *
     * @return the java equivalent class
     */
    public Class<?> getJavaEquivalentClass();

    /**
     * Gets the super type.
     *
     * @return the super type
     */
    public SuperColumnType getSuperType();

    /**
     * Checks if is boolean.
     *
     * @return true, if is boolean
     */
    public boolean isBoolean();

    /**
     * Checks if is binary.
     *
     * @return true, if is binary
     */
    public boolean isBinary();

    /**
     * Checks if is number.
     *
     * @return true, if is number
     */
    public boolean isNumber();

    /**
     * Checks if is time based.
     *
     * @return true, if is time based
     */
    public boolean isTimeBased();

    /**
     * Checks if is literal.
     *
     * @return true, if is literal
     */
    public boolean isLiteral();

    /**
     * Checks if is large object.
     *
     * @return true, if is large object
     */
    public boolean isLargeObject();

}
