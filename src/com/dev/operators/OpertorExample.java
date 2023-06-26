package com.dev.operators;

public class OpertorExample {
	
	private static int a;
	
	
	
	public static void main(String[] args) {
		//Arithmetic
		int b=5;  
		/*
		 * System.out.println(a+b);//15 System.out.println(a-b);//5
		 * System.out.println(a*b);//50 System.out.println(a/b);//2
		 * System.out.println(a%b);//0
		 */		
		
		//System.out.println(10*(2)+3 -1*(2));  
		
		//int a= 10;
		//unary
		/*
		 * System.out.println("a value : "+ a); System.out.println("a value : "+ a++);
		 * System.out.println("a value : "+ a); System.out.println("a value : "+ ++a);
		 * System.out.println("a value : "+ a--); System.out.println("a value : "+ a);
		 * System.out.println("a value : "+ --a); a=a+1;
		 * 
		 * System.out.println(a++ + ++a);
		 */ 
		
		//logical AND Biwise AND
		
		//ternary
		String name = "Shreya";
		System.out.println(name.equals("Sreya") ? "I am shreya": "not shreya");
		
		//Assignment
		OpertorExample opertorExample = new OpertorExample();
		System.out.println(opertorExample.hashCode());
		Object val = opertorExample;
		System.out.println(val);
		
		a=a+4;
		
		
		System.out.println(a);
		System.out.println(opertorExample == val);
		
	}

}
