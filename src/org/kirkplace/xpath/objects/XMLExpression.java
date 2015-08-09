package org.kirkplace.xpath.objects;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
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
		  catch (XPathExpressionException e) {
			  /*
			   * TODO: Improve messaging.
			   */
			throw new XpathException(e.getMessage());
		}
	}
}