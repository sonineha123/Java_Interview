package com.raysBasics;

@FunctionalInterface  // means It contain only one abstract method in it 
public interface FunctionalIntf {
    
	//abstract method
	public int sum(int a, int b);
	

//	// static Method
//	public static void multi(int a, int b) {
//
//		System.out.println("Multi : " + (a * b));
//
//	}
//
//	// default Method
//	public default void sub(int a, int b) {
//
//		System.out.println("Sub : " + (a - b));
//
//	}

}
