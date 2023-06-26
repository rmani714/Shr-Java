package com.dev.controlstatements;

import java.util.Scanner;

import com.dev.accessmodifiers.StaticExample;

public class DecisionMakingStatements {
	
	
	public String getDepartmet(int gate , int subGate){
		
		//simple if
		if(gate == StaticExample.GATE1) {
			if(subGate == StaticExample.SUBGATE1 ) {
				return "Mechanical : Robotics";
			}else {
				return "Mechanical : CASTING";
			}
		}else if(gate == StaticExample.GATE2) {
			return "ECE Departement";
		}else {
			return "other Departement";
		}
	}
	
	
	
	public static void main(String[] args) {
		//if statements
		/*
		 * if
		 * if-else
		 * if ladder
		 * nested if
		 * 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Main Gate No ::" );
		int department = scanner.nextInt();
		System.out.println("Enter Sub Gate No ::" );
		int subGate = scanner.nextInt();
		
		//new DecisionMakingStatements().getDepartmet(department);
		
		DecisionMakingStatements decisionMakingStatements = new DecisionMakingStatements();
		System.out.println(decisionMakingStatements.getDepartmet(department,subGate));
		
		
		/*switch(expression){
		case value1: 
		    statements;
		case value2: 
			statements;
		case value3: 
			statements;
		case value4: 
			statements;
		default:
			statement;
		}
		 */
		System.out.println(getMarks(35));
	}

	//Chennai to salem


	private static String getMarks(int mark) {
		switch (mark) {
		case 90:
			return "A+";
		case 35:
			return "PASS";
		case 80:
			return "GOOD";
		case 70:
			return "AVERAGE";
		default:
			return "Below Average";
		}
	}



	

}
