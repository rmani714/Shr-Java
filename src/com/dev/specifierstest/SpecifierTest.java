package com.dev.specifierstest;

import com.dev.accesspecifiers.Defaultexample;
import com.dev.accesspecifiers.ProtectedExample;
import com.dev.accesspecifiers.PublicExampel;

public class SpecifierTest extends ProtectedExample {

	public static void main(String[] args) {
		
		//test protected
		SpecifierTest protectedTest = new SpecifierTest();
		System.out.println(protectedTest.getLastName());
		
		//test Public
		PublicExampel publicExampel = new PublicExampel();
		publicExampel.getCityName();
		
		
		//Default Test
		Defaultexample defaultexample = new Defaultexample();
	}
	

}
