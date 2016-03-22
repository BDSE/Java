/**
 * This example creates a connection with MySql database
 * Mysql that i have is one came with MAMP package
 * url localhost:8880/JavaTest
 * copied the mysql drive jar to lib folder under the project
 * added that jar in lib to the buildpath
 * 
 * A separate properties file is used for username password and url
 * 
 * This example uses PREPAREDSTATEMENT to execute the queries.
 * Statement will bombard the database with as many queries as you write, say if you have 1000 insert statements tha db will be fired with 1000 insert statements
 * to make this efficient we use PREPARED STATEMENT which only queries database once no matter how many queries are there
 */
package com.example.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class PreparedStatementExample {

	public static void main(String[] args) {
		Connection con = null;

		try {

			con = DataBaseUtil.getConnectionFromUtil();
			con.setAutoCommit(false);
			// use of the prepared statement
			PreparedStatement ps = con.prepareStatement("INSERT INTO JavaTest.Person values (?, ?, ?, ?, ?, ?)");
			ps.setInt(1, 6);
			ps.setString(2, "JDBC");
			ps.setString(3, "Sandhu");
			ps.setString(4, "sandhu@jdbc.com");
			ps.setString(5, "sandhujdbc");
			ps.setString(6, "sandhujdbc");
			//ps.setDate(3, new Date(01,17,2016));
			ps.executeUpdate();
			con.commit();
			System.out.println("records updated...");
			
		} catch (Exception e) {

			e.printStackTrace();
			if(con != null){
				try {
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		}
	}

}
