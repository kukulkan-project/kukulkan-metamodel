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

/**
 * Constraint Class, This class represent a Constraint applied to a column in a
 * table.
 *
 * @author Daniel Cortes Pichardo
 */
public class Constraint implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Is column nullable. */
    private boolean nullable = true;

    /** Is the property primaryKey. */
    private boolean primaryKey;

    /** the name of the primaryKey. */
    private String primaryKeyName;

    /** Is unique. */
    private boolean unique;

    /** The uniqueConstraint. */
    private boolean uniqueConstraintName;

    /** referenced in other tables. */
    private String references;

    /** the foreign key name. */
    private String foreignKeyName;

    /** is cascade delete. */
    private boolean deleteCascade;

    /** Are constraints deferrable. */
    private boolean deferrable;

    /** Are constraints initially deferred *. */
    private boolean initiallyDeferred;

    /** is indexed. */
    private boolean indexed;

    /** Min value of the property. */
    private String min;

    /** Max value of the property. */
    private String max;

    /** Pattern. */
    private String pattern;

    /**
     * Checks if is nullable.
     *
     * @return true, if is nullable
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the nullable.
     *
     * @param nullable
     *            the new nullable
     */
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    /**
     * Checks if is primary key.
     *
     * @return true, if is primary key
     */
    public boolean isPrimaryKey() {
        return primaryKey;
    }

    /**
     * Sets the primary key.
     *
     * @param primaryKey
     *            the new primary key
     */
    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * Gets the primary key name.
     *
     * @return the primary key name
     */
    public String getPrimaryKeyName() {
        return primaryKeyName;
    }

    /**
     * Sets the primary key name.
     *
     * @param primaryKeyName
     *            the new primary key name
     */
    public void setPrimaryKeyName(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
    }

    /**
     * Checks if is unique.
     *
     * @return true, if is unique
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the unique.
     *
     * @param unique
     *            the new unique
     */
    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    /**
     * Checks if is unique constraint name.
     *
     * @return true, if is unique constraint name
     */
    public boolean isUniqueConstraintName() {
        return uniqueConstraintName;
    }

    /**
     * Sets the unique constraint name.
     *
     * @param uniqueConstraintName
     *            the new unique constraint name
     */
    public void setUniqueConstraintName(boolean uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    /**
     * Gets the references.
     *
     * @return the references
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets the references.
     *
     * @param references
     *            the new references
     */
    public void setReferences(String references) {
        this.references = references;
    }

    /**
     * Gets the foreign key name.
     *
     * @return the foreign key name
     */
    public String getForeignKeyName() {
        return foreignKeyName;
    }

    /**
     * Sets the foreign key name.
     *
     * @param foreignKeyName
     *            the new foreign key name
     */
    public void setForeignKeyName(String foreignKeyName) {
        this.foreignKeyName = foreignKeyName;
    }

    /**
     * Checks if is delete cascade.
     *
     * @return true, if is delete cascade
     */
    public boolean isDeleteCascade() {
        return deleteCascade;
    }

    /**
     * Sets the delete cascade.
     *
     * @param deleteCascade
     *            the new delete cascade
     */
    public void setDeleteCascade(boolean deleteCascade) {
        this.deleteCascade = deleteCascade;
    }

    /**
     * Checks if is deferrable.
     *
     * @return true, if is deferrable
     */
    public boolean isDeferrable() {
        return deferrable;
    }

    /**
     * Sets the deferrable.
     *
     * @param deferrable
     *            the new deferrable
     */
    public void setDeferrable(boolean deferrable) {
        this.deferrable = deferrable;
    }

    /**
     * Checks if is initially deferred.
     *
     * @return true, if is initially deferred
     */
    public boolean isInitiallyDeferred() {
        return initiallyDeferred;
    }

    /**
     * Sets the initially deferred.
     *
     * @param initiallyDeferred
     *            the new initially deferred
     */
    public void setInitiallyDeferred(boolean initiallyDeferred) {
        this.initiallyDeferred = initiallyDeferred;
    }

    /**
     * Checks if is indexed.
     *
     * @return true, if is indexed
     */
    public boolean isIndexed() {
        return indexed;
    }

    /**
     * Sets the indexed.
     *
     * @param indexed
     *            the new indexed
     */
    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }

    /**
     * Gets the min length.
     *
     * @return the min length
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the min length.
     *
     * @param minLength
     *            the new min length
     */
    public void setMin(String minLength) {
        this.min = minLength;
    }

    /**
     * Gets the max length.
     *
     * @return the max length
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the max length.
     *
     * @param maxLength
     *            the new max length
     */
    public void setMax(String maxLength) {
        this.max = maxLength;
    }


    /**
     * Gets the pattern.
     *
     * @return the pattern
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the pattern.
     *
     * @param pattern
     *            the new pattern
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
