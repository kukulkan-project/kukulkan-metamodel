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

import java.io.Serializable;

/**
 * Editor Interface, It represent an Abstract Editor used for Write code.
 *
 * @author Daniel Cortes Pichardo
 */
public interface Editor extends Serializable {

    /**
     * Return the seleted theme.
     *
     * @return the selected theme
     */
    String getTheme();

    /**
     * Return the selected language used in the editor.
     *
     * @return the selected language
     */
    String getLanguage();

    /**
     * It return true if the current editor is just read only, otherwise false.
     *
     * @return true, if is read only
     */
    boolean isReadOnly();

    /**
     * It return true if the current editor is shoGutter, otherwise false.
     *
     * @return true, if is show gutter
     */
    boolean isShowGutter();

    /**
     * It return the number of line where the editor must begin.
     *
     * @return the first line number
     */
    int getFirstLineNumber();
}
