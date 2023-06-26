package com.dev.specifierstest;

import com.dev.accessmodifiers.FinalExample;
import com.dev.accessmodifiers.StaticExample;

public class Modifierstest {
	
	
	
	public static void main(String[] args) {
		//static Test
		System.out.println(StaticExample.getCOMPAY());
		System.out.println(StaticExample.COMPAY);
		System.out.println();
		
		//Final
		new FinalExample().getCompany();
	}
	
	
}
