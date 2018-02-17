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

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The String Formater Class is used for common String operations.
 *
 * @author Daniel Cortes Pichardo
 */
public class PathProcessor {

    private Path currentPath;

    private PathProcessor() {

    }

    private PathProcessor(String currentString) {
        this.currentPath = Paths.get(currentString);
    }

    private PathProcessor(Path currentString) {
        this.currentPath = currentString;
    }

    public static PathProcessor forPath(Path currentPath) {
        return new PathProcessor(currentPath);
    }

    public PathProcessor replaceRegExp(String regex, String replacement) {
        Path replacedPath = Paths.get(currentPath.toString().replaceAll(regex, replacement));
        currentPath = relativizePath(replacedPath);
        return this;
    }

    public PathProcessor replaceLiteral(String literal, String replacement) {
        Path replacedPath = Paths.get(currentPath.toString().replace(literal, replacement));
        currentPath = relativizePath(replacedPath);
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

    private static Path relativizePath(Path replacedPath) {
        Path resolvePath = Paths.get("/").resolve(replacedPath);
        return Paths.get("/").relativize(resolvePath);
    }

    public static void main(String[] args) {
        Path path = Paths.get("template/archetype/src/main/java/package/controller/JavaApp.java.ftl");
        Path home = Paths.get(System.getProperty("user.home"));
        Path path3 = PathProcessor.forPath(path).replaceRegExp("template[\\/]archetype", "").joinBefore(home).get();
        System.out.println(path3);
    }

}
