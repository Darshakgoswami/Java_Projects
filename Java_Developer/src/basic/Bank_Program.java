package basic;
import java.util.Scanner;
public class Bank_Program 
{
	private double balance;
	
	Bank_Program(double balance)
	{
		this.balance=balance;
	}
	
	void deposit(double amount) 
	{
        if (amount > 0) 
        {
            balance = balance + amount;
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
	
    void showAmount() 
    {
        System.out.println("Current Balance: " + balance);
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial amount: ");
        double initial = sc.nextDouble();
        Bank_Program myAccount = new Bank_Program(initial);
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        myAccount.deposit(depositAmount);
        myAccount.showAmount();
	}
}