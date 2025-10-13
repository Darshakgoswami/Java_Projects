package basic;

import java.util.Scanner;

public class Employee_Display_Encapsulation 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        Employee_Program_Encapsulation obj = new Employee_Program_Encapsulation();
	        System.out.print("Enter Employee Name: ");
	        String name = sc.next();
	        obj.setName(name);
	        System.out.print("Enter Position (fresher / experi / man / other): ");
	        String pos = sc.next();
	        obj.setPosition(pos);
	        System.out.println("Name : "+obj.getName());
	        System.out.println("Position : "+obj.getPosition());
	        System.out.println("Salary : "+obj.getSalary());
	}
}