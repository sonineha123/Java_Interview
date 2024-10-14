
package com.custom.exception;

public class ArrayIndexOutofBound {

	
public static void main(String[] args) {
		
		int[] a = {1,2,3};
		try {
		
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println(e);
		}
		finally {
			System.out.println("its finally block");
		}
}
}


