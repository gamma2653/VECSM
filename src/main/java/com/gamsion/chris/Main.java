package com.gamsion.chris;
import static spark.Spark.*;
import java.sql.*;
public class Main {
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		get("/hello", (request, response) -> "Hello World!");
		
	}
}
