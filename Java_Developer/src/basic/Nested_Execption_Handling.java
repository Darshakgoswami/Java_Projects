package basic;

public class Nested_Execption_Handling 
{

	public static void main(String[] args) 
	{
		System.out.println("Before Nested Exception");
		try
		{
			try
			{
				int i = 9/0;
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println("First Exception");
			}
			int a[]=new int[5];
			a[6]=90;
		}
		catch(Exception e1)
		{
			System.out.println("Second Exception");
		}
		System.out.println("Final Message");
	}

}