package Final;
final class Vehicle 
{
 void display() 
 {
     System.out.println("This is a vehicle");
 }
}

/*
//Final class - cannot be extended
class Car extends Vehicle {
 void display() {
     System.out.println("This is a car");
 }
}
*/

public class Final_Class 
{
	public static void main(String[] args)
	{
		Vehicle v = new Vehicle();
	    v.display();
	}
}