package mx.infotec.dads.kukulkan.metamodel.generator;

import java.util.Collection;
import java.util.Map;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelElement;
import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelGroup;
import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratorContext;
import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;

public interface NavigableLayer extends Layer {

    /**
     * Do for each Data Model Group
     * 
     * @param pConf
     * @param dmGroup
     * @param propertiesMap
     */
    void doForEachDataModelGroupTemplate(ProjectConfiguration pConf, Collection<DomainModelGroup> dmGroup,
            final Map<String, Object> propertiesMap);

    /**
     * 
     * @param pConf
     * @param dmElementCollection
     * @param propertiesMap
     * @param dmgName
     */
    void doForEachDataModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            final Map<String, Object> propertiesMap, String dmgName);

    /**
     * 
     * @param pConf
     * @param dmElementCollection
     * @param propertiesMap
     * @param dmgName
     * @param dmElement
     * @param basePackage
     */
    void visitDomainModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            Map<String, Object> propertiesMap, String dmgName, DomainModelElement dmElement, String basePackage);

    /**
     * doBeforeProcessDataModelGroup, It is used for add new functionality
     * before process each DataModelGroup. General information could be added
     * here
     * 
     * @param context
     * @param propertiesMap
     */
    public void doBeforeProcessDataModelGroup(GeneratorContext context, final Map<String, Object> propertiesMap);

}
