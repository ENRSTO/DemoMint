package com.example.demoMint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Persona;

@RestController
@RequestMapping("/api/persone")
@CrossOrigin(origins = "http://localhost:4200") 
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@PostMapping
	public Persona addPersona(@RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}

    @GetMapping
    public List<Persona> getPersone() {
        return personaService.getAllPersone();
    }

}
