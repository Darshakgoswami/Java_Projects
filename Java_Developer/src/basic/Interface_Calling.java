//interface method ma public lakhvu compulsory che, because default abstract hoy che etle

package basic;

public class Interface_Calling implements Interface, Final
{

	public void demo2() {
		System.out.println("hello");
	}

	public void demo1() {
		System.out.println("demo 1 method");
	}

	public void demo1(int i) {	
		System.out.println("value is : "+i);
	}

	public static void main(String[] args) {
		Interface_Calling obj = new Interface_Calling();
		obj.demo1();
		obj.demo1(500);
		obj.demo2();
	}
}