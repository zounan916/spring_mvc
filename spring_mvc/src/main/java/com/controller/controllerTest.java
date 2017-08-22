package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerTest {
	
	@RequestMapping("Login")
	public @ResponseBody String test() {
		System.out.println("hello ........");
		return "hello, world! This com from spring!";
	}
	 
}
