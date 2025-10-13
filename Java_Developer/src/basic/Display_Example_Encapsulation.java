package basic;

public class Display_Example_Encapsulation {

	public static void main(String[] args) {
		Example_Encapsulation obj = new Example_Encapsulation();
		obj.setAccountHoldername("Darshak");
		obj.setAccountnumber(2611);
		obj.setBalance(2000.00);
		System.out.println("AccountHoldername is : "+obj.getAccountHoldername());
		System.out.println("Accountnumber is : "+obj.getAccountnumber());
		System.out.println("Balance is : "+obj.getBalance());
		obj.deposit(10);
		obj.withdraw(60);
	}
}