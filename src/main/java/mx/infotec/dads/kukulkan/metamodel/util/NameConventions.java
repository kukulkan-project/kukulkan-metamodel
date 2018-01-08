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
 * NameConventions, it is a constant container which define common naming
 * conventions.
 * 
 * @author Daniel Cortes Pichardo
 */
public class NameConventions {

    /** The Constant REST_CONTROLLER. */
    public static final String REST_CONTROLLER = "Resource";
    
    /** The Constant REST_CONTROLLER. */
    public static final String REST_LAYER_NAME = "web.rest";
    
    /** The Constant SERVICE. */
    public static final String SERVICE = "Service";
    
    /** The Constant SERVICE. */
    public static final String SERVICE_LAYER_NAME = "service";
    
    /** The Constant SERVICE_IMPLEMENTS. */
    public static final String SERVICE_IMPLEMENTS = "ServiceImpl";
    
    /** The Constant DAO. */
    public static final String DAO = "Repository";
    
    /** The Constant DAO. */
    public static final String DAO_LAYER_NAME = "repository";
    
    /** The Constant DAO. */
    public static final String DOMAIN_LAYER_NAME = "domain";
    
    /** The Constant DTO. */
    public static final String DTO = "DTO";
    
    /** The Constant EXCEPTION. */
    public static final String EXCEPTION = "Exception";
    
    /** The Constant CONACYT_DAO. */
    public static final String CONACYT_DAO = "HbDAO";
    
    /** The Constant CONACYT_DAO_IMPLEMENTS. */
    public static final String CONACYT_DAO_IMPLEMENTS = "HbDAOImpl";
    
    /** The Constant CONACYT_DAO_IMPLEMENTS. */
    public static final String JAVA_EXTENSION = ".java";

    /**
     * Instantiates a new name conventions.
     */
    private NameConventions() {
    }
}
