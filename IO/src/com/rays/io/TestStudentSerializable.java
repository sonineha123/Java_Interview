package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(2, "Nidhi");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:/Neha/student.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/Neha//student.txt/"));

		s = (StudentSerializable) in.readObject();

		System.out.println(s);

	}


}
