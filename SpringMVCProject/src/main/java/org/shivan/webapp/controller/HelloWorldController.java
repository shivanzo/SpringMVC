package org.shivan.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String data(@RequestParam("studentName") String theName, Model model) {
		
		
		theName = theName.toUpperCase();
		
		String result = "YO!" + theName;
		
		model.addAttribute("result", result);
		
		return "helloworld";
	}

}
