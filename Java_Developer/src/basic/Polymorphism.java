package basic;
// Polymorphism means function name same but parameter different, it's only uses in function.
public class Polymorphism {
	void pol()
	{
		System.out.println("hello 1");
	}
	void pol(int i)
	{
		System.out.println("value is : "+i);
	}

	public static void main(String[] args) {
		Polymorphism obj=new Polymorphism();
		obj.pol();
		obj.pol(10);
	}

}