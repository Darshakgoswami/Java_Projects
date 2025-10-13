package basic;
public class Example_Encapsulation {
	private String accountHoldername;
	private int accountnumber;
	private double balance;
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
        if(amount>0) 
        {
            balance += amount;
            System.out.println("New balance : " + balance);
        } 
        else 
        {
            System.out.println("Invalid");
        }
    }
	public void withdraw(double amount)
		{
        if(amount>0 && amount<=balance) 
        {
            balance -= amount;
            System.out.println("withdraw : " + balance);
        } 
        else 
        {
            System.out.println("Invalid withdraw amount");
        }
    }
}