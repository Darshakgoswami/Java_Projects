package basic;

class Employee7
{
	int id = 100;
	String name = "abc";
	double salary = 50000;
	int id1 = 200;
	String name1 = "xyz";
	double salary1 = 40000;
	int id2 = 300;
	String name2 = "qwe";
	double salary2 = 25000;
	int teamsize=10;
	void display1()
	{
	System.out.println("First class is : "+id+"\n"+name+"\n"+salary);
	}
}

class manager extends Employee7
{
	void display2()
	{
		System.out.println("Second class is : "+id1+"\n"+name1+"\n"+salary1+"\n"+"teamsize is : \n"+teamsize);
	}
}

class HR extends Employee7
{
	void display3()
	{
		System.out.println("Third class is : "+id2+"\n"+name2+"\n"+salary2);
	}
}

public class Practice 
{

	public static void main(String[] args) 
	{
		manager obj = new manager();
		HR obj1 = new HR();
		obj.display1();
		obj.display2();
		obj1.display3();
	}
}