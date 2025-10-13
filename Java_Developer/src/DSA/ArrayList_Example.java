package DSA;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // toString method for display
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Add Employees
        empList.add(new Employee(101, "Darshak", "IT", 50000));
        empList.add(new Employee(102, "Amit", "HR", 45000));
        empList.add(new Employee(103, "Sneha", "Sales", 47000));

        // Display Employees
        System.out.println("Employee List:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Remove an employee by index
        System.out.print("\nEnter index to remove (0 to " + (empList.size() - 1) + "): ");
        int index = sc.nextInt();
        if (index >= 0 && index < empList.size()) {
            empList.remove(index);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Invalid index.");
        }

        // Display updated list
        System.out.println("\nUpdated Employee List:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        sc.close();
    }
}
