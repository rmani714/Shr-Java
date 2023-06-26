package com.dev.accesspecifiers;



//Access Level ---- With in the class   ---- > It cannot be accessed outside the class
public class PrivateExample {

	private String firstName = "Shruthi";

	private String getFirstName() {
		return firstName;
	}

	public static void main(String[] args) {
		PrivateExample privateExample = new PrivateExample();
		System.out.println(privateExample.getFirstName());
	}

}
