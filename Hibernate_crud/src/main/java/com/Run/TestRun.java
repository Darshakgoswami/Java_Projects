package com.Run;

import com.dao.Datadao;
import com.model.User;

public class TestRun {
	public static void main(String[] args)
	{
		User u = new User();
		/* u.setUsername("testuser");
		u.setPassword("testpass");
		u.setEmail("test@gmail.com"); */
		
		/* u.setId(8);
		u.setUsername("Updatedname");
		u.setPassword("Updatedpassword");
		u.setEmail("Updated@gmail.com"); */
		
		/*u.setId(8);
		u.setUsername("Updatedname");
		u.setPassword("Updatedpassword");
		u.setEmail("Updated@gmail.com");*/
		
		
		
		Datadao d = new Datadao();
		// d.InsertData(u);
		// d.UpdateData(u);
		// d.DeleteData(u);
		// u=d.FetchData(1);
		
		d.FetchAllData().forEach(i->{
			System.out.println(i.getId()+" "+i.getUsername());
		});
		// System.out.println("Data Inserted !");
		System.out.println("Data Updated Successfully !");
		System.out.println("Data Deleted Successfully !");
	}
	}
