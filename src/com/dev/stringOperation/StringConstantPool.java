package com.dev.stringOperation;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1 = "Shreya";
		String s2 = "Shreya";
		String s3 = new String("Shreya");
		System.out.println("S1 : " + s1.hashCode() + " s3 : " + s3.hashCode() + " S2 :" + s2.hashCode());

		System.out.println("S1&S3 : " + (s1 == s3) + " S1&S2 :" + (s1 == s2));

	}

}
