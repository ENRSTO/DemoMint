package com.example.demoMint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@GetMapping("/")
	    public String showForm() {
	        return "greeting";
	}
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Ciao, benvenuto su Spring Boot!";
    }
	
	 @PostMapping("/greet")
	 public String greet(@RequestParam("name") String name, Model model) {
	        String message = "Ciao, " + name + "!";
	        model.addAttribute("message", message);
	        return "greeting";
	 } // greet

}
