package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Students;
import com.util.Dbconn;

public class Datadao {

	Dbconn db = new Dbconn();
	Session session;
	Transaction tx;
	public void SaveDepartment(Students stu)
	{
		session = db.gSession();
		tx=session.beginTransaction();
		session.save(stu);
		tx.commit();
		session.close();
		System.out.println("Data Saved !");
	}
} 