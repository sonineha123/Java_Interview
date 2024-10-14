package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriteInFileFromKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("E://Neha//Neha.txt");

		 PrintWriter pw = new PrintWriter(fw);

		System.out.println("Please enter");

		String s = bf.readLine();

		while (!s.equals("quit")) {
			fw.write(s);

			System.out.println(s);

			s = bf.readLine();
		}

		fw.close();
		bf.close();
		System.out.println("scanned");
	}


}
