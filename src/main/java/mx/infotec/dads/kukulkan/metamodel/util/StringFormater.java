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

import static java.util.regex.Matcher.quoteReplacement;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The String Formater Class is used for common String operations.
 *
 * @author Daniel Cortes Pichardo
 */
public class StringFormater {

    public static final String DOT_REGEXP = "\\.";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(StringFormater.class);

    /**
     * Instantiates a new file util.
     */
    private StringFormater() {
    }

    /**
     * 
     * @param stringWithDots
     * @return
     */
    public static String replaceDotByFileSeparator(String stringWithDots) {
        Objects.requireNonNull(stringWithDots);
        return stringWithDots.replaceAll(DOT_REGEXP, quoteReplacement(File.separator));
    }

    /**
     * pathToRegExp convert a Path class to a String RegExp. For example, the
     * path "/home/user/" turns into "[\/]home[\/]user[\/]"
     * 
     * @param path
     * @return
     */
    public static String pathToRegExp(Path path) {
        char[] wordArray = path.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char letter : wordArray) {
            if (letter == '/' || letter == '\\') {
                sb.append("[\\/]");
            } else {
                sb.append(letter);
            }
        }
        return sb.toString();
    }   
}
