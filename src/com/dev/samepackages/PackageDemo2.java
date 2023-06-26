package com.dev.samepackages;

public class PackageDemo2 {

	protected String getClassName() {
		return "Class name for current class :" + getClass().getName();

	}

	public static void main(String[] args) {
		PackageDemo2 packageDemo2 = new PackageDemo2();
		System.out.println(packageDemo2.getClassName());
	}

}
