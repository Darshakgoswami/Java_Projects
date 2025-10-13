package sql_query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_query {
    public static void main(String[] args) {

        Connection con;
        Connection_file c=new Connection_file();
        con=c.getConnection();

        try {
            // Prepare query
            PreparedStatement psmt = con.prepareStatement(
                "insert into stud(NAME, PASSWORD) values(?, ?)"
            );

            psmt.setString(1, "shswerweerwefail");  // username
            psmt.setString(2, "123");               // password
            psmt.executeUpdate();
            System.out.println("Data inserted successfully..");
            // Execute query
            
        }

            // Close resources
            

         catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
   }
