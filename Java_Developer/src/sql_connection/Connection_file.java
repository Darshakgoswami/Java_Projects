package sql_connection;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



//jdbc api -> java to database connectivity

public class Connection_file {



	Connection con;

	public Connection gConnection() {

		//load driver class

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/dbname","root","");

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
		return con;

	}

}