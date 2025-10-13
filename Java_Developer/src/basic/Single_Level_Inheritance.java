// method hoy to (object . ) kari ne call karvi and constructor hoy to object banavsi to automatic call thay jase 

package basic;
class parent
{
	int id=10;
	public parent()
	{
		System.out.println("Parent class : "+id);
	}
}
class child extends parent
{
	public child()
	{
		System.out.println("Child class : "+id);
	}
}
public class Single_Level_Inheritance {
	public static void main(String[] args) {
		new child();
	}
}