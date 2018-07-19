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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.CaseFormat;

/**
 * The SchemaPropertiesParser is used for parse common properties of the de E-R
 * model and convert it to java properties.
 *
 * @author Daniel Cortes Pichardo
 */
public class SchemaPropertiesParser {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(SchemaPropertiesParser.class);

    /**
     * Instantiates a new schema properties parser.
     */
    private SchemaPropertiesParser() {

    }

    /**
     * Parses the to property name.
     *
     * @param columnName
     *            the column name
     * @return the string
     */
    public static String parseToPropertyName(String columnName) {
        LOGGER.debug("Parsing the column {}", columnName);
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, columnName);
    }

    public static String databaseNameToFieldName(String columnName) {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, columnName);
    }

    /**
     * Parses the to class name.
     *
     * @param columnName
     *            the column name
     * @return the string
     */
    public static String parseToClassName(String columnName) {
        LOGGER.debug("Parsing the column {}", columnName);
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, columnName);
    }

    public static String parseToDataBaseName(String columnName) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, columnName);
    }

    public static String parseToHyphens(String from) {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, from);
    }

    public static String parseToUnderscore(String columnName) {
        if (columnName == null)
            return null;
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, columnName);
    }

    public static String parsePascalCaseToUnderscore(String pascalCaseString) {
        if (pascalCaseString == null)
            return null;
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, pascalCaseString);
    }

    /**
     * Parses the to upper case first char.
     *
     * @param element
     *            the element
     * @return the string
     */
    public static String parseToUpperCaseFirstChar(String element) {
        LOGGER.debug("Parsing element {}", element);
        return element.replaceFirst(Character.toString(element.charAt(0)),
                Character.toString(element.charAt(0)).toUpperCase());
    }

    /**
     * Parses the to upper case first char.
     *
     * @param element
     *            the element
     * @return the string
     */
    public static String parseToLowerCaseFirstChar(String element) {
        LOGGER.debug("Parsing element {}", element);
        return element.replaceFirst(Character.toString(element.charAt(0)),
                Character.toString(element.charAt(0)).toLowerCase());
    }
}
