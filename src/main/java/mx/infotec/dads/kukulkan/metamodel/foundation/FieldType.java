package mx.infotec.dads.kukulkan.metamodel.foundation;

/**
 * Kukulkan DataTypes, this enum has all the FieldType supported by kukulkan KDM
 * micro module
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public enum FieldType {

    /**
     * This is for String types
     */
    STRING("String"),

    /**
     * This is for Integer types
     */
    INTEGER("Integer"),

    /**
     * This is for Long types
     */
    LONG("Long"),

    /**
     * This is for BigDecimal types
     */
    BIG_DECIMAL("BigDecimal"),

    /**
     * This is for Float types
     */
    FLOAT("Float"),

    /**
     * This is for Double types
     */
    DOUBLE("Double"),

    /**
     * This is for Boolean types
     */
    BOOLEAN_TYPE("Boolean"),

    /**
     * This is for LocalDate types
     */
    LOCAL_DATE("LocalDate"),

    /**
     * This is for ZoneDateTime types
     */
    ZONED_DATETIME("ZonedDateTime"),

    /**
     * This is for Instant types
     */
    INSTANT("Instant"),

    /**
     * This is for Blob types
     */
    BLOB("Blob"),

    /**
     * This is for AnyBlob types
     */
    ANY_BLOB("AnyBlob"),

    /**
     * This is for ImageBlob types
     */
    IMAGE_BLOB("ImageBlob"),

    /**
     * This is for TextBlob types
     */
    TEXT_BLOB("TextBlob");

    private final String text;

    private FieldType(String text) {
        this.text = text;
    }

    public String text() {
        return this.text;
    }
}
