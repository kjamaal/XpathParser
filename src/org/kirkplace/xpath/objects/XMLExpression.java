package org.kirkplace.xpath.objects;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class XMLExpression {
	
	private XPathExpression expr;
	
	
	
	public XPathExpression getExpr() {
		return expr;
	}

	public void setExpr(String text) throws XpathException{
		XPath xpath = XPathFactory.newInstance().newXPath();
		
		try {
			  
			expr = xpath.compile(text);
		} 
		  catch (Exception e) {
			throw new XpathException(e.getMessage());
		}
	}
}