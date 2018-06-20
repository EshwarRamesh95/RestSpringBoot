package com.rideestimate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView save() {
		JersyGetClient jersyGetClient = new JersyGetClient();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		modelAndView.addObject("json", jersyGetClient.searchOla());
		return modelAndView;
	}
	/*@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String save() {
		JersyGetClient jersyGetClient = new JersyGetClient();
		modelAndView.setViewName("user-data");
		return jersyGetClient.searchOla();
	}*/
}
