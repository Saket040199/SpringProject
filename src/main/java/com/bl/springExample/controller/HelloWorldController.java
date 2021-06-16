package com.bl.springExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.springExample.model.User;

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
	
	@RequestMapping (value = {"/query2"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "fname") String fname , @RequestParam(value = "lname")String lname ) {
		return "HELLO  " + fname +" "+ lname + " !! ";
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello " + name +" !!";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + "!!";
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam(value= "lastName") String lastName) {
		return "Hello" + firstName + " " + lastName + "!";
	}
}
