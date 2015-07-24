package org.kirkplace.xpath.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class evaluator {
	
	protected NodeList getNodeNameAndValue(Document doc, XPathExpression xpath)throws XPathExpressionException{
		  
		Object result = null;
				
		try {
			
			result = xpath.evaluate(doc, XPathConstants.NODESET);
		} 
		
		catch (XPathExpressionException e){
			
			e.getStackTrace();
			e.getMessage();
			e.getClass();
			throw e;
		}
		
		NodeList nodes = (NodeList) result;
		
		return nodes;
		
	}
}
