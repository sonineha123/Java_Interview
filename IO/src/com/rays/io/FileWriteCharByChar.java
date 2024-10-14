package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharByChar {
	
	  public static void main(String[] args) throws IOException {

	        FileWriter fw = new FileWriter("E://Neha//CharbyCharBy.txt//");

	        char[] c = {'H', 'E', 'L', 'L', 'O'};

	        fw.write(c);
	        fw.write(',');
	        fw.write("YUGAL");
	        fw.write("NEHA");
	        fw.close();
	        System.out.println("Success");
	    }
		
}
