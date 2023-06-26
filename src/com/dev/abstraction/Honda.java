package com.dev.abstraction;

public class Honda extends Bike {

	@Override
	void run() {
		System.out.println("Bike Running : Honda");
	}

	@Override
	void getName() {
		System.out.println("Honda");
	}

	@Override
	void addGBS() {
		System.out.println("GBS attached");
		
	}
	
	public void getHondaConnect() {
		System.out.println("Honda Connect Activated");

	}

}
