package basic;

public class Encapsulation_Display {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setId(100);
		obj.setName("darshak");
		obj.setAddress("Dwarka");
		System.out.println("ID is : "+obj.getId());
		System.out.println("Name is : "+obj.getName());
		System.out.println("Address is : "+obj.getAddress());
	}
}