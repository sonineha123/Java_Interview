package com.thread;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("Neha");
		
		Racing t2 = new Racing("Soni");

		t1.start();
		t2.start();
	}
}