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
    private String baseFolder;

    private String filePath;

    /**
     * Instantiates a new template info.
     *
     * @param type
     *            the type
     * @param stringPath
     *            the stringPath
     */
    public TemplateInfo(String baseFolderPath, String filePath) {
        this.baseFolder = baseFolderPath;
        this.setFilePath(filePath);
    }

    public String getBaseFolder() {
        return baseFolder;
    }

    public void setBaseFolder(String baseFolder) {
        this.baseFolder = baseFolder;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTemplatePath() {
        return baseFolder + "/" + filePath;
    }
}