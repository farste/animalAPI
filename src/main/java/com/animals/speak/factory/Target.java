package com.animals.speak.factory;

import org.springframework.stereotype.Component;

@Component
public class Target {
	private int numLegs;
	private int numTeeth;
	private boolean playsFetch;
	
	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public int getNumTeeth() {
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}

	public boolean isPlaysFetch() {
		return playsFetch;
	}

	public void setPlaysFetch(boolean playsFetch) {
		this.playsFetch = playsFetch;
	}

	Target(int numLegs, int numTeeth, boolean playsFetch) {
		this.numLegs = numLegs;
		this.numTeeth = numTeeth;
		this.playsFetch = playsFetch;
	}
	
	Target(){};
}
