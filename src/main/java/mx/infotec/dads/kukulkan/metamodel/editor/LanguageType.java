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
package mx.infotec.dads.kukulkan.metamodel.editor;

/**
 * LanguageType for the language supported.
 *
 * @author Daniel Cortes Pichardo
 */
public enum LanguageType {

    /** The xml. */
    XML("xml"),

    /** The sql. */
    SQL("sql"),

    /** The css. */
    CSS("css"),

    /** The json. */
    JSON("json"),

    /** The java. */
    JAVA("java"),

    /** The yaml. */
    YAML("yaml"),

    /** The html. */
    HTML("html"),

    /** The mysql. */
    MYSQL("mysql"),

    /** The csharp. */
    CSHARP("csharp"),

    /** The markdown. */
    MARKDOWN("markdown"),

    /** The javascript. */
    JAVASCRIPT("javascript"),

    /** The typescript. */
    TYPESCRIPT("typescript"),

    /** The freemarker. */
    FREEMARKER("ftl"),

    /** The dockerfile. */
    DOCKERFILE("dockerfile");

    /** The language. */
    private String language;

    /**
     * Instantiates a new language type.
     *
     * @param language
     *            the language
     */
    LanguageType(String language) {
        this.language = language;
    }

    /**
     * Language.
     *
     * @return the string
     */
    public String language() {
        return language;
    }
}
