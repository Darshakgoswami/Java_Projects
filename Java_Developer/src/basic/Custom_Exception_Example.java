package basic;

class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String message) 
    {
        super(message);
    }
}

class BankAccount 
{
    private double balance;
    public BankAccount(double balance) 
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException 
    {
        if (amount > balance) 
        {
            throw new InsufficientFundsException("Insufficient balance! Withdrawal amount exceeds account balance.");
        } 
        else 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public double getBalance() 
    {
        return balance;
    }
}

public class Custom_Exception_Example 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000);
        try 
        {
            account.withdraw(1002);
        } 
        catch (InsufficientFundsException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
