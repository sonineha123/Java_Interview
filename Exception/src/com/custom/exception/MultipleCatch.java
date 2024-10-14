package com.custom.exception;

public class MultipleCatch {

	public static void main(String[] args) {

		String a = "h5y5";

		try {
			System.out.println(a.charAt(1));
			System.out.println(a.length());

			int i = Integer.parseInt(a);
			System.out.println(i);

		} catch (NumberFormatException e) {
			System.out.println("NumberFormateException");

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} finally {
			System.out.println("fdfghj");
		}
	}


}
