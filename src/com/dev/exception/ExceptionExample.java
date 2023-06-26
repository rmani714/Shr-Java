package com.dev.exception;


class Marvel{
	private int mvieList;
	
	
}

public class ExceptionExample {
	
	/*
	 * Checked
	 * un checked
	 */
	
	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException  {
		try {
			//ArithmeticException  
			
			/*
			 * int a = 100/0; System.out.println("a Value : "+a);
			 */
			
			//NullpointerException
			/*
			 * String s = null; System.out.println("Legth of shreya :" + s.length());
			 */
			//ArrayIndexException
			
			int[] ar = { 1, 2, 3 };
			System.out.println("ar value : " + ar[3]);
			 
			//number format Exception
			/*
			 * String r = "RRR"; Integer.parseInt(r);
			 */
			
		} 
		
		catch (NumberFormatException e) {
			throw new NumberFormatException("Exception occured in main method :"+ e.getMessage());
		}
		 
		finally {
			System.out.println("Finally Method");
		}
		
	}

}
