package com.dev.abstraction;

public class Apple implements Mobile {

	@Override
	public void processor(String processor) {
		System.out.println("Apple Processor :"+processor+" Processor");
	}

	@Override
	public void camera(String camera) {
		System.out.println("Apple Camera : "+camera);
	}

	@Override
	public void memory(String memory) {
		System.out.println("Apple Memory : "+memory);
	}
	
	public void securityCheck() {
		System.out.println("Its Encrypted ");
	}
	

}
