package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFile {

	public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("E://Neha//NehaMerge.txt/"));

        BufferedReader br = new BufferedReader(new FileReader("E://Neha//Neha1.txt/"));

        String s = br.readLine();
        while (s != null) {
            pw.write(s);
            s = br.readLine();

        }
        br.close();
        br = new BufferedReader(new FileReader("E://Neha//Neha2.txt/"));
        String s1 = br.readLine();
        while (s1 != null) {
            pw.write(s1);
            s1 = br.readLine();
        }
        br.close();
        pw.close();
        System.out.println("Success..........");


    }
}

