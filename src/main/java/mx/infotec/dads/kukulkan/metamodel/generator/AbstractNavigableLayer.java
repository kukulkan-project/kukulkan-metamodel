package mx.infotec.dads.kukulkan.metamodel.generator;

import static mx.infotec.dads.kukulkan.metamodel.util.LayerUtils.addAuthoringData;
import static mx.infotec.dads.kukulkan.metamodel.util.LayerUtils.addCommonDataModelElements;

import java.util.Collection;
import java.util.Map;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelElement;
import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelGroup;
import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratorContext;
import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;
import mx.infotec.dads.kukulkan.metamodel.generator.NavigableLayer;

public abstract class AbstractNavigableLayer implements NavigableLayer {

    @Override
    public void process(GeneratorContext context) {
        Map<String, Object> propertiesMap = addAuthoringData(context);
        doBeforeProcessDataModelGroup(context, propertiesMap);
        doForEachDataModelGroupTemplate(context.getProjectConfiguration(),
                context.getDomainModel().getDomainModelGroup(), propertiesMap);
    }

    @Override
    public void doForEachDataModelGroupTemplate(ProjectConfiguration pConf, Collection<DomainModelGroup> dmGroup,
            final Map<String, Object> propertiesMap) {
        for (DomainModelGroup dataModelGroup : dmGroup) {
            doForEachDataModelElement(pConf, dataModelGroup.getDomainModelElements(), propertiesMap,
                    dataModelGroup.getName());
        }
    }

    @Override
    public void doForEachDataModelElement(ProjectConfiguration pConf,
            Collection<DomainModelElement> dmElementCollection, final Map<String, Object> propertiesMap,
            String dmgName) {
        String basePackage = pConf.getPackaging() + dmgName;
        for (DomainModelElement dmElement : dmElementCollection) {
            addCommonDataModelElements(pConf, propertiesMap, basePackage, dmElement);
            visitDomainModelElement(pConf, dmElementCollection, propertiesMap, dmgName, dmElement, basePackage);
        }
    }

    @Override
    public abstract void visitDomainModelElement(ProjectConfiguration pConf,
            Collection<DomainModelElement> dmElementCollection, Map<String, Object> propertiesMap, String dmgName,
            DomainModelElement dmElement, String basePackage);

    @Override
    public void doBeforeProcessDataModelGroup(GeneratorContext context, final Map<String, Object> propertiesMap) {

    }

}
