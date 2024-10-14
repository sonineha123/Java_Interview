package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadLineByLine {
	
	 public static void main(String[] args) throws IOException {
	        FileReader fr = new FileReader("E://Neha//readline.txt/");
	        BufferedReader br = new BufferedReader(fr);

	        String line = br.readLine();
	        while (line != null) {
	            System.out.println(line);
	            line = br.readLine();
	        }
	        fr.close();
	        br.close();

	    }
	

}



