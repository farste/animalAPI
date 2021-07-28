package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public String speak() {
		return "The dog goes bark";
	}

}
