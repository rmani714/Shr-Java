package com.dev.controlstatements;

public class LoopStatements {
	
	
	private void tryForLoop() {
	/*
	 * for(intialization,condition ,increment/decrement) {
	 * 				//statements
	 *  }
	 */
	
	/*
	 * String[] city = { "Chennai", "mumbai", "pune", "Bangalore", "Lakno" };
	 * System.out.println("----------for loop--------------"); for (int i = 0; i <
	 * city.length; i++) { System.out.println("city : " + city[i]); }
	 * System.out.println("----------forEach loop--------------");
	 * 
	 * for (String cityName : city) { System.out.println("city : " + cityName); }
	 */
		System.out.println("----------for loop--------------");
		
		int limit = 100;
		int indx =0;
		for ( ;; ) {
			if(indx == 3) {
				break;
			}
			System.out.println("s.no: "+indx);
			indx++;
		}
	}
	
	private void tryWhile() {
		System.out.println("----------while loop--------------");
		/*
		 * while(condition){
		 *   statement
		 *  }
		 */
		int i=0;
		while (i<3) {
			System.out.println("s.no :"+i);
			i = i+1;
		}
	}
	
	private void trydowhile() {
		System.out.println("----------do while loop--------------");
		/*
		 * do {
		 * statements
		 * } while (condition);
		 */
		int i=0;
		do {
			System.out.println("s.no :"+i);
			i = i+1;
		} while (i<3);
		

	}
	public static void main(String[] args) {
		new LoopStatements().tryWhile();
		new LoopStatements().trydowhile();
		new LoopStatements().tryForLoop();
	}

}
