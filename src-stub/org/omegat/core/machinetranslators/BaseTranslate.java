/**************************************************************************
  Demo Machine Translation plugin for OmegaT(http://www.omegat.org/)

  This code is only a stub.

  Copyright (C) 2011 Wildrich Fourie
/**************************************************************************
 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 **************************************************************************/

package org.omegat.core.machinetranslators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omegat.gui.exttrans.IMachineTranslation;
import org.omegat.util.Language;


public abstract class BaseTranslate implements IMachineTranslation, ActionListener
{
    public BaseTranslate() {}

    public void actionPerformed(ActionEvent e) {}

    public String getTranslation(Language sLang, Language tLang, String text) throws Exception 
    { return null; }

    abstract protected String getPreferenceName();

    abstract protected String translate(Language sLang, Language tLang, String text) throws Exception;
}