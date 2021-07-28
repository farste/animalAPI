package com.animals.speak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.animals.speak.factory.*;
@SpringBootApplication
public class SpeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeakApplication.class, args);
//		AnimalFactory animalFactory = new AnimalFactory();
//		
//		Animal animal1 = animalFactory.getSpecies(2, 0, false);
//		Animal animal2 = animalFactory.getSpecies(4, 30, false);
//		Animal animal3 = animalFactory.getSpecies(4, 42, false);
//		Animal animal4 = animalFactory.getSpecies(4, 42, true);
//		
//		System.out.println(animal1.speak());
//		System.out.println(animal2.speak());
//		System.out.println(animal3.speak());
//		System.out.println(animal4.speak());
	}

}
