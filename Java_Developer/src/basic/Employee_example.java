package basic;

import java.util.Scanner;

class Employee 
{
    String name;
    String position;

    void getDetails() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.next();
        System.out.print("Enter Position (fresher / experi / manager / other): ");
        position = sc.next();
    }
}

class Salary extends Employee 
{
    int salary;
    void calculateSalary() 
    {
        if (position.equals("fresher")) 
        {
            salary = 18000;
        } 
        else if (position.equals("experi"))
        {
            salary = 35000;
        } 
        else if (position.equals("manager")) 
        {
            salary = 50000;
        } 
        else
        {
            salary = 5000;
        }
    }

    void displayDetails() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: +" + salary);
    }
}

public class Employee_example 
{
    public static void main(String[] args) 
    {
        Salary emp = new Salary();
        emp.getDetails();
        emp.calculateSalary();
        emp.displayDetails();
    }
}