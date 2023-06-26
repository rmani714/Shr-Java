package com.dev.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		//Array
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		//List
		List<String> names = new LinkedList<>();
		names.add("Shreya");
		names.add("Singer");
		
		List<String> birds = Arrays.asList("Parrot", "peigeon","dow");
		
		//size
		int sizeOfList = names.size();
		System.out.println("Size : "+ sizeOfList);
		//add
		names.add("BodyBuilder");
		
		//getValue
		//System.out.println(names.get(0));
		
		//update value
		//names.set(0, "JAVA");
		
		//remove value
		//names.remove(0);
		
		//is Empty
		//names.clear();
		//System.out.println(names.isEmpty());
		
		//contains
		//System.out.println(names.contains("Shreya"));
		
		//add another List
		names.addAll(birds);
		
		
		names.forEach(e -> System.out.println(e));		
	}

}
