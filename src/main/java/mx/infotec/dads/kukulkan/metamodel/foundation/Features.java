/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 Roberto Villarejo Martínez
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

public class Features implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8832065479223989018L;

    /**
     * A flag that indicates if an entity should be shown as 'sheet' in GUI
     */
    private boolean sheetable = false;

    /**
     * A flag that indicates if an entity should be 'auditable', i.e. should have
     * additional properties like 'createdBy', 'createdDate', 'lastModifiedBy',
     * 'lastModifiedDate'
     */
    private boolean auditable = false;

    public boolean isSheetable() {
        return sheetable;
    }

    public void setSheetable(boolean sheetable) {
        this.sheetable = sheetable;
    }

    public boolean isAuditable() {
        return auditable;
    }

    public void setAuditable(boolean auditable) {
        this.auditable = auditable;
    }

}
