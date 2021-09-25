package com.example.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "sample/test", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "Hello World!!");
		return "index";
	}

}