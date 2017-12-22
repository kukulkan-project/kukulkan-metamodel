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
package mx.infotec.dads.kukulkan.engine.util;

/**
 * BasePathEnum used for initial path
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public enum BasePathEnum {
    SRC_MAIN_JAVA("src/main/java"), 
    SRC_TEST_JAVA("src/test/java"), 
    WEB_APP_ENTITIES("src/main/webapp/app/entities"),
    WEB_APP_I18N("src/main/webapp/i18n"),
    WEB_APP_NAV_BAR("src/main/webapp/app/layouts/navbar"),
    WEB_INDEX("src/main/webapp"),
    INFO("info");

    private String path;

    BasePathEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
