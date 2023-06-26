package com.dev.stringOperation;

public class StringBufferExample {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("select * from Country")
		.append("Where")
		.append(" CountryCode = ?")
		.append(" region_id = ?");
		
		System.out.println(buffer);
		buffer.insert(8, "FROM");
		//insert
		System.out.println(buffer);
	}

}
