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
package mx.infotec.dads.kukulkan.metamodel.util;

import java.util.Date;

/**
 * SuperGrammarPropertyType.
 *
 * @author Daniel Cortes Pichardo
 */
public enum SuperGrammarPropertyType {

    /** The boolean type. */
    BOOLEAN_TYPE(Boolean.class),

    /** The literal type. */
    LITERAL_TYPE(String.class),

    /** The number type. */
    NUMBER_TYPE(Number.class),

    /** The time type. */
    TIME_TYPE(Date.class),

    /** The binary type. */
    BINARY_TYPE(byte[].class),

    /** The other type. */
    OTHER_TYPE(Object.class);

    /** The java equivalent class. */
    private Class<?> _javaEquivalentClass;

    /**
     * Instantiates a new super grammar property type.
     *
     * @param javaEquivalentClass the java equivalent class
     */
    private SuperGrammarPropertyType(Class<?> javaEquivalentClass) {
        _javaEquivalentClass = javaEquivalentClass;
    }

    /**
     * Gets the java equivalent class.
     *
     * @return a java class that is appropriate for handling column values of
     *         this column super type
     */
    public Class<?> getJavaEquivalentClass() {
        return _javaEquivalentClass;
    }
}