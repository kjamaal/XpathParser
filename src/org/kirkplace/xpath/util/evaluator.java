package org.kirkplace.xpath.util;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.kirkplace.xpath.objects.XpathException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Evaluator {
	
	public NodeList getNodeNameAndValue(Document doc, XPathExpression xpath)throws XpathException{
		  
		Object result = null;
				
		try {
			
			result = xpath.evaluate(doc, XPathConstants.NODESET);
		} 
		
		catch (XPathExpressionException e){
			throw new  XpathException(e.getMessage());
		}
		
		NodeList nodes = (NodeList) result;
		
		return nodes;
		
	}
}
