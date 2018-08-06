package com.rest1.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest1.main.service.restservice;

@Controller
public class restcontroller {

	@Autowired
	restservice service;
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "ccccc";
	}
	/*@RequestMapping("/index")
	public String sayHello(@RequestParam String name,ModelMap model) {
		model.put("name",name);
		return "index";
	}*/
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		return "index";
	}
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String sayWelcome(ModelMap model,@RequestParam String name,@RequestParam String pwd) {
		model.put("name",name);
		model.put("pwd",pwd);
		if(service.validateUser(name, pwd));
		return "welcome";
	}
}
