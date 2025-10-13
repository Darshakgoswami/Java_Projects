package sql_query;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;


public class Insert_Update_Queryy {
	
	Connection_file c=new Connection_file();
	Connection con=c.getConnection();
	
	public void insertData() {
		
		// statement in java

		// statement -> create statement

		// prepared statement -> precompile the sql query

		// callable statement -> call the stored procedure

		try {

			PreparedStatement psmt = con.prepareStatement("insert into student(NAME,PASSWORD) values(?,?)");

			psmt.setString(1, "user3454");

			psmt.setString(2, "987654@A7");

			int i = psmt.executeUpdate();

			if (i > 0) {

				System.out.println("data inserted");

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}
	
	public void updateData() {
		
		try {

			PreparedStatement psmt = con.prepareStatement("update student set NAME=?,PASSWORD=? where ID=?");

			psmt.setString(1, "updateduser");

			psmt.setString(2, "updatedpwd");

			psmt.setInt(3, 1);

			int i = psmt.executeUpdate();

			if (i > 0) {

				System.out.println("Data updated");

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
	
	public void deleteData() {
		
		try {

			PreparedStatement psmt = con.prepareStatement("delete from student where ID=?");

			psmt.setInt(1, 5);// 5 is id

			int i = psmt.executeUpdate();

			if (i > 0) {

				System.out.println("data deleted");

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
	
	public void selectData() {
		
		try {

			PreparedStatement psmt = con.prepareStatement("select * from student");//

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("id") + "  " + rs.getString("NAME") + "     " + rs.getString("PASSWORD"));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
	
	public void selectDataId() {
		
		try {

			PreparedStatement psmt = con.prepareStatement("select * from student where id=?");

			psmt.setInt(1, 1);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt("id") + "  " + rs.getString("NAME") + "     " + rs.getString("PASSWORD"));

			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
	
	public void loginData() {
		
	    try {

	        PreparedStatement psmt = con.prepareStatement("select * from student where NAME=? and PASSWORD=?");

	        psmt.setString(1, "user3");     

	        psmt.setString(2, "987654");    
	        
	        ResultSet rs = psmt.executeQuery();
	        
	        if (rs.next()) {

	            System.out.println("Login Successful!");

	        } else {

	            System.out.println("Invalid username or password. Try again!");

	        }

	    } catch (SQLException e) {

	        e.printStackTrace();

	    }

	}
	
	public void display()
	{
		try {
			PreparedStatement ps = con.prepareStatement("SELECT s.Acc_number,s.NAME,t.id AS transaction_id,t.amount,t.type,t.date FROM student s JOIN TRANSACTION t ON s.Acc_number = t.acc_no");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("account number:"+rs.getInt("Acc_number")+"\tname:"+rs.getString("NAME")+"transaction id:"+rs.getInt("transaction_id")+"amount"+rs.getDouble("amount")+"type:"+rs.getString("type")+"date:"+rs.getDate("date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Insert_Update_Queryy iq = new Insert_Update_Queryy();

		//iq.insertData();

		// iq.updateData();

		// iq.deleteData();

		// iq.selectData();

		// iq.selectDataId();

		//iq.loginData();
		
		iq.display();

	}
}