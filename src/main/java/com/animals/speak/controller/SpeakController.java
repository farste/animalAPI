package com.animals.speak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.animals.speak.controller.*;
import com.animals.speak.factory.*;

@RestController
public class SpeakController {
	
	@Autowired
	AnimalFactory animalFactory;

	@RequestMapping(value = "/")
	public String homePage() {
		return "To identify your animal, make a post to /animal with integer numLegs, integer numTeeth, and boolean playsFetch";
	}
	
	@PostMapping(value = "/animal")
	public String idAnimal(@RequestBody Target animal) {
		Animal ani = animalFactory.getSpecies(animal.getNumLegs(), animal.getNumTeeth(), animal.isPlaysFetch());
		if (ani != null) {
			return ani.speak();
		}
		else return "No animal found.";
	}
}
