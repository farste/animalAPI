package com.animals.speak.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {
	
	@Autowired
	Cat cat;
	
	@Autowired
	Dog dog;
	
	@Autowired
	Fox fox;
	
	@Autowired
	Chicken chicken;
	
	public Animal getSpecies(int numLegs, int numTeeth, boolean playsFetch) {
		if (numLegs == 2) {
			return chicken;
		} else if(numLegs == 4) {
			if (numTeeth == 42) {
				if (playsFetch == true) {
				return dog;
				} else {
					return fox;
				}
			}
			
			else if (numTeeth == 30) {
				return cat;
			}
		}
		
		return null;
	}
}
