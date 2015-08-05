package org.kirkplace.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

import org.kirkplace.xpath.objects.*;

public class XpathTest {

	@Test
	public void documentCreated(){
		
		/* TODO: Bring in test text from test.xml document */
		
		XMLDocument doc = new XMLDocument("test text");
		
		assertEquals("getDocument must return a org.w3c.dom.Document type object", "org.w3c.dom.Document", doc.getDocument().getClass().toString());
	}
	
}
