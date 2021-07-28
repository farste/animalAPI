package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public String speak() {
		return "The cat goes meow";
	}

}
