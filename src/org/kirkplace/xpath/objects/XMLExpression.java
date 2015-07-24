package org.kirkplace.xpath.objects;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class XMLExpression {
	
	private XPathExpression expr;
	private XPath xpath = XPathFactory.newInstance().newXPath();
	  	
	public XPathExpression buildXpath(String text) throws Exception{
		  
		  try {
			  
			expr = xpath.compile(text);
		} 
		  catch (Exception e) {
			throw e;
		}
		  return expr;
	  }
}
