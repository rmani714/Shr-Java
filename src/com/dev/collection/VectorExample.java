package com.dev.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		//syntax
		Vector<String> vectors = new Vector<>();
		
		
		//add
		vectors.add("Chennai");
		vectors.add("Chromepet");
		
		//add with index
		vectors.add(0, "Bangalore");
		
		vectors.addAll(Arrays.asList("Salem", "Erode" , "Namakkal"));
		
		System.out.println(vectors.get(0));
		
		Iterator<String> it = vectors.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
