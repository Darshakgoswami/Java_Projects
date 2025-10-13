package basic;
import java.util.Scanner;
public class maths {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scn.nextInt();
		System.out.println("enter 2nd value");
		int b = scn.nextInt();
		int c = a+b;
		System.out.println("addition is : "+c);
		System.out.println("enter 1st value");
		int d = scn.nextInt();
		System.out.println("enter 2nd value");
		int e = scn.nextInt();
		int f = d-e;
		System.out.println("minus is : "+f);
		
	}
}