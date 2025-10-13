package basic;

class Employee789 {
    int id;
    String name;

    Employee789(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee789 {
    double salary;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmployee extends FullTimeEmployee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(int id, String name, double salary, double hourlyRate, int hoursWorked) {
        super(id, name, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void displayDetails() {
        super.displayDetails();
        double total = hourlyRate * hoursWorked;
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Payment: " + total);
    }
}

public class Parent_Exp {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(101, "abc", 50000);
        PartTimeEmployee pte = new PartTimeEmployee(102, "xyz", 0, 200, 20);

        System.out.println("Full Time Employee Details:");
        fte.displayDetails();

        System.out.println("\nPart Time Employee Details:");
        pte.displayDetails();
    }
}