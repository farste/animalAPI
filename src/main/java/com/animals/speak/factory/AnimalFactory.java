package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {
	public Animal getSpecies(int numLegs, int numTeeth, boolean playsFetch) {
		if (numLegs == 2) {
			return new Chicken();
		} else if(numLegs == 4) {
			if (numTeeth == 42) {
				if (playsFetch == true) {
				return new Dog();
				} else {
					return new Fox();
				}
			}
			
			else if (numTeeth == 30) {
				return new Cat();
			}
		}
		
		return null;
	}
}
