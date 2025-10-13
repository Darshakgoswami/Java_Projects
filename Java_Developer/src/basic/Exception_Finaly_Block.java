// FINALLY BLOCK NI UPAR SIDE TRY CATCH J COMPULSORY HOVU J JOE AE
// FINALLY BLOCK ALWAYS EXECUTE THASE, EXCEPTION HOY KE NA HOY

package basic;

public class Exception_Finaly_Block 
{
	public Exception_Finaly_Block()
	{
	try
	{
		int a=10/0;
		System.out.println(a);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("This is Finally-Block in Exception-Handling");
	}
	}
	public static void main(String[] args) 
	{
		new Exception_Finaly_Block();
	}

}