package basic;

import java.util.Scanner;

class Employee_Program_Encapsulation 
{
    private String name;
    private String position;
    private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
        if (position.equals("fresher")) 
        {
            this.salary = 18000;
        } 
        else if (position.equals("experi")) 
        {
            this.salary = 35000;
        } 
        else if (position.equals("man")) 
        {
            this.salary = 50000;
        } 
        else
        {
            this.salary = 5000;
        }
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
}