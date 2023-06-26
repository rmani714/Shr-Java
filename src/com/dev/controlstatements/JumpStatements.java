package com.dev.controlstatements;

public class JumpStatements {
	
	public static void main(String[] args) {
		
		//break
		for (int i = 0; i < 100; i++) {
			//System.out.println("s.no : "+i);
			if (i == 5) {
				break;
			}
		}
		//continue
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("s.no : "+i);
		}
	}

}
