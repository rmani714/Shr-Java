package com.dev.accessmodifiers;

public abstract class AbstractExample {
	private String firstName = "Saravana";
	private String lastName = "Selvarathnam";

	abstract String getName();
	
	
	public String getFullName() {
		return firstName +" "+lastName;
	}

}
