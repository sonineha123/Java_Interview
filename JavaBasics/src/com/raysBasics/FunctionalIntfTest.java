package com.raysBasics;

public class FunctionalIntfTest {
	public static void main(String[] args) {

		FunctionalIntf f = new FunctionalIntf() {

			@Override
			public int sum(int a, int b) {
			
				return (a + b); // implimentation of sum method
			}
		};

		int a = 20;
		int b = 15;
		// call sum method
		System.out.println(f.sum(a, b));

//		// static method call by class name
//		FunctionalIntf.multi(a, b);
//
//		// default method call by object
//		f.sub(a, b);

	}

}
