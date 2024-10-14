package com.custom.exception;

public class ClassCastException {
	

	public static void main(String[] args) throws Exception {
		Object obj = "asd";

		try {

			Integer s = (Integer) obj;
			System.out.println("String value: " + s);
		} catch (Exception e) {

			e.printStackTrace(); 
			throw e;
		}
	}


}





