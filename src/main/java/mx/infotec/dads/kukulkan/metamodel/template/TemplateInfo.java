package mx.infotec.dads.kukulkan.metamodel.template;

/**
 * Template Info is a wrapper or a Template. It represents the main template
 * info that must be processed
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class TemplateInfo {

    /** The stringPath. */
    private String stringPath;

    /** The type. */
    private TemplateType type;

    /**
     * Instantiates a new template info.
     *
     * @param type
     *            the type
     * @param stringPath
     *            the stringPath
     */
    public TemplateInfo(TemplateType type, String stringPath) {
        this.type = type;
        this.setStringPath(stringPath);
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public TemplateType getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public void setType(TemplateType type) {
        this.type = type;
    }

    public String getStringPath() {
        return stringPath;
    }

    public void setStringPath(String stringPath) {
        this.stringPath = stringPath;
    }

}