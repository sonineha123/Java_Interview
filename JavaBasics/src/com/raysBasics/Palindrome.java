package com.raysBasics;

public class Palindrome {

	public static void main(String[] args) {

		int num = 131;
		int r = 0;
		int temp = 0;
		int num2 = num;

		while (num2 != 0) {

			r = num2 % 10;
			temp = (temp * 10) + r;
			num2 = num2 / 10;
		

		}
		//System.out.println("reverse no. " + sum);
		if (temp == num) {
			System.out.println("This is Pelindrome");
		} else {
			System.out.println("This is not Pelindrome");
		}

	}

}
















