package org.kirkplace.xpath.util;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

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
