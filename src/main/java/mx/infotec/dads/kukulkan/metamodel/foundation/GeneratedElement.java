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
import java.nio.file.Path;

import mx.infotec.dads.kukulkan.metamodel.editor.Editor;

/**
 * KukulkanProject represent a generated project.
 *
 * @author Daniel Cortes Pichardo
 */
public class GeneratedElement implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Path where the content must be generated. */
    private Path path;

    /** The simple path. */
    private String simplePath;

    /**
     * The content of the generated Element, it is filled from the freemarker
     * Template.
     */
    private String content;

    /** Properties related to the Editor. */
    private Editor editor;

    /**
     * Instantiates a new generated element.
     */
    public GeneratedElement() {
    }

    /**
     * Instantiates a new generated element.
     *
     * @param path
     *            the path
     * @param simplePath
     *            the simple path
     * @param content
     *            the content
     * @param editor
     *            the editor
     */
    public GeneratedElement(Path path, String simplePath, String content, Editor editor) {
        this.path = path;
        this.setSimplePath(simplePath);
        this.content = content;
        this.editor = editor;
    }

    /**
     * Gets the content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content
     *            the new content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the path.
     *
     * @return the path
     */
    public Path getPath() {
        return path;
    }

    /**
     * Sets the path.
     *
     * @param path
     *            the new path
     */
    public void setPath(Path path) {
        this.path = path;
    }

    /**
     * Gets the editor.
     *
     * @return the editor
     */
    public Editor getEditor() {
        return editor;
    }

    /**
     * Sets the editor.
     *
     * @param editor
     *            the new editor
     */
    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    /**
     * Gets the simple path.
     *
     * @return the simple path
     */
    public String getSimplePath() {
        return simplePath;
    }

    /**
     * Sets the simple path.
     *
     * @param simplePath
     *            the new simple path
     */
    public void setSimplePath(String simplePath) {
        this.simplePath = simplePath;
    }
}
