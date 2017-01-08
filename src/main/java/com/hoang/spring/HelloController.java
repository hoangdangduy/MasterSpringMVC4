package com.hoang.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value = "/")
	public String hello(Model model) {
		model.addAttribute("message", "hello spring 1234");
		return "resultPage" ;
	}
}
