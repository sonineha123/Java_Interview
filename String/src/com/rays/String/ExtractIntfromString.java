package com.rays.String;

import java.util.Arrays;

public class ExtractIntfromString {

	public static void main(String[] args) {
	String[] name= {"Neha123456"};
	 String Result = "";
	 
	 for( String s:name) {
	 
	 char [] ch = s.toCharArray();
	 for(int i =0; i<s.length(); i++) {
     if(Character.isDigit(ch[i])) {
    	 Result= Result+ ch[i];
    	}
		 
	 }
	 
	 int[] intArray= new int [Result.length()];
	 for(int i=0; i<Result.length(); i++) {
		intArray[i]= Character.getNumericValue(Result.charAt(i));
		}

		System.out.println(Arrays.toString(intArray));
	 }
	 
	}
}