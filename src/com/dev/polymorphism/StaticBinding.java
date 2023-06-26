package com.dev.polymorphism;

public class StaticBinding {
	// Method Overloading same name diff parameter

	public StaticBinding() {
		// TODO Auto-generated constructor stub
	}
	
	// ByChanging No of Parameters or Arguments
	public int add(int a, int b) {
		System.out.println("Addition :" + a + b);
		return a + b;
	}

	private void add(int a, int b, int c) {
		System.out.println("Addition :" + a + b + c);
	}

	// Same name ---> Datatype
	private void subtract(int a, double b) {
		System.out.println("subtract :" + (a - b));
	}

	private void subtract(int b, long a) {
		System.out.println("Addition :" + (b - a));
	}

	// Same name ---> Datatype order
	private void multiply(long a, double b) {
		System.out.println("multiply :" + (a * b));
	}

	private void multiply(int b, double a) {
		System.out.println("multiply :" + (a * b));
	}

	public static void main(String[] args) {

		StaticBinding staticBinding = new StaticBinding();
		staticBinding.add(1, 2);
		staticBinding.add(1, 2,3);
		staticBinding.subtract(1, 2.0);
		staticBinding.subtract(1, 2);
		staticBinding.multiply(1, 2.0);
		staticBinding.multiply(1, 2);
	}

}
