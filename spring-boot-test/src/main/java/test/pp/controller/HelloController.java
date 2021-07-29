package test.pp.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/test1")
	public ArrayList<String> index1() {
		ArrayList<String> l= new ArrayList<>();
		l.add("A");
		return l;
	}
}