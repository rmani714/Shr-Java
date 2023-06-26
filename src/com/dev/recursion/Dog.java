package com.dev.recursion;

public class Dog {
	
	
	
	public static void main(String[] args) {
		bark();
	}

	private static void bark() {
		System.out.println("barking");
		bark();
		
	}

}
