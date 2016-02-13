package com.itcooltools.xpath.util;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.itcooltools.xpath.objects.XpathException;

public class Evaluator {
	
	public NodeList getNodeNameAndValue(Document doc, XPathExpression xpath)throws XpathException{
		  
		Object result = null;
				
		try {
			
			result = xpath.evaluate(doc, XPathConstants.NODESET);
		} 
		
		catch (XPathExpressionException e){
			/*
			 * TODO: Improve messaging.
			 */
			throw new  XpathException(e.getMessage());
		}
		
		NodeList nodes = (NodeList) result;
		
		return nodes;
		
	}
	
	public String getXpathStringRep(){
		return null;
	}
}
