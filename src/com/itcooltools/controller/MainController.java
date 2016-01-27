package com.itcooltools.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/XML")
	public ModelAndView processXML(HttpServletRequest request){
		String message = request.getParameter("inputXml");
		return new ModelAndView("XML","response",message);
	}
}
