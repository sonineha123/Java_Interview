package com.custom.exception;

public class NullPointer {


		public static void main(String[] args) {
			String name = null;
			try {
				//System.out.println(name.charAt(3));
				System.out.println(name.length());
				
				
			} catch (NullPointerException e) {
				//e.printStackTrace();
				System.out.println(e);
			}
		}

	}
