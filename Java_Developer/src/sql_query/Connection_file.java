package sql_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_file {

	Connection con;

	public Connection getConnection() {
    try {
        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");  // Database name
           
    }
    catch(ClassNotFoundException e) {
    	e.printStackTrace();
    }
    catch(SQLException e) {
    	e.printStackTrace();
    }
	return con;
	}
        
}