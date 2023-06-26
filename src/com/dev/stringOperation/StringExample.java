package com.dev.stringOperation;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		String s = " Shreya Developer ";
		/*
		 * index -- 0123456789 10 11 12 13 14 
		 * length --- 123456789 10 11 12 13 14 15
		 */
		//String length
		System.out.println(s.length());
		
		//String Empty
		System.out.println("  Empty :"  + s.isEmpty() + "  blank :" + s.isBlank());
		
		//fetch Char
		System.out.println(s.charAt(s.length()-1));
		
		//index of
		System.out.println(s.indexOf('e'));
		
		//lastIndexof
		System.out.println(s.lastIndexOf('e'));
		
		//toUpperCase
		System.out.println(s.toUpperCase());
		
		//tolowerCase
		System.out.println(s.toLowerCase());
		
		//StartWith
		System.out.println(s.startsWith("Sh"));
		
		//endsWith
		System.out.println(s.endsWith("oper"));
		
		//contains
		System.out.println(s.contains("S"));
		
		//concat
		System.out.println(s.concat("dancer"));
		
		//replaceAll
		System.out.println(new String(s.replaceAll("Developer", "singer")));
		
		//equals
		System.out.println("equals : "+s.equals("shreyadeveloper"));
		
		//equalIgnoreCase
		System.out.println("equalsIgnoreCase : "+s.equalsIgnoreCase("shreyadeveloper"));
		
		
		//replace
		System.out.println(s.replace("Developer", "Front End Developer"));
		
		//trim
		System.out.println(s.trim());
		
		
		String s2 = "I am JAVA Developer";
		
		String[] s3 = s2.split(" ");
		
		for (String s4 : s3) {
			System.out.println(s4);
		}
		System.out.println("-------------Stream -----------");
		
		Arrays.stream(s2.split(" ")).forEach(System.out::println);
		
		
	}
}
