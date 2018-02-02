/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.extras.tiles2.dialect.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;

/**
 * Include a Tiles attribute.
 * 
 * @author Daniel Fern&aacute;ndez
 * @since 2.1.0
 */
public class TilesReplaceAttrProcessor
        extends AbstractTilesFragmentHandlingAttrProcessor {


    public static final String ATTR_NAME = "replace";
    public static final int PRECEDENCE = 100;



    public TilesReplaceAttrProcessor() {
        super(ATTR_NAME);
    }

    
    

    @Override
    public int getPrecedence() {
        return PRECEDENCE;
    }

    



    @Override
    protected boolean getReplaceHostElement(final Arguments arguments,
            final Element element, final String attributeName) {
        return true;
    }
    
    
}
