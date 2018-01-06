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
 * DataBaseTypes, represent all the possible database types that kukulkan can
 * map.
 * 
 * @author Daniel Cortes Pichardo
 */
public class DataBaseTypes {
    
    /** The Constant CHAR. */
    /*
     * Literal
     */
    public static final String CHAR = "CHAR";
    
    /** The Constant VARCHAR. */
    public static final String VARCHAR = "VARCHAR";
    
    /** The Constant LONGVARCHAR. */
    public static final String LONGVARCHAR = "LONGVARCHAR";
    
    /** The Constant CLOB. */
    public static final String CLOB = "CLOB";
    
    /** The Constant NCHAR. */
    public static final String NCHAR = "NCHAR";
    
    /** The Constant NVARCHAR. */
    public static final String NVARCHAR = "NVARCHAR";
    
    /** The Constant LONGNVARCHAR. */
    public static final String LONGNVARCHAR = "LONGNVARCHAR";
    
    /** The Constant NCLOB. */
    public static final String NCLOB = "NCLOB";

    /** The Constant TINYINT. */
    /*
     * Numbers
     */
    public static final String TINYINT = "TINYINT";
    
    /** The Constant SMALLINT. */
    public static final String SMALLINT = "SMALLINT";
    
    /** The Constant INTEGER. */
    public static final String INTEGER = "INTEGER";
    
    /** The Constant BIGINT. */
    public static final String BIGINT = "BIGINT";
    
    /** The Constant FLOAT. */
    public static final String FLOAT = "FLOAT";
    
    /** The Constant REAL. */
    public static final String REAL = "REAL";
    
    /** The Constant DOUBLE. */
    public static final String DOUBLE = "DOUBLE";
    
    /** The Constant NUMERIC. */
    public static final String NUMERIC = "NUMERIC";
    
    /** The Constant DECIMAL. */
    public static final String DECIMAL = "DECIMAL";
    
    /** The Constant UUID. */
    public static final String UUID = "UUID";

    /** The Constant DATE. */
    /*
     * Time based
     */
    public static final String DATE = "DATE";
    
    /** The Constant TIME. */
    public static final String TIME = "TIME";
    
    /** The Constant TIMESTAMP. */
    public static final String TIMESTAMP = "TIMESTAMP";

    /** The Constant BIT. */
    /*
     * Booleans
     */
    public static final String BIT = "BIT";
    
    /** The Constant BOOLEAN. */
    public static final String BOOLEAN = "BOOLEAN";

    /** The Constant BINARY. */
    /*
     * Binary types
     */
    public static final String BINARY = "BINARY";
    
    /** The Constant VARBINARY. */
    public static final String VARBINARY = "VARBINARY";
    
    /** The Constant LONGVARBINARY. */
    public static final String LONGVARBINARY = "LONGVARBINARY";
    
    /** The Constant BLOB. */
    public static final String BLOB = "BLOB";

    /** The Constant NULL. */
    /*
     * Other types (as defined in {@link Types}).
     */
    public static final String NULL = "NULL";
    
    /** The Constant OTHER. */
    public static final String OTHER = "OTHER";
    
    /** The Constant JAVA_OBJECT. */
    public static final String JAVA_OBJECT = "JAVA_OBJECT";
    
    /** The Constant DISTINCT. */
    public static final String DISTINCT = "DISTINCT";
    
    /** The Constant STRUCT. */
    public static final String STRUCT = "STRUCT";
    
    /** The Constant ARRAY. */
    public static final String ARRAY = "ARRAY";
    
    /** The Constant REF. */
    public static final String REF = "REF";
    
    /** The Constant DATALINK. */
    public static final String DATALINK = "DATALINK";
    
    /** The Constant ROWID. */
    public static final String ROWID = "ROWID";
    
    /** The Constant SQLXML. */
    public static final String SQLXML = "SQLXML";
    
    /** The Constant INET. */
    public static final String INET = "INET";

    /** The Constant LIST. */
    /*
     * Additional types (added by MetaModel for non-JDBC datastores)
     */
    public static final String LIST = "LIST";
    
    /** The Constant MAP. */
    public static final String MAP = "MAP";
    
    /** The Constant SET. */
    public static final String SET = "SET";
    
    /** The Constant STRING. */
    public static final String STRING = "STRING";
    
    /** The Constant NUMBER. */
    public static final String NUMBER = "NUMBER";

    /**
     * Instantiates a new data base types.
     */
    private DataBaseTypes() {
    }
}
