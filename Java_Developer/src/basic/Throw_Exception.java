package basic;

public class Throw_Exception 
{
	int i=-10;
	void display()
	{
		if(i>0)
		{
			System.out.println(i);
		}
		else
		{
			throw new ArithmeticException("it's Error !!!");
		}
	}
	
	public static void main(String[] args) 
	{
		Throw_Exception obj = new Throw_Exception();
		obj.display();
	}

}