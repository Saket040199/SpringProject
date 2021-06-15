package com.bl.springExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloController")
public class HelloWorldController {

	@RequestMapping( method = RequestMethod.GET,value = {"/home"})
	public String sayHello() {
		return "HELLO WORLD";
    }
	
	@RequestMapping (value = {"/query"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name ) {
		return "HELLO  " + name + " !! ";
	}
	
}
