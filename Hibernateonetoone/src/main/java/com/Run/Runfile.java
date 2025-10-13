package com.Run;

import com.dao.Datadao;
import com.model.Student;
import com.model.Subject;

public class Runfile {
	public static void main(String[] args)
	{
		Subject s = new Subject();
		s.setSub_id(100);
		s.setSub_name("Maths");
		System.out.println("Subject Details "+s);
		
		Student st=new Student();
		st.setRollno(1);
		st.setStd_name("xyz");
		st.setStd_email("xyz@gmail.com");
		st.setSubjects(s);
		Datadao dao=new Datadao();
		dao.SaveData(st);
		System.out.println("student Data Saved !"+st);
	}
}