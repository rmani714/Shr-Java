package com.dev.abstraction;

public abstract class Bike {
	
	 abstract void run();

	abstract void getName();
	
	abstract void addGBS();
	
	public void getBikeNumber(String bkeNo) {
		System.out.println("Bike Number : "+ bkeNo);
	}
	
}
