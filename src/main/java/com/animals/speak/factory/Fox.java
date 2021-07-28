package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class Fox implements Animal {

	@Override
	public String speak() {
		return "The fox goes Yip";
	}

}
