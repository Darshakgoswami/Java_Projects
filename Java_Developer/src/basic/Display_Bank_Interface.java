package basic;

public class Display_Bank_Interface 
{

	public static void main(String[] args) 
	{
		Interface_Bank b1 = new SBI();
		Interface_Bank b2 = new Axis();
		Interface_Bank b3 = new BOB();

	     System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
	     System.out.println("Axis Rate of Interest: " + b2.getRateOfInterest() + "%");
	     System.out.println("BOB Rate of Interest: " + b3.getRateOfInterest() + "%");
	 }
}