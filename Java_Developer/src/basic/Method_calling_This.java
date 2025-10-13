package basic;

public class Method_calling_This {
	
	void display()
	{
		System.out.println("first");
	}
	void display(int a)
	{
		this.display();
		System.out.println("second "+a);
	}
	void display(int a,int b)
	{
		display(10);
		System.out.println("third "+a+" "+b);
	}
	void display(int a, int b,int c)
	{
		display(20,30);
		System.out.println("fourth "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Method_calling_This obj = new Method_calling_This();
		obj.display(500, 200, 300);

	}

}