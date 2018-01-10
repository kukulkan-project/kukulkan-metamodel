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

import mx.infotec.dads.kukulkan.metamodel.util.PKGenerationStrategy;

// TODO: Auto-generated Javadoc
/**
 * ProrjectConfiguration Class.
 *
 * @author Daniel Cortes Pichardo
 */
public class ProjectConfiguration implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private String id;

    /** The group id. */
    private String groupId;

    /** The version. */
    private String version;

    /** The packaging. */
    private String packaging;

    /** The author. */
    private String author;

    /** The year. */
    private String year;

    /** The output dir. */
    private transient Path outputDir;

    /** The mongo db. */
    private boolean mongoDb;

    /** The global generation type. */
    // Global Generation Types Strategy
    private PKGenerationStrategy globalGenerationType;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the group id.
     *
     * @return the group id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the group id.
     *
     * @param groupId
     *            the new group id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

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
     * Gets the packaging.
     *
     * @return the packaging
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * Sets the packaging.
     *
     * @param packaging
     *            the new packaging
     */
    public void setPackaging(String packaging) {
        this.packaging = packaging;
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
     * Gets the global generation type.
     *
     * @return the global generation type
     */
    public PKGenerationStrategy getGlobalGenerationType() {
        return globalGenerationType;
    }

    /**
     * Sets the global generation type.
     *
     * @param globalGenerationType
     *            the new global generation type
     */
    public void setGlobalGenerationType(PKGenerationStrategy globalGenerationType) {
        this.globalGenerationType = globalGenerationType;
    }

    /**
     * Checks if is mongo db.
     *
     * @return true, if is mongo db
     */
    public boolean isMongoDb() {
        return mongoDb;
    }

    /**
     * Sets the mongo db.
     *
     * @param mongoDb
     *            the new mongo db
     */
    public void setMongoDb(boolean mongoDb) {
        this.mongoDb = mongoDb;
    }

    /**
     * Gets the output dir.
     *
     * @return the output dir
     */
    public Path getOutputDir() {
        return outputDir;
    }

    /**
     * Sets the output dir.
     *
     * @param outputDir
     *            the new output dir
     */
    public void setOutputDir(Path outputDir) {
        this.outputDir = outputDir;
    }

}
