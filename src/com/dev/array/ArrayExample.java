package com.dev.array;

public class ArrayExample {

	
	private int getlengthOfArray(int[] arr) {
		
		return arr.length;
	}
	
	
	
	public static void main(String[] args) {
		int age=100;
		
		//Array
		/*
		 * dataType[] arr;
		 * datatype []arr;
		 * datatype arr[];
		 * 
		 * similar datatype
		 * 
		 * 
		 * dataType[] arr = new datatype[size];
		 */
		
		int[] ages = new int[10];
		//index----> 0 to (n-1)
		//length ----> 1 to n
		//array[index] = value;
		ages[0] = 100;
		ages[1] = 99;
		ages[2] = 98;
		ages[3] = 97;
		ages[4] = 96;
		ages[5] = 95;
		ages[6] = 94;
		ages[7] = 93;
		ages[8] = 92;
		ages[9] = 91;
		
		System.out.println("idx 4 : "+ages[10]);
		
		
		System.out.println("--------for-----");
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("--------for each-----");
		for (int ag : ages) {
			System.out.println(ag);
		}
		
		
		/*
		 * System.out.println("--------foreach J8-----");
		 * Arrays.stream(ages).forEach(System.out::println);
		 */
	
		//int[] ages = new int[10];
		int[] ageDuplicate = {100,99,97,98,97,96,95,94,93,92,91};
		System.out.println("length of ageDuplicate array :  "+ageDuplicate.length);
		
		int []arr =  new ArrayExample().getArray();
		for (int i : arr) {
			System.out.println("arrVal :"+ i);
			
		}
	}



	private int[] getArray() {
		return new int[] {4,5,6,7,8,9};
		
	}
}
