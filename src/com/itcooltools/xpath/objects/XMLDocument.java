package com.itcooltools.xpath.objects;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import org.xml.sax.SAXException;

public class XMLDocument {
	
	private Document doc = null;	
	
	public Document getDoc() {
		return doc;
	}

	public void setDoc(String text, boolean namespace) throws XpathException {
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		
		  try {
			   	domFactory.setNamespaceAware(namespace);				
			   	DocumentBuilder builder = domFactory.newDocumentBuilder();
				doc = builder.parse((InputStream) new ByteArrayInputStream(text.getBytes("UTF-8")));
			} 
		
			catch (SAXException | IOException | ParserConfigurationException e) {
				/*
				 * TODO: Improve messaging
				 */
				throw new XpathException(e.getMessage());
			}
	}
}
