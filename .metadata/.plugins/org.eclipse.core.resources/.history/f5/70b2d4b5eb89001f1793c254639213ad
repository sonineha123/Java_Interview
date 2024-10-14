package com.rays.networking;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLWriter {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://erp.sunilos.com/");

		String question = "java";

		URLConnection conn = url.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		// Write question parameter
		out.write("q=" + question);

		// Close output stream
		out.close();

		// Connect to the Server

		conn.connect();

		InputStream iStr = conn.getInputStream();

		Scanner in = new Scanner(iStr);

		System.out.print("URL contents ***");

		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

	}

}
