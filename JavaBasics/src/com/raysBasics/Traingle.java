package com.raysBasics;

public class Traingle {

	public static void main(String[] args) {
		
		int row = 8;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
	}
}
