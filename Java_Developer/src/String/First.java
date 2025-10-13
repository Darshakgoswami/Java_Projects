package String;

import java.util.Scanner;

public class First
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s = " Hello World ";
		String s1 = "Hello";
        //String email = "darshak122@gmail.com";
        //int atIndex = email.indexOf('@');
        //String username = email.substring(0, atIndex);
        //System.out.println("Username: " + username);
		//---------USER DEFINED EMAIL------------
		System.out.println("enter email id :");
        String email = sc.nextLine();
        int atIndex = email.indexOf('@');
        System.out.println("output is : "+email.substring(0, atIndex));
        System.out.println(s.length());
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(3));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s1.concat("world"));
		System.out.println(s.contains("h"));
		System.out.println(s.replace("H", "x"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.substring(0,3));
		int i=10;
		String s5=String.valueOf(i);
		System.out.println(s5);
		StringBuffer sb = new StringBuffer("abcd");
		System.out.println(sb.reverse());
	}
	// string to int convert thase only digit
	// int to string valueof this thase
}