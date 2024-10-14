package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFile {
 
	  public static void main(String[] args) throws IOException {

	        //find no of lines
	        String s = "E://Neha//New.txt/";
	        int count = 0;
	        int nol = 2;

	        File f = new File(s);
	        Scanner sc = new Scanner(f);

	        while (sc.hasNext()) {
	            sc.next();
	            count++;
	        }
	        System.out.println("no of lines = " + count);

	        //no of files
	        int temp = count / nol;
	        int rem = count % nol;
	        int nof = 0;
	        if (temp != 0) {
	            nof = temp;
	            if (rem != 0) {
	                nof++;
	            } else { 
	                nof = temp;
	            }
	        }
	        System.out.println("No of file =" + nof);

	        //create file and write data
	        BufferedReader br = new BufferedReader(new FileReader(s));
	        String strLine;
	        for (int i = 1; i <= nof; i++) { //ye loop no of files ke liye chlega
	        BufferedWriter bw = new BufferedWriter(new FileWriter("E://Neha//AfterSplit"+i+".txt/"));
	            strLine = br.readLine();

	            for (int j = 1; j <= nol; j++) {  //ye loop no of lines per file ke liye chlega
	                if (strLine != null) {   //current line null nhi he to bw.rite ke through likh diya jayega
	                    bw.write(strLine);
	                    strLine = br.readLine();
	                    if (j != nol) { 
	                        bw.newLine();
	                    }
	                }
	            }
	            bw.close();

	        }
	        br.close();

	    }
	
}
