package com.Run;

import java.util.ArrayList;

import com.dao.Datadao;
import com.model.Courses;
import com.model.Students;

public class TestRun {
	public static void main(String[] args)
	{
		Students stu = new Students();
		stu.setStudentName("john");
		stu.setStudentsem("1");
		
		Students stu1 = new Students();
		stu1.setStudentName("abc");
		stu1.setStudentsem("1");
		
		ArrayList<Students> stulist=new ArrayList<Students>();
		stulist.add(stu1);
		stulist.add(stu1);
		
		Courses course=new Courses();
		course.setCourseName("C");
		
		Courses course1=new Courses();
		course1.setCourseName("C++");
		
		Courses course2=new Courses();
		course2.setCourseName("EG");
		
		ArrayList<Courses> courseList=new ArrayList<Courses>();
		courseList.add(course);
		courseList.add(course1);
		courseList.add(course2);
		
		course.setStudents(stulist);
		course1.setStudents(stulist);
		course2.setStudents(stulist);
		
		stu.setCourses(courseList);
		stu1.setCourses(courseList);
		
		Datadao dao = new Datadao();
		dao.SaveDepartment(stu);
		dao.SaveDepartment(stu1);
		}
}