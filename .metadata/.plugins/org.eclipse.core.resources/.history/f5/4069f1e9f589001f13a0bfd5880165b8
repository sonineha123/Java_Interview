package com.customunchecked;

public class TestCustomUnchecked {

	public static void main(String[] args) {

		try {
			dad();
		} catch (CustomUnchecked e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		son();

	}

	public static void son() {

		CustomUnchecked e = new CustomUnchecked();

		throw e;

	}

}
