package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	final String url = "jdbc:mysql://localhost:3306/Products";
	final String Uname = "root";
	final String password ="root@123";

	public Connection dbConnection()        throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,Uname, password);
		return con;

	}
}


