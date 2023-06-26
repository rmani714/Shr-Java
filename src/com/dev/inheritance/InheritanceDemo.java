package com.dev.inheritance;

public class InheritanceDemo extends InheritanceDemoParent{
	
	protected String getRunTimeProcessor() {
		return "8 thread I5 processor";
	}
	
	public static void main(String[] args) {
		InheritanceDemo inheritanceDemo = new InheritanceDemo();
		System.out.println(inheritanceDemo.getDiffAClassName());
		System.out.println(inheritanceDemo.getRunTimeProcessor());
	}

}
