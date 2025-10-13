package DSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class User_Defined_Array_List 
{
	public User_Defined_Array_List()
	{
		// CREATE AN ARRAYLIST
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner scn = new Scanner(System.in);
		
		// ADD ELEMENT IN ARRAYLIST USING SCANNER
		for(int i=0;i<4;i++)
		{
			System.out.println("enter array");
			int arr = scn.nextInt();
			a1.add(arr);
		}
		 // PRINTING THE ARRAYLIST
		Iterator<Integer> x = a1.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
	}
	public static void main(String[] args) 
	{
		new User_Defined_Array_List();
	}
}