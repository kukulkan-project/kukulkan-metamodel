package mx.infotec.dads.kukulkan.metamodel.template;

/**
 * Template Info is a wrapper or a Template. It represents the main template
 * info that must be processed
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class TemplateInfo {

    /** The name. */
    private String name;

    /** The type. */
    private TemplateType type;

    /**
     * Instantiates a new template info.
     *
     * @param type
     *            the type
     * @param name
     *            the name
     */
    public TemplateInfo(TemplateType type, String name) {
        this.type = type;
        this.name = name;
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
}