package mx.infotec.dads.kukulkan.metamodel.editor;

import java.io.Serializable;

/**
 * Editor Interface, It represent an Abstract Editor used for Write code
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public interface Editor extends Serializable {

    /**
     * Return the seleted theme
     * 
     * @return the selected theme
     */
    String getTheme();

    /**
     * Return the selected language used in the editor
     * 
     * @return the selected language
     */
    String getLanguage();

    /**
     * It return true if the current editor is just read only, otherwise false
     * 
     * @return
     */
    boolean isReadOnly();

    /**
     * It return true if the current editor is shoGutter, otherwise false
     * 
     * @return
     */
    boolean isShowGutter();

    /**
     * It return the number of line where the editor must begin
     * 
     * @return the first line number
     */
    int getFirstLineNumber();
}
