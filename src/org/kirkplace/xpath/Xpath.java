// Provides everything you need to work with the DOM
// Document, Element, Node, NodeList, Text, Exceptions, etc.

package org.kirkplace.xpath;

import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.*;

public class Xpath{

  private DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance(); // get a parser that turns a xml doc into a DOM tree
  private DocumentBuilder builder; // Turns xml into a DOM tree
  private Document doc = null; // xml Document to be parsed
  private XPath xpath = XPathFactory.newInstance().newXPath();
  private XPathExpression expr; // XPath Query
  
  protected Document buildDoc(String text){
	
	  try {
			// parses the file supplied
		   	domFactory.setNamespaceAware(true);				// Provides support for XML namespaces if needed
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
	  
		Object result = null; // returned from query
				
		try {
			
			result = xpath.evaluate(doc, XPathConstants.NODESET); // Returns the result of the query
		} 
		
		catch (XPathExpressionException e){
			
			e.getStackTrace();
			e.getMessage();
			e.getClass();
			throw e;
		}
		
		NodeList nodes = (NodeList) result; // Outputs the results of the query
		
		return nodes;
		
		}	  
}
  