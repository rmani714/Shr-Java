package com.dev.samepackages;


//shortcut----> ctrl+shift+O
import com.dev.diffpackages.DiffA;
import com.dev.diffpackages.DiffB;

public class PackageDemo {
	
	private String getPackageName() {
		return "Package name for current class : "+ getClass().getPackageName();
	}
	
	public static void main(String[] args) {
		
		PackageDemo packageDemo = new PackageDemo();
		System.out.println( packageDemo.getPackageName());
		
		//get class Name in diff class (PackageDemo2)
		PackageDemo2 packageDemo2 = new PackageDemo2();
		System.out.println(packageDemo2.getClassName());
		
		
		//Accesss class from diff package
		DiffA diffA = new DiffA();
		System.out.println(diffA.getDiffAClassName());
		DiffB diffB = new DiffB();
		System.out.println(diffB.getDiffBClassName());
		
		
		///Java OOM error
	}

}
