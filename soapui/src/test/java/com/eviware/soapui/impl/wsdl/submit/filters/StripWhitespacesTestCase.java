/*
 * Copyright 2004-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
*/

package com.eviware.soapui.impl.wsdl.submit.filters;

import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;

import org.junit.Test;

import com.eviware.soapui.support.xml.XmlUtils;

public class StripWhitespacesTestCase
{
	public static junit.framework.Test suite()
	{
		return new JUnit4TestAdapter( StripWhitespacesTestCase.class );
	}

	@Test
	public void shouldStripWhitespaces() throws Exception
	{
		assertEquals( "<content/>", XmlUtils.stripWhitespaces( "<content>   </content>" ) );
		assertEquals( "<content><test>bil</test></content>",
				XmlUtils.stripWhitespaces( "<content>  <test>  bil   </test>   </content>" ) );
	}
}
