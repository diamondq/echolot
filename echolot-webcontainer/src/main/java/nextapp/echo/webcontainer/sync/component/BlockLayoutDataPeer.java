/*
 * This file (BlockLayoutDataPeer.java) is part of the Echolot Project (hereinafter "Echolot").
 * Copyright (C) 2008-2010 eXXcellent Solutions GmbH.
 *
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 */

package nextapp.echo.webcontainer.sync.component;

import de.exxcellent.echolot.layout.BlockLayoutData;
import nextapp.echo.app.serial.SerialException;
import nextapp.echo.app.serial.SerialUtil;
import nextapp.echo.app.serial.property.CellLayoutDataPeer;
import nextapp.echo.app.util.Context;
import org.w3c.dom.Element;

/**
 * <code>SerialPropertyPeer</code> for <code>BlockLayoutData</code> properties.
 */
public class BlockLayoutDataPeer
extends CellLayoutDataPeer {

    /**
     * @see nextapp.echo.app.serial.SerialPropertyPeer#toXml(nextapp.echo.app.util.Context, java.lang.Class, 
     *      org.w3c.dom.Element, java.lang.Object)
     */
    @Override
    public void toXml(Context context, Class objectClass, Element propertyElement, Object propertyValue) 
    throws SerialException {
        super.toXml(context, objectClass, propertyElement, propertyValue);
        BlockLayoutData layoutData = (BlockLayoutData) propertyValue;
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "height", layoutData.getHeight());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "width", layoutData.getWidth());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "marginLeft", layoutData.getMarginLeft());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "marginRight", layoutData.getMarginRight());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "marginTop", layoutData.getMarginTop());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "marginBottom", layoutData.getMarginBottom());
        SerialUtil.toXml(context, BlockLayoutData.class, propertyElement, "floating", layoutData.getFloating());
    }
}
