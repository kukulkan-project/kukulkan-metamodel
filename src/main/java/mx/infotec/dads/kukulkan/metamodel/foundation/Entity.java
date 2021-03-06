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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import mx.infotec.dads.kukulkan.metamodel.util.EntityOperator;
import mx.infotec.dads.kukulkan.metamodel.util.LocalDateTimeDeserializer;
import mx.infotec.dads.kukulkan.metamodel.util.LocalDateTimeSerializer;

/**
 * The DataModelElement represent a Table mapped into a specific technology.
 *
 * @author Daniel Cortes Pichardo
 */
public class Entity implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    protected String referencePhysicalName;

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

    /** The entity name in underscore format */
    protected String underscoreName;

    /**
     * The name of the table formated to java world.
     */
    protected String camelCaseFormat;

    /**
     * The name of the table formated to java world.
     */
    protected String camelCasePluralFormat;

    /**
     * The name of the table formated to java world.
     */
    protected String hyphensFormat;

    /**
     * The name of the table formated to java world.
     */
    protected String hyphensPluralFormat;

    /** The columns mapped into the PropertyHolder class. */
    protected String qualifiedName;

    /** The columns mapped into the PropertyHolder class. */
    @SuppressWarnings("rawtypes")
    private Collection<Property> properties;

    private List<EntityAssociation> associations = new ArrayList<>();

    /**
     * The property to show in UI when associated to another entity
     */
    @SuppressWarnings("rawtypes")
    protected Property displayField;

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

    protected boolean hasOneToOne;

    protected boolean hasOneToMany;

    protected boolean hasManyToOne;

    protected boolean hasManyToMany;

    protected boolean hasEntitiesReferences;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private transient LocalDateTime timestamp;

    private transient String timestampString;

    /**
     * Additional features for the entity
     */
    protected Features features = new Features();

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
     * Gets the entity name in underscore format
     * 
     * @return the entity name in underscore format
     */
    public String getUnderscoreName() {
        return underscoreName;
    }

    /**
     * Sets the entity name in underscore format
     * 
     * @param underscoreName
     *            the entity name in underscore format
     */
    public void setUnderscoreName(String underscoreName) {
        this.underscoreName = underscoreName;
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

    public boolean isHasOneToOne() {
        return hasOneToOne;
    }

    public void setHasOneToOne(boolean hasOneToOne) {
        this.hasOneToOne = hasOneToOne;
    }

    public boolean isHasOneToMany() {
        return hasOneToMany;
    }

    public void setHasOneToMany(boolean hasOneToMany) {
        this.hasOneToMany = hasOneToMany;
    }

    public boolean isHasManyToOne() {
        return hasManyToOne;
    }

    public void setHasManyToOne(boolean hasManyToOne) {
        this.hasManyToOne = hasManyToOne;
    }

    public boolean isHasManyToMany() {
        return hasManyToMany;
    }

    public void setHasManyToMany(boolean hasManyToMany) {
        this.hasManyToMany = hasManyToMany;
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
        return Collections.unmodifiableList(associations);
    }

    public void addAssociation(EntityAssociation association) {
        Objects.requireNonNull(association);
        // is owner association
        if (this.name.equals(association.getSource().getName())) {
            if (association.getType().equals(AssociationType.ONE_TO_ONE)
                    || association.getType().equals(AssociationType.MANY_TO_ONE)) {
                this.hasEntitiesReferences = true;
            }
        } else { // is not owner association
            if (association.getType().equals(AssociationType.ONE_TO_MANY)) {
                this.hasEntitiesReferences = true;
            }
        }
        associations.add(association);
    }

    /**
     * Get Associations where the entity is the source element
     * 
     * @return
     */
    public List<EntityAssociation> getOwnerAssociations() {
        return associations.stream().filter(association -> association.getSource().getName().equals(getName()))
                .sorted((o1, o2) -> o1.getTarget().getName().compareTo(o2.getTarget().getName()))
                .collect(Collectors.toList());
    }

    /**
     * Get Associations where the entity is the target element
     * 
     * @return
     */
    public List<EntityAssociation> getNotOwnerAssociations() {
        return associations.stream().filter(association -> association.getTarget().getName().equals(getName()))
                .sorted((o1, o2) -> o1.getSource().getName().compareTo(o2.getSource().getName()))
                .collect(Collectors.toList());
    }

    @SuppressWarnings("rawtypes")
    public Property getDisplayField() {
        return displayField;
    }

    public void setDisplayField(Property<?> displayField) {
        this.displayField = displayField;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Set<EntityReferenceType> getReferenceTypes() {
        return EntityOperator.computeReferenceTypes(this, getAssociations());
    }

    public Set<EntityReference> getEntityReferences() {
        return EntityOperator.computeEntityReferences(this, getAssociations());
    }

    public Set<EntityReferenceType> getFkEntityReferences() {
        return EntityOperator.computeFkEntityReferences(this, getAssociations());
    }

    public List<EntityReferenceType> getConnectedAdjacentReferences() {
        return EntityOperator.computeConnectedAdjacentReferences(this, getAssociations());
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        this.timestampString = String.format("%04d%02d%02d%02d%02d%02d", timestamp.getYear(),
                timestamp.getMonth().getValue(), timestamp.getDayOfMonth(), timestamp.getHour(), timestamp.getMinute(),
                timestamp.getSecond());
    }

    public String getTimestampString() {
        return timestampString;
    }

    public boolean isHasEntitiesReferences() {
        return hasEntitiesReferences;
    }

    public void setHasEntitiesReferences(boolean hasEntitiesReferences) {
        this.hasEntitiesReferences = hasEntitiesReferences;
    }

    public String getHyphensFormat() {
        return hyphensFormat;
    }

    public void setHyphensFormat(String hyphensFormat) {
        this.hyphensFormat = hyphensFormat;
    }

    public String getHyphensPluralFormat() {
        return hyphensPluralFormat;
    }

    public void setHyphensPluralFormat(String hyphensPluralFormat) {
        this.hyphensPluralFormat = hyphensPluralFormat;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entity other = (Entity) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getReferencePhysicalName() {
        return referencePhysicalName;
    }

    public void setReferencePhysicalName(String referencePhysicalName) {
        this.referencePhysicalName = referencePhysicalName;
    }

}
