package org.kirkplace.xpath.objects;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLDocument {
	
	private DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
	private DocumentBuilder builder;
	private Document doc = null;	
	
	public XMLDocument(String text){
				
		  try {
			   	domFactory.setNamespaceAware(true);				
			   	builder = domFactory.newDocumentBuilder();
				doc = builder.parse((InputStream) new ByteArrayInputStream(text.getBytes("UTF-8")));
			} 
		
			catch (SAXException | IOException | ParserConfigurationException e) {
				
				e.getStackTrace();
				e.getMessage();
				e.getClass();
							
			}
	}
	
	public Document getDocument(){
		return doc;
	}
}
