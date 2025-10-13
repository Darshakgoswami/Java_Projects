package basic;

public class Throws_Exception 
{
	int i=-10;
	void display() throws Exception
	{
		if(i>0)
		{
			System.out.println(i);
		}
		else
		{
			throw new Exception("it's Error !!!");
		}
	}
	
	public static void main(String[] args) throws Exception 
	{
		Throws_Exception obj = new Throws_Exception();
		obj.display();
	}

}