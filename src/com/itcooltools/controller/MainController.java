package com.itcooltools.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itcooltools.xpath.objects.XpathException;
import com.itcooltools.xpath.serviceImpl.*;
import com.itcooltools.xpath.util.XmlAdapter;

@Controller
public class MainController {

	private EvalServiceImpl xpathService;
	private XmlAdapter xml;
	
	@RequestMapping("/XML")
	public ModelAndView processXML(HttpServletRequest request){
		String doc = request.getParameter("inputXml");
		String xpathExpr = request.getParameter("expression");
		//try{
			return new ModelAndView("XML","response",xpathExpr);//xml.nodeListResponse(xpathService.evaluateXpathExpr(xpathExpr, doc)));
		/*}catch(XpathException ex){
			return new ModelAndView("XML","response",ex.getMessage());
		}*/
	}
}
