package basic;;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String string) 
	{
		super(string);
	}
}
public class Custom_Exceptions_Ex {

	double balance = 1000.00;

	double withdraw = 11000.00;

	void withdraw() throws InsufficientBalanceException 
	{

	if(withdraw <= balance) 
	{

		System.out.println("Available balance"+(balance - withdraw));

	}
	else
	{
		throw new InsufficientBalanceException(" balance");
	}
	}
	public static void main(String[] args) throws InsufficientBalanceException 
	{
		Custom_Exceptions_Ex obj = new Custom_Exceptions_Ex();
		obj.withdraw();
	}
}