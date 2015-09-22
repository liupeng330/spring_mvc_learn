package com.springapp.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ContextLoaderListener;

@Controller
@RequestMapping("/hello")
public class HelloController
{
	@RequestMapping(value = {"/world"}, method = RequestMethod.GET)
	public String printWelcome(
			@RequestParam("name") String name,
			ModelMap model)
	{
		Person p = (Person)ContextLoaderListener.getCurrentWebApplicationContext().getBean("person");
		model.addAttribute("message", p.getName());
		model.addAttribute("name", name);
		return "hello";
	}
}