package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements Animal{

	@Override
	public String speak() {
		return "The chicken goes b'gawk";
		
	}

}
