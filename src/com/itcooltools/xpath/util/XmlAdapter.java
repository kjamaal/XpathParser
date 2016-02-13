package com.itcooltools.xpath.util;

import org.w3c.dom.NodeList;

public class XmlAdapter {
	
	/*
	 * TODO: wrap NodeList into whatever response object the UI is expecting.
	 */
	public Object nodeListResponse(NodeList list){
		/*
		 * todo: hook into EvalServiceImpl to run evaluateXpathExpr
		 */
		return null;
	}
	
	public Object xpathStringRepResponse(String xpath){
		return null;
	}
}
