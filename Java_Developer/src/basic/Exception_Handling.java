//throw uncheck exception
//throws check exception

package basic;

public class Exception_Handling 
{

	public static void main(String[] args) 
	{
		System.out.println("Before Error !");
		try
		{
		int i = 9/0;
		System.out.println(i);
		
		int a[]=new int[5];
		a[6]=90;
		
		String s = null;
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("This is Error !!!");
		}
		System.out.println("After Error !");
	}
}