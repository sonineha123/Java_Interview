package com.raysBasics;

import java.time.LocalDate;

public class DateEndOrStart {
	
	public static void main(String[] args) {

		// if endDate is less than today print an error message
		LocalDate endDate = LocalDate.of(2020, 11, 25);

		LocalDate startDate = LocalDate.now();

		if (endDate.isBefore(startDate)) {
			System.out.println("Error Message");

		} else {
			System.out.println("Success Message");
		}

	}



}
