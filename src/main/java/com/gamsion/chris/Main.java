package com.gamsion.chris;

import static spark.Spark.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.amazon.redshift.jdbc41.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Driver myDriver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(myDriver);
		} catch (ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}

		get("/hello", (request, response) -> "Hello World!");

	}
}
