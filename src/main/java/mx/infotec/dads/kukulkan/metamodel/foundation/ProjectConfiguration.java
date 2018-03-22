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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import mx.infotec.dads.kukulkan.metamodel.context.BaseContext;
import mx.infotec.dads.kukulkan.metamodel.util.LocalDateTimeDeserializer;
import mx.infotec.dads.kukulkan.metamodel.util.LocalDateTimeSerializer;

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

    private List<String> layers = new ArrayList<>();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime timestamp = LocalDateTime.now();

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
     * @param database
     *            the new database
     */
    public void setDatabase(Database database) {
        this.database = database;
    }

    public List<String> getLayers() {
        return layers;
    }

    public void setLayers(List<String> layers) {
        this.layers = layers;
    }

    public boolean containsLayer(String layerName) {
        return layers.contains(layerName);
    }

    public void addLayers(String... layerNames) {
        for (String layerName : layerNames) {
            layers.add(layerName);
        }
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
