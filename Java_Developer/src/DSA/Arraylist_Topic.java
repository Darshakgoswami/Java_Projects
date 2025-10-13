package DSA;
// ARRAYLIST IS A RESIZABLE ARRAY IMPLEMENTATION OF THE LIST INTERFACE

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Topic 
{
	public Arraylist_Topic()
	{
		// CREATE ARRAYLIST
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		// ADD ELEMENTS TO THE ARRAYLIST
		a1.add(10);
		a1.add(20);
		a1.add(10);
		
		// PRINTING THE ARRAYLIST
		Iterator<Integer> it = a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) 
	{
		new Arraylist_Topic();
	}

}