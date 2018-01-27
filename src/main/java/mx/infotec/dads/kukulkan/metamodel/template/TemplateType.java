package mx.infotec.dads.kukulkan.metamodel.template;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TemplateType
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public enum TemplateType {

    ANGULAR_JS("archetypes/angularjs"), 
    JAVA_SPRING_JPA("archetypes/angularjs-spring-jpa"), 
    JAVA_SPRING_MONGO("archetypes/angularjs-spring-mongo"),
    ANTLR4("archetypes/antlr4");

    private Path templatePath;

    private TemplateType(String path) {
        this.templatePath=Paths.get(path);
    }

    public String getTemplatePath(){
        return templatePath.toString();
    }

    public String getFolderName(){
        return templatePath.getFileName().toString();
    }
}
