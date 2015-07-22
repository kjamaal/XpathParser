
package org.kirkplace.xpath;

import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.*;

public class Xpath{

  private DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance(); 
  private DocumentBuilder builder; 
  private Document doc = null;
  private XPath xpath = XPathFactory.newInstance().newXPath();
  private XPathExpression expr;
  
  protected Document buildDoc(String text){
	
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
	  
		
	  return doc;
  }
  
  protected XPathExpression buildXpath(String text) throws Exception{
	  
	  try {
		  
		expr = xpath.compile(text);
	} 
	  catch (Exception e) {
		throw e;
	}
	  return expr;
  }
  
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
  