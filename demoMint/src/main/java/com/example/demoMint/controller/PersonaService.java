package com.example.demoMint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Persona;

@Service
public class PersonaService {

	private List<Persona> persone = new ArrayList<>();

	public List<Persona> getAllPersone() {
		return persone;
	} // getAllPersone

	public Persona addPersona(Persona persona) {
		persone.add(persona);
		return persona;
	} // addPersona
	
	public String testMethod () {
		return "";
	} // testMethod
	
	public String testMethod2 () {
		return "";
	} // testMethod
	

} // PersonaService
