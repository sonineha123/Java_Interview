package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {
	
	public static void main(String[] args) throws Exception {

		Connection conn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into employee values(9,'Nikita',6000)");

//			i = stmt.executeUpdate("insert into marksheet values(23, 118, 'aryant', 89, 22, 34)");
//
//			i = stmt.executeUpdate("insert into marksheet values(24, 119, 'aryant', 89, 22, 34)");

			conn.commit();

			System.out.println("data inserted => " + i);

		} catch (Exception e) {

			conn.rollback();
			System.out.println("exception: " + e.getMessage());

		} finally {
			conn.close();
		}

	}

}