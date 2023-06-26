package com.dev.abstraction;

public class KTM  extends Bike{

	@Override
	void run() {
		System.out.println("KTM : Bike Running");
	}

	@Override
	void getName() {
		System.out.println("KTM");
	}

	@Override
	void addGBS() {
		System.out.println("GBS attached");
		
	}

	
	
}
