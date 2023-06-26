package com.dev.operators;

public class INCricket {
	
	static String IN_Sport = null; 
	
	//default constructor
	public INCricket() {
		IN_Sport = "IN_"+Sports.mySport;
	}
	
	public INCricket(String country) {
		IN_Sport = country+Sports.mySport;
	}
	
	public static void main(String[] args) {
		
		//without constructor
		System.out.println(IN_Sport);
		//default constructor
		INCricket inCricket = new INCricket();
		System.out.println(IN_Sport);
		//Parameterized constructor
		INCricket in2 = new INCricket("US_");
		System.out.println(IN_Sport);

		
	}

}
