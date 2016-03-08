package com.itcooltools.xpath.serviceImpl;

import javax.xml.xpath.XPathExpression;

import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.itcooltools.xpath.objects.*;
import com.itcooltools.xpath.util.Evaluator;

public class EvalServiceImpl{
	
	@Autowired
	private XMLDocument docBuilder;
	@Autowired
	private XMLExpression expBuilder;
	@Autowired
	private Evaluator eval = new Evaluator();
	
	public NodeList evaluateXpathExpr(String expression, String document) throws XpathException, NullPointerException{
		/*
		 * TODO: Check for namespace to set xml to namespace aware or not.
		 */
		try{
		docBuilder.setDoc(document, true);
		expBuilder.setExpr(expression);
		}catch(XpathException xe){
			throw xe;
		}catch(NullPointerException ne){
			throw ne;
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
