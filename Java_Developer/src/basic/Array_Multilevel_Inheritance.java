package basic;
import java.util.Scanner;
class parent_first
{
	int id[];
	int total=0;
	double avg=0.0;
	String name[],address[];
	Scanner scn=new Scanner(System.in);
	int arr_size;
	void input()
	{
		System.out.println("enter array size");
		arr_size=scn.nextInt();
		id = new int[arr_size]; 
		name=new String[arr_size];
		address=new String [arr_size];
		
		System.out.println("enter id, name, and address");
		for(int i=0;i<arr_size;i++)
		{
			id[i]=scn.nextInt();
			name[i]=scn.next();
			address[i]=scn.next();
		}
	}
	void display()
	{
		System.out.println("your id, name and address is :");
		for(int i=0;i<arr_size;i++)
		{
			System.out.println(id[i]+" "+name[i]+" "+address[i]);
		}
	}
}

class first_child extends parent_first
{
	String subject[];
	void input()
	{
		super.input();
		subject=new String[arr_size];
		System.out.println("enter subject");
		for(int i=0;i<arr_size;i++)
		{
			subject[i]=scn.next();
		}
	}
	void display()
	{
		super.display();
		System.out.println("your subject : ");
		for(int i=0;i<arr_size;i++)
		{
			System.out.println(subject[i]);
		}
	}
}

class child3 extends first_child
{
	void display()
	{
		super.display();
		System.out.println("done !!!");
	}
}

public class Array_Multilevel_Inheritance {

	public static void main(String[] args) {
		child3 obj = new child3();
		obj.input();
		obj.display();
	}
}