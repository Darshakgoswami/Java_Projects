package DSA;
// ARRAYLIST IS A RESIZABLE ARRAY IMPLEMENTATION OF THE LIST INTERFACE

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_String_Topic 
{
	public Arraylist_String_Topic()
	{
		// CREATE ARRAYLIST
		ArrayList<String> a1 = new ArrayList<String>();
		
		// ADD ELEMENTS TO THE ARRAYLIST
		a1.add("abc");
		a1.add("xyz");
		a1.add("qwe");
		
		// PRINTING THE ARRAYLIST
		Iterator<String> it = a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) 
	{
		new Arraylist_String_Topic();
	}

}