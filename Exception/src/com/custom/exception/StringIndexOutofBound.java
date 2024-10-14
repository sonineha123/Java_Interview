package com.custom.exception;

public class StringIndexOutofBound {
	

	public static void main(String[] args) {
        
		//String name = "abc";
		try {

			String name = "abc";

			System.out.println("char = " + name.charAt(5));

		} catch (Exception e) {

			System.out.println("Exception: " + e);

		}

	}



}
