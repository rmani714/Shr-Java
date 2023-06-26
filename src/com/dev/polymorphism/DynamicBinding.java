package com.dev.polymorphism;

class Parent {
	
	protected void printName() {
		System.out.println("RRR");
	}
	
	protected void getClassName() {
		System.out.println("Parent or SuperClass");
	}
}

class Child extends Parent {
	@Override
	protected void getClassName() {
		System.out.println("child class");
		super.printName();
	}
}

public class DynamicBinding {

	// method Overriding or runtime Polymorphism or DynamicBinding
	public static void main(String[] args) {
		
		//parent method 
		Child child = new Child();
		child.getClassName();
	}

}
