package com.dev.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		List<String> favStu = new ArrayList<>();
		favStu.add("Rakesh");
		favStu.add("Ramesh");
		favStu.add("Suresh");
		
		
		Set<String> name = new TreeSet<>();
		/*
		 * name.add("Ravi"); name.add("Vijay"); name.add("Ravi"); name.add("Ajay");
		 * name.add(null); name.add(null);
		 */
		name.add("D");
		name.add("C");
		name.add("A");
		name.add("V");
		name.add("S");
		name.add("U");
		
		
		for (String string : name) {
		System.out.println(string);	
		}
	}

}
