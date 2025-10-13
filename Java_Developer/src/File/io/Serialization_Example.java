package File.io;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.io.Serializable;

class Employee implements Serializable {

	int id;

	String name;

	String department;

	double salary;

	public Employee(int id, String name, String department, double salary) {

	this.id =id;

	this.name = name;

	this.department = department;

	this.salary = salary;

}

}

public class Serialization_Example {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// TODO Auto-generated method stub

		Employee emp = new Employee(111,"Rajesh","IT",600000.00);

		FileOutputStream fout = new FileOutputStream("test.txt");

		ObjectOutputStream oo = new ObjectOutputStream(fout);

		oo.writeObject(emp);

FileInputStream fin = new FileInputStream("test.txt");

// Deserialization of object

ObjectInputStream os = new ObjectInputStream(fin);

Employee employee = (Employee) os.readObject();

System.out.println("" + employee.id + " " + employee.name + " " + employee.department + " " + employee.salary);

	}
}