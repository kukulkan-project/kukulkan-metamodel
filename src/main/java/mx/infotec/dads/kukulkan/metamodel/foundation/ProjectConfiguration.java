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

import mx.infotec.dads.kukulkan.metamodel.context.BaseContext;

/**
 * ProrjectConfiguration Class.
 *
 * @author Daniel Cortes Pichardo
 */
public class ProjectConfiguration extends BaseContext {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The version. */
    private String version;

    /** The author. */
    private String author;

    /** The year. */
    private String year;

    /** The database type. */
    private Database database;

    /** The frontEndTechnology. */
    private String frontEndTechnology;

    /**  The backEndTechnology. */
    private String backEndTechnology;

    /**
     * Gets the version.
     *
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the new version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     *
     * @param author
     *            the new author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year.
     *
     * @param year
     *            the new year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Gets the front end technology.
     *
     * @return the front end technology
     */
    public String getFrontEndTechnology() {
        return frontEndTechnology;
    }

    /**
     * Sets the front end technology.
     *
     * @param frontEndTechnology the new front end technology
     */
    public void setFrontEndTechnology(String frontEndTechnology) {
        this.frontEndTechnology = frontEndTechnology;
    }

    /**
     * Gets the back end technology.
     *
     * @return the back end technology
     */
    public String getBackEndTechnology() {
        return backEndTechnology;
    }

    /**
     * Sets the back end technology.
     *
     * @param backEndTechnology the new back end technology
     */
    public void setBackEndTechnology(String backEndTechnology) {
        this.backEndTechnology = backEndTechnology;
    }

    /**
     * Gets the database.
     *
     * @return the database
     */
    public Database getDatabase() {
        return database;
    }

    /**
     * Sets the database.
     *
     * @param database the new database
     */
    public void setDatabase(Database database) {
        this.database = database;
    }

}
