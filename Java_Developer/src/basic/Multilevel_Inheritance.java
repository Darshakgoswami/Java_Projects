// method_overriding means name of method and paremeter same hoy but class different hoy.
// method_overloading means class name same hoy and parameter different hoy, means te 1 j class ma banavu.

package basic;
class a
{
	void demo()
	{
		System.out.println("first");
	}
}
class b extends a
{
	void demo()
	{
		super.demo();
		System.out.println("second");
	}
}
class c extends b
{
	void demo()
	{
		super.demo();
		System.out.println("third");
	}
}
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		c obj = new c();
		obj.demo();
	}
}