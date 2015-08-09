package org.kirkplace.xpath.serviceImpl;

import javax.xml.xpath.XPathExpression;

import org.kirkplace.xpath.objects.*;
import org.kirkplace.xpath.util.Evaluator;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class EvalServiceImpl{
	
	private XMLDocument docBuilder;
	private XMLExpression expBuilder;
	private Evaluator eval = new Evaluator();
	
	public NodeList evaluateXpathExpr(String expression, String document) throws XpathException{
		/*
		 * TODO: Check for namespace to set xml to namespace aware or not.
		 */
		try{
		docBuilder.setDoc(document, true);
		expBuilder.setExpr(expression);
		}catch(XpathException xe){
			throw xe;
		}
		Document doc = docBuilder.getDoc();
		XPathExpression expr = expBuilder.getExpr();
		
		try{
			return eval.getNodeNameAndValue(doc, expr);
		}catch(XpathException xe){
			throw xe;
		}
	}
	
	public String generateXpathExpr(){
		
		
		return null;
	}
}
