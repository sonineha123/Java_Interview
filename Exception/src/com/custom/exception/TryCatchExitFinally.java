package com.custom.exception;

public class TryCatchExitFinally {


	public static void main(String[] args) {

		int a = 20;

		int b = 0;
     

		try {
			System.exit(0); 

			int c = a/b;

			System.out.println("Div = " + c);
         
		  // System.exit(0); 
		} catch (Exception e) {

			System.out.println("Exception: " + e);

		System.exit(0); 

		} finally {
			System.out.println("finally block");
		}

		

	}



}
