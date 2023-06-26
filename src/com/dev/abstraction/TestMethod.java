package com.dev.abstraction;

public class TestMethod {
	
	public static void main(String[] args) {
		System.out.println("------------Honda--------");
		Honda honda = new Honda();
		honda.run();
		honda.getName();
		honda.addGBS();
		honda.getHondaConnect();
		honda.getBikeNumber("TN77");
		System.out.println("------------KTM--------");

		KTM ktm = new KTM();
		ktm.run();
		ktm.getName();
		ktm.addGBS();
		ktm.getBikeNumber("TN11");
		System.out.println("------------Bike with Honda Object--------");
		//Test with Bike Type
		Bike bikeWithHondaObject = new Honda();
		bikeWithHondaObject.run();
		bikeWithHondaObject.getName();
		bikeWithHondaObject.addGBS();
		bikeWithHondaObject.getBikeNumber("TN77");
		
		System.out.println("------Apple Mobile ----------------");
		Apple apple = new Apple();
		apple.processor("A16 Bionic");
		apple.camera("APPle true Vision");
		apple.memory("SSD Memory");
		apple.securityCheck();
		
		
		System.out.println("------Mobile with Appple Object ----------------");
		Mobile mobile = new Apple();
		mobile.processor("A17 Bionic");
		mobile.camera("SONY SENSOR CAMERA");
		mobile.memory("SSD ^2 Memory");
		
	}

}
