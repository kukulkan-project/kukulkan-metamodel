package mx.infotec.dads.kukulkan.metamodel.template;

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

    private String templatePath;

    private TemplateType(String path) {
        this.templatePath=path;
    }

    public String getTemplatePath(){
        return templatePath;
    }
}
