package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailReadWrite {
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new FileReader("E://Neha//mail.txt/"));

	        FileWriter fw = new FileWriter("E://Neha//mailWrite.txt/");
	        PrintWriter pw = new PrintWriter(fw);
	        String s = br.readLine();

	        while (s != null) {
	            if (s.endsWith("@gmail.com")) {
	                pw.println(s);
	                System.out.println(s);
	            }
	            s = br.readLine();
	        }

	        pw.close();


	 }

}
