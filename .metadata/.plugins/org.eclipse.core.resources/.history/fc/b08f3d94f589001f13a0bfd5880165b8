package com.custom.exception;

public class MultipleException {


	public static void main(String[] args) {

		String name = "abcd";
		//String name=null;
		// System.exit(0);
		try {
			System.out.println(name.charAt(8));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("StringIndexOutOfBoundsException");

			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");

			System.exit(0);
		} finally {
			System.out.println("final block is not calling here");
		}

	}

	
}
