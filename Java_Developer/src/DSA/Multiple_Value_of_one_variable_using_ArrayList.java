package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Multiple_Value_of_one_variable_using_ArrayList 
{
	int id;
	String name;
	public Multiple_Value_of_one_variable_using_ArrayList(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) 
	{
		ArrayList<Multiple_Value_of_one_variable_using_ArrayList> i = new ArrayList<Multiple_Value_of_one_variable_using_ArrayList>();
		i.add(new Multiple_Value_of_one_variable_using_ArrayList(100,"abc"));
		i.add(new Multiple_Value_of_one_variable_using_ArrayList(200,"xyz"));
		i.add(new Multiple_Value_of_one_variable_using_ArrayList(300,"qwe"));
		
		Iterator<Multiple_Value_of_one_variable_using_ArrayList> x = i.iterator();
		while(x.hasNext())
		{
			Multiple_Value_of_one_variable_using_ArrayList s= x.next();
			System.out.println(s.id+" "+s.name);
		}
	}

}