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

/**
 * BasePathEnum used for initial path.
 *
 * @author Daniel Cortes Pichardo
 */
public enum BasePathEnum {
    
    /** The src main java. */
    SRC_MAIN_JAVA("src/main/java"), 
    
    /** The src test java. */
    SRC_TEST_JAVA("src/test/java"), 
    
    /** The web app entities. */
    WEB_APP_ENTITIES("src/main/webapp/app/entities"),
    
    /** The web app i18n. */
    WEB_APP_I18N("src/main/webapp/i18n"),
    
    /** The web app nav bar. */
    WEB_APP_NAV_BAR("src/main/webapp/app/layouts/navbar"),
    
    /** The web index. */
    WEB_INDEX("src/main/webapp"),
    
    /** The web index. */
    LIQUIBASE_INDEX("src/main/resources/config/liquibase"),
    
    /** The info. */
    INFO("info");

    /** The path. */
    private String path;

    /**
     * Instantiates a new base path enum.
     *
     * @param path the path
     */
    BasePathEnum(String path) {
        this.path = path;
    }

    /**
     * Gets the path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }
}
