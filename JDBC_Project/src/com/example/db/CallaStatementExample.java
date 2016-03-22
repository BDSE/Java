/**
 * This example creates a connection with MySql database
 * Mysql that i have is one came with MAMP package
 * url localhost:8880/JavaTest
 * copied the mysql drive jar to lib folder under the project
 * added that jar in lib to the buildpath
 * 
 * A separate properties file is used for username password and url
 * 
 * This example uses CALLABLE STATEMENT to execute the queries.
 * used to call the functions and procedures from database
 */
package com.example.db;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CallaStatementExample {

	public static void main(String[] args) {

		try {

			Connection con = DataBaseUtil.getConnectionFromUtil();

			// use of the Callable Statement statement
			CallableStatement cs = con.prepareCall("{ ? = call ADD_NUMBERS(?,?)}");
			
			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.setInt(2, 34);
			cs.setInt(3, 454);
			
			System.out.println("Result of the function call is : " + cs.getInt(1));
			
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
