
package com.raysBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender2 {
	
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		for (int i = 1; i <= 12; i++) {
			
			c.add(Calendar.DATE, 30);
			Date d = c.getTime(); //geeting a new date

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			String stringDate = sdf.format(d);  // chage date into string

			System.out.println(stringDate);  //print string date

		}
	}
}

