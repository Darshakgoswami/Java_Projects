// Constructor Injection

package com.employee;

public class Employee {
int Emo_id;
String Emp_name;
public Employee(int emp_id,String emp_name)
{
	this.Emo_id=emp_id;
	this.Emp_name=emp_name;
}
public int getEmo_id() {
	return Emo_id;
}
public void setEmo_id(int emo_id) {
	Emo_id = emo_id;
}
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}
}