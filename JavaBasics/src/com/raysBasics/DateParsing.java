package com.raysBasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		String date = "25/01/2001";

		Date d = sdf.parse(date + " (String To date)"); // convert string to date format

		System.out.println(d);

		String StringDate = sdf.format(d); // convert again date to string

		System.out.println(StringDate + " (date To String)");

	}

}
