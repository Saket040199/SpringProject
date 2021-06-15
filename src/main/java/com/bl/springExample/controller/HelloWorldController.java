package com.bl.springExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloController")
public class HelloWorldController {
//public static void main(String[] args) {
	@RequestMapping( method = RequestMethod.GET,value = {"/home"})
	public String sayHello() {
		return "HELLO WORLD";
}
}
