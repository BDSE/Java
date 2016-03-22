package com.example.db;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseUtil {

	static String DB_URL = "";
	static String DB_USER = "";
	static String DB_PASSWORD = "";

	private static void databaseDetails() throws IOException {

		FileInputStream fr = new FileInputStream("dbProperties.properties");

		Properties p = new Properties();

		p.load(fr);

		DB_URL = p.getProperty("DB_URL");
		DB_USER = p.getProperty("DB_USER");
		DB_PASSWORD = p.getProperty("DB_PASSWORD");

	}

	public static Connection getConnectionFromUtil() throws Exception {

		databaseDetails();
		
		//Driver manager is not visible constructor, its intenionlly done so to prevent it from being instantiated. so the following wont work
		//DriverManager dm = new DriverManager();

        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

		return con;
	}
}
