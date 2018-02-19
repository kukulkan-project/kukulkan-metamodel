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

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The String Formater Class is used for common String operations.
 *
 * @author Daniel Cortes Pichardo
 */
public class PathProcessor {

    public static final char LINUX_FILE_SEPARATOR = '/';
    public static final char WINDOWS_FILE_SEPARATOR = '\\';

    private Path currentPath;

    private PathProcessor() {

    }

    private PathProcessor(Path currentString) {
        this.currentPath = currentString;
    }

    public static PathProcessor forPath(Path currentPath) {
        return new PathProcessor(currentPath);
    }

    public static PathProcessor forPath(String currentPath) {
        return forPath(Paths.get(currentPath));
    }

    public PathProcessor replaceRegExp(String regex, String replacement) {
        Path replacementPath = Paths.get(currentPath.toString().replaceAll(regex, replacement));
        currentPath = relativize(replacementPath);
        return this;
    }

    public PathProcessor replaceLiteral(String literal, String replacement) {
        String replacementFormated = literal.replace("/", File.separator);
        Path replacementPath = Paths.get(currentPath.toString().replace(replacementFormated, replacement));
        currentPath = relativize(replacementPath);
        return this;
    }

    public PathProcessor joinBefore(String stringJoiner) {
        return joinBefore(Paths.get(stringJoiner));
    }

    public PathProcessor joinBefore(Path joiner) {
        currentPath = joiner.resolve(currentPath);
        return this;
    }

    public PathProcessor joinAfter(String stringJoiner) {
        return joinAfter(Paths.get(stringJoiner));
    }

    public PathProcessor joinAfter(Path joiner) {
        currentPath = currentPath.resolve(joiner);
        return this;
    }

    public Path get() {
        return currentPath;
    }

    public Path getAbsolutePath(String absolutePath) {
        return Paths.get(absolutePath).resolve(currentPath);
    }

    public Path getAbsolutePath(Path absolutePath) {
        return absolutePath.resolve(currentPath);
    }

    private Path relativize(Path from) {
        if (from.toString().charAt(0) == LINUX_FILE_SEPARATOR || from.toString().charAt(0) == WINDOWS_FILE_SEPARATOR) {
            return Paths.get(from.toString().substring(1, from.toString().length()));
        } else {
            return from;
        }
    }
}
