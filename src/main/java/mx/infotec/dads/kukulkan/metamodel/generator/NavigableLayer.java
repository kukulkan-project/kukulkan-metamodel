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

import java.util.Collection;
import java.util.Map;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelElement;
import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModelGroup;
import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratorContext;
import mx.infotec.dads.kukulkan.metamodel.foundation.ProjectConfiguration;

/**
 * The Interface NavigableLayer.
 */
public interface NavigableLayer extends Layer {

    /**
     * Do for each Data Model Group.
     *
     * @param pConf the conf
     * @param dmGroup the dm group
     * @param propertiesMap the properties map
     */
    void doForEachDataModelGroupTemplate(ProjectConfiguration pConf, Collection<DomainModelGroup> dmGroup,
            final Map<String, Object> propertiesMap);

    /**
     * Do for each data model element.
     *
     * @param pConf the conf
     * @param dmElementCollection the dm element collection
     * @param propertiesMap the properties map
     * @param dmgName the dmg name
     */
    void doForEachDataModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            final Map<String, Object> propertiesMap, String dmgName);

    /**
     * Visit domain model element.
     *
     * @param pConf the conf
     * @param dmElementCollection the dm element collection
     * @param propertiesMap the properties map
     * @param dmgName the dmg name
     * @param dmElement the dm element
     * @param basePackage the base package
     */
    void visitDomainModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            Map<String, Object> propertiesMap, String dmgName, DomainModelElement dmElement, String basePackage);

    /**
     * doBeforeProcessDataModelGroup, It is used for add new functionality
     * before process each DataModelGroup. General information could be added
     * here
     *
     * @param context the context
     * @param propertiesMap the properties map
     */
    public void doBeforeProcessDataModelGroup(GeneratorContext context, final Map<String, Object> propertiesMap);

}
