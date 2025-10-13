package basic;

import java.util.Scanner;

public class This_modifier_multiple {
	static Scanner sc = new Scanner(System.in);
	public This_modifier_multiple()
	{
		System.out.println("default constructor");
	}
	This_modifier_multiple(int a)
	{
		this();
		System.out.println("first constructor"+" "+a);
	}
	This_modifier_multiple(int a,int b)
	{
		this(10);
		System.out.println("second constructor"+" "+a+" "+b);
	}
	This_modifier_multiple(int a,int b,int c)
	{
		this(20,30);
		System.out.println("third constructor"+" "+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		This_modifier_multiple obj = new This_modifier_multiple(40,50,60);
	}
}