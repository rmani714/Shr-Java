package com.dev.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();// Random Order  key1=null valu
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//Insertion
		Map<Integer, String> treeMap = new TreeMap<>();//Ascending 
		Map<Integer, String> hashtable = new Hashtable<>(); // Random Order
		
		//put
		hashMap.put(1, "ONE");
		hashMap.put(1, "ONE1");
		hashMap.put(2, "TWO");
		hashMap.put(3, "THREE");
		hashMap.put(4, "FOUR");
		hashMap.put(5, "FIVE");
		//numMap.put(6, null);
		//numMap.put(null, null);
		//numMap.put(7, null);
		//get
		//System.out.println(numMap.get(2));
		//EntrySet
		//hashMap.entrySet().forEach(System.out::println);
		//System.out.println(hashMap.entrySet());
		for (Entry<Integer, String> map : hashMap.entrySet()) {
//			System.out.println("Key : "+map.getKey());
//			System.out.println("Values : " + map.getValue());
		}
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
	}

}
