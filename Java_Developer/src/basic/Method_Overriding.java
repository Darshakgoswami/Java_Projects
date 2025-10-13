package basic;
class parent2
{
	void display()
	{
		System.out.println("parent class");
	}
	void display(int i)
	{
		System.out.println(i);
	}
}
class child2 extends parent2
{
	void display()
	{
		super.display();
		super.display(500);
		System.out.println("child class method");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		child2 c = new child2();
		c.display();
	}
}