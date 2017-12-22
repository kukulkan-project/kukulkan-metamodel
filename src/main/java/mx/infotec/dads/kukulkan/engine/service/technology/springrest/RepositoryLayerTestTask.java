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
package mx.infotec.dads.kukulkan.engine.service.technology.springrest;

import static mx.infotec.dads.kukulkan.engine.service.layers.LayerUtils.addCommonDataModelElements;
import static mx.infotec.dads.kukulkan.engine.util.JavaFileNameParser.formatToPackageStatement;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import mx.infotec.dads.kukulkan.engine.domain.core.DomainModelElement;
import mx.infotec.dads.kukulkan.engine.domain.core.ProjectConfiguration;
import mx.infotec.dads.kukulkan.engine.service.layers.util.LayerConstants;
import mx.infotec.dads.kukulkan.engine.templating.service.TemplateService;
import mx.infotec.dads.kukulkan.engine.util.BasePathEnum;

/**
 * Repository Layer Test Task
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class RepositoryLayerTestTask extends AbstractSpringRestLayerTask {

    @Autowired
    private TemplateService templateService;

    @Override
    public void doForEachDataModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            Map<String, Object> model, String dmgName) {
        String basePackage = pConf.getPackaging() + dmgName;
        for (DomainModelElement dmElement : dmElementCollection) {
            addCommonDataModelElements(pConf, model, basePackage, dmElement);
            model.put("package", formatToPackageStatement(basePackage, pConf.getDaoLayerName()));
            templateService.fillModel(dmElement, pConf.getId(),
                    LayerConstants.REST_SPRING_JPA_BACK_END_URL + "/repository.ftl", model, BasePathEnum.SRC_TEST_JAVA,
                    basePackage.replace('.', '/') + "/" + dmgName + "/" + pConf.getDaoLayerName() + "/"
                            + dmElement.getName() + "Repository.java");
        }
    }

    @Override
    public void visitDomainModelElement(ProjectConfiguration pConf, Collection<DomainModelElement> dmElementCollection,
            Map<String, Object> propertiesMap, String dmgName, DomainModelElement dmElement, String basePackage) {
        // TODO Auto-generated method stub
        
    }

}
