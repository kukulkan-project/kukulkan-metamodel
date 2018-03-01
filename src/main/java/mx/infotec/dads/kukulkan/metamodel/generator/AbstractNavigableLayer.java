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
package mx.infotec.dads.kukulkan.metamodel.generator;

import static mx.infotec.dads.kukulkan.metamodel.util.LayerUtils.addAuthoringData;
import static mx.infotec.dads.kukulkan.metamodel.util.LayerUtils.addCommonDataModelElements;
import static mx.infotec.dads.kukulkan.metamodel.util.Validator.requiredNotEmpty;

import java.util.Collection;
import java.util.Map;

import mx.infotec.dads.kukulkan.metamodel.context.GeneratorContext;
import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModel;
import mx.infotec.dads.kukulkan.metamodel.foundation.Entity;
import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelGroup;
import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;
import mx.infotec.dads.kukulkan.metamodel.generator.NavigableLayer;

/**
 * Abstract Navigable Layer, It is a Base Navigable Layer Template used for
 * implements commons operation needed for process each layer in most of
 * generators.
 *
 * @author Daniel Cortes Pichardo
 */
public abstract class AbstractNavigableLayer implements NavigableLayer {

    /*
     * (non-Javadoc)
     * 
     * @see
     * mx.infotec.dads.kukulkan.metamodel.generator.Layer#process(mx.infotec.
     * dads.kukulkan.metamodel.foundation.GeneratorContext)
     */
    @Override
    public void process(GeneratorContext context) {
        ProjectConfiguration pConf = requiredNotEmpty(context.get(ProjectConfiguration.class));
        DomainModel domaiModel = requiredNotEmpty(context.get(DomainModel.class));
        Map<String, Object> propertiesMap = addAuthoringData(context);
        doBeforeProcessDataModelGroup(context, propertiesMap);
        doForEachDataModelGroupTemplate(pConf, domaiModel.getDomainModelGroup(), propertiesMap);
    }

    /*
     * (non-Javadoc)
     * 
     * @see mx.infotec.dads.kukulkan.metamodel.generator.NavigableLayer#
     * doForEachDataModelGroupTemplate(mx.infotec.dads.kukulkan.metamodel.
     * foundation.ProjectConfiguration, java.util.Collection, java.util.Map)
     */
    @Override
    public void doForEachDataModelGroupTemplate(ProjectConfiguration pConf, Collection<DomainModelGroup> dmGroup,
            final Map<String, Object> propertiesMap) {
        for (DomainModelGroup dataModelGroup : dmGroup) {
            doForEachDataModelElement(pConf, dataModelGroup.getEntities(), propertiesMap,
                    dataModelGroup.getName());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see mx.infotec.dads.kukulkan.metamodel.generator.NavigableLayer#
     * doForEachDataModelElement(mx.infotec.dads.kukulkan.metamodel.foundation.
     * ProjectConfiguration, java.util.Collection, java.util.Map,
     * java.lang.String)
     */
    @Override
    public void doForEachDataModelElement(ProjectConfiguration pConf,
            Collection<Entity> dmElementCollection, final Map<String, Object> propertiesMap,
            String dmgName) {
        String basePackage = pConf.getPackaging() + dmgName;
        for (Entity dmElement : dmElementCollection) {
            addCommonDataModelElements(pConf, propertiesMap, basePackage, dmElement);
            visitDomainModelElement(pConf, dmElementCollection, propertiesMap, dmgName, dmElement, basePackage);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see mx.infotec.dads.kukulkan.metamodel.generator.NavigableLayer#
     * doBeforeProcessDataModelGroup(mx.infotec.dads.kukulkan.metamodel.
     * foundation.GeneratorContext, java.util.Map)
     */
    @Override
    public void doBeforeProcessDataModelGroup(GeneratorContext context, final Map<String, Object> propertiesMap) {

    }

}
