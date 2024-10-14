package com.raysBasics;

public class NotesCount {

	public static void main(String[] args) {
		int[] notes = { 2000, 500, 200, 100, 50, 20, 2, 1 };
         //a=amount
		int rupees = 4500;
		//radius
		int r;

		for (int i = 0; i < notes.length; i++) {

			r = rupees/ notes[i];

			if (r > 0) {

				System.out.println(notes[i] + " = " + r);
				rupees = rupees % notes[i];
				System.out.println();
			}
		}

	}
}


