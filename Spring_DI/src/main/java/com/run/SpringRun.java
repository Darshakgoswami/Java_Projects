// it's Spring-DI project's Main-Method Class

package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.added.Class_Result;
import com.department.Department;
import com.phone.Phone;

public class SpringRun {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*Phone p = (Phone) context.getBean("phone");    // Casting
		System.out.println(p.getPhoneModelno()+" "+p.getPhoneName()+" "+p.getPhoneStorage());
		p.showPersonDetails();*/
		
		//{ beans.xml class ma ref ma person-class ni id pass karvani. }
		
		/*Department dept=(Department) context.getBean("Department");  // Casting
		System.out.println(dept.getDept_id()+" "+dept.getDept_name());
		dept.getEmployeeDetails();*/
		
		Class_Result al = (Class_Result) context.getBean("added");
		al.DisplayList();
	}
}