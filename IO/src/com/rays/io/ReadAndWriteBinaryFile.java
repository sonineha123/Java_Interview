package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {

		String source = "E://Neha//doll.jpg/";

		String target = "E://Neha//doll2.jpg/";

		FileInputStream in = new FileInputStream(source);

		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();

		while (i != -1) {

			out.write(i);

			i = in.read();

		}

		out.close();
		System.out.println("sucessfullyy......");

	}



}
