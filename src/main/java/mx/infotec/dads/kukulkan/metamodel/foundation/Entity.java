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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * The DataModelElement represent a Table mapped into a specific technology.
 *
 * @author Daniel Cortes Pichardo
 */
public class Entity implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** id of the dataModelElement, it is the primary key. */
    protected PrimaryKey primaryKey;

    /** urlName statements of the elements. */
    protected String urlName;

    /** imports statements of the elements. */
    private Collection<String> imports;

    /**
     * Name of the dataModel, usually it is the name of the Schema formatted for
     * specific technology. For instance, in java it is the java Class name
     */
    protected String name;

    /** The name of the database Table. */
    protected String tableName;

    /**
     * The name of the table formated to java world.
     */
    protected String camelCaseFormat;

    /**
     * The name of the table formated to java world.
     */
    protected String camelCasePluralFormat;

    /** The columns mapped into the PropertyHolder class. */
    protected String qualifiedName;

    /** The columns mapped into the PropertyHolder class. */
    @SuppressWarnings("rawtypes")
    private Collection<Property> properties;

    private List<EntityAssociation> associations;

    /** The generated elements. */
    private List<GeneratedElement> generatedElements = new ArrayList<>();

    /** The has not null elements. */
    protected boolean hasNotNullElements;

    /** The has time properties. */
    protected boolean hasTimeProperties;

    /** The has blob properties. */
    protected boolean hasBlobProperties;

    /** The has clob properties. */
    protected boolean hasClobProperties;

    /** The has constraints. */
    protected boolean hasConstraints;

    /** The has big decimal. */
    protected boolean hasBigDecimal;

    /** The has instant. */
    protected boolean hasInstant;

    /** The has local date. */
    protected boolean hasLocalDate;

    /** The has zone date time. */
    protected boolean hasZoneDateTime;

    /**
     * Checks if is checks for constraints.
     *
     * @return true, if is checks for constraints
     */
    public boolean isHasConstraints() {
        return hasConstraints;
    }

    /**
     * Sets the checks for constraints.
     *
     * @param hasConstraints
     *            the new checks for constraints
     */
    public void setHasConstraints(boolean hasConstraints) {
        this.hasConstraints = hasConstraints;
    }

    /**
     * Checks if is checks for big decimal.
     *
     * @return true, if is checks for big decimal
     */
    public boolean isHasBigDecimal() {
        return hasBigDecimal;
    }

    /**
     * Sets the checks for big decimal.
     *
     * @param hasBigDecimal
     *            the new checks for big decimal
     */
    public void setHasBigDecimal(boolean hasBigDecimal) {
        this.hasBigDecimal = hasBigDecimal;
    }

    /**
     * Checks if is checks for instant.
     *
     * @return true, if is checks for instant
     */
    public boolean isHasInstant() {
        return hasInstant;
    }

    /**
     * Sets the checks for instant.
     *
     * @param hasInstant
     *            the new checks for instant
     */
    public void setHasInstant(boolean hasInstant) {
        this.hasInstant = hasInstant;
    }

    /**
     * Checks if is checks for local date.
     *
     * @return true, if is checks for local date
     */
    public boolean isHasLocalDate() {
        return hasLocalDate;
    }

    /**
     * Sets the checks for local date.
     *
     * @param hasLocalDate
     *            the new checks for local date
     */
    public void setHasLocalDate(boolean hasLocalDate) {
        this.hasLocalDate = hasLocalDate;
    }

    /**
     * Checks if is checks for zone date time.
     *
     * @return true, if is checks for zone date time
     */
    public boolean isHasZoneDateTime() {
        return hasZoneDateTime;
    }

    /**
     * Sets the checks for zone date time.
     *
     * @param hasZoneDateTime
     *            the new checks for zone date time
     */
    public void setHasZoneDateTime(boolean hasZoneDateTime) {
        this.hasZoneDateTime = hasZoneDateTime;
    }

    /**
     * Instantiates a new domain model element.
     */
    private Entity() {

    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the properties.
     *
     * @return the properties
     */
    @SuppressWarnings("rawtypes")
    public Collection<Property> getProperties() {
        return properties;
    }

    /**
     * Sets the properties.
     *
     * @param properties
     *            the new properties
     */
    @SuppressWarnings("rawtypes")
    public void setProperties(Collection<Property> properties) {
        this.properties = properties;
    }

    /**
     * Gets the table name.
     *
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the table name.
     *
     * @param tableName
     *            the new table name
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Gets the camel case format.
     *
     * @return the camel case format
     */
    public String getCamelCaseFormat() {
        return camelCaseFormat;
    }

    /**
     * Sets the camel case format.
     *
     * @param camelCaseFormat
     *            the new camel case format
     */
    public void setCamelCaseFormat(String camelCaseFormat) {
        this.camelCaseFormat = camelCaseFormat;
    }

    /**
     * Gets the url name.
     *
     * @return the url name
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * Sets the url name.
     *
     * @param urlName
     *            the new url name
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     * Gets the imports.
     *
     * @return the imports
     */
    public Collection<String> getImports() {
        return imports;
    }

    /**
     * Sets the imports.
     *
     * @param imports
     *            the new imports
     */
    public void setImports(Collection<String> imports) {
        this.imports = imports;
    }

    /**
     * Gets the primary key.
     *
     * @return the primary key
     */
    public PrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Sets the primary key.
     *
     * @param primaryKey
     *            the new primary key
     */
    public void setPrimaryKey(PrimaryKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * Adds the property.
     *
     * @param propertyHolder
     *            the property holder
     */
    public void addProperty(@SuppressWarnings("rawtypes") Property propertyHolder) {
        properties.add(propertyHolder);
    }

    /**
     * Creates the ordered data model.
     *
     * @return the domain model element
     */
    public static Entity createOrderedDataModel() {
        Entity dme = new Entity();
        dme.setImports(new TreeSet<>());
        dme.setProperties(new TreeSet<>());
        return dme;
    }

    /**
     * Creates the domain model element.
     *
     * @return the domain model element
     */
    public static Entity createDomainModelElement() {
        Entity dme = new Entity();
        dme.setImports(new TreeSet<>());
        dme.setProperties(new ArrayList<>());
        return dme;
    }

    /**
     * Gets the qualified name.
     *
     * @return the qualified name
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    /**
     * Sets the qualified name.
     *
     * @param qualifiedName
     *            the new qualified name
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    /**
     * Checks if is checks for not null elements.
     *
     * @return true, if is checks for not null elements
     */
    public boolean isHasNotNullElements() {
        return hasNotNullElements;
    }

    /**
     * Sets the checks for not null elements.
     *
     * @param hasNotNullElements
     *            the new checks for not null elements
     */
    public void setHasNotNullElements(boolean hasNotNullElements) {
        this.hasNotNullElements = hasNotNullElements;
    }

    /**
     * Checks if is checks for time properties.
     *
     * @return true, if is checks for time properties
     */
    public boolean isHasTimeProperties() {
        return hasTimeProperties;
    }

    /**
     * Sets the checks for time properties.
     *
     * @param hasTimeProperties
     *            the new checks for time properties
     */
    public void setHasTimeProperties(boolean hasTimeProperties) {
        this.hasTimeProperties = hasTimeProperties;
    }

    /**
     * Checks if is checks for blob properties.
     *
     * @return true, if is checks for blob properties
     */
    public boolean isHasBlobProperties() {
        return hasBlobProperties;
    }

    /**
     * Sets the checks for blob properties.
     *
     * @param hasBlobProperties
     *            the new checks for blob properties
     */
    public void setHasBlobProperties(boolean hasBlobProperties) {
        this.hasBlobProperties = hasBlobProperties;
    }

    /**
     * Sets the checks for clob properties.
     *
     * @param hasClobProperties
     *            the new checks for clob properties
     */
    public void setHasClobProperties(boolean hasClobProperties) {
        this.hasClobProperties = hasClobProperties;
    }

    /**
     * Checks if is checks for clob properties.
     *
     * @return true, if is checks for clob properties
     */
    public boolean isHasClobProperties() {
        return hasClobProperties;
    }

    /**
     * Gets the camel case plural format.
     *
     * @return the camel case plural format
     */
    public String getCamelCasePluralFormat() {
        return camelCasePluralFormat;
    }

    /**
     * Sets the camel case plural format.
     *
     * @param camelCasePluralFormat
     *            the new camel case plural format
     */
    public void setCamelCasePluralFormat(String camelCasePluralFormat) {
        this.camelCasePluralFormat = camelCasePluralFormat;
    }

    /**
     * Gets the generated elements.
     *
     * @return the generated elements
     */
    public List<GeneratedElement> getGeneratedElements() {
        return generatedElements;
    }

    /**
     * Sets the generated elements.
     *
     * @param generatedElements
     *            the new generated elements
     */
    public void setGeneratedElements(List<GeneratedElement> generatedElements) {
        this.generatedElements = generatedElements;
    }

    /**
     * Adds the generated element.
     *
     * @param element
     *            the element
     */
    public void addGeneratedElement(GeneratedElement element) {
        this.generatedElements.add(element);
    }

    public List<EntityAssociation> getAssociations() {
        return associations;
    }

    public void setAssociations(List<EntityAssociation> associations) {
        this.associations = associations;
    }
}
