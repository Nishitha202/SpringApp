package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Requests {
  
	@GetMapping("/greet")
//	@ResponseBody  // seeing this spring will understand that we are sending just a string object
	public String greet() {
		return "Hello from springboot rest controller"; // sending the string object or else it will search for the html file
	}
	
	@GetMapping("/goodmorning")
//	@ResponseBody  // seeing this spring will understand that we are sending just a string object
	public String goodMorning() {
		return "Good Morning"; // sending the string object or else it will search for the html file
	}
	
	
	
}
