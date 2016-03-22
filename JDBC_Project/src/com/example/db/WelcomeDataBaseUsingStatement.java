/**
 * This example creates a connection with MySql database
 * Mysql that i have is one came with MAMP package
 * url localhost:8880/JavaTest
 * copied the mysql drive jar to lib folder under the project
 * added that jar in lib to the buildpath
 * 
 * A separate properties file is used for username password and url
 * 
 * This example uses STATEMENT to execute the queries.
 * Statement will bombard the database with as many queries as you write, say if you have 1000 insert statements tha db will be fired with 1000 insert statements
 * to make this efficient we use PREPARED STATEMENT which only queries database once no matter how many queries are there
 */
package com.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class WelcomeDataBaseUsingStatement {

	private static final String QUERY = "SELECT p.`Email`, p.`UserName`,GETFULLNAME(p.`FirstName`,p.`LastName`) as FullName FROM Person p";
	private static final String QUERY2 = "SELECT GETUSERNAME('Shableen') as uName";

	public static void main(String[] args) {

		try {

			Connection con = DataBaseUtil.getConnectionFromUtil();

			// use of the statement
			Statement mystm = con.createStatement();

			ResultSet rs = mystm.executeQuery(QUERY);

			while (rs.next()) {

				System.out.println("result of query 1........ \n" + rs.getString(1) + " : " + rs.getString(2) + " : "
						+ rs.getString(3));

			}

			// for query2
			Statement mystm1 = con.createStatement();

			ResultSet rs1 = mystm1.executeQuery(QUERY2);

			while (rs1.next()) {
				System.out.println("result of query2......... \n" + rs1.getString("uName"));
			}

			System.out.println("data base connected...");

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
