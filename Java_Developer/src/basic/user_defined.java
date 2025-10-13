package basic;
import java.util.Scanner;
public class user_defined {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name");
		String name = scn.next();
		System.out.println("enter integer");
		int num = scn.nextInt();
		System.out.println("enter double");
		double d = scn.nextDouble();
		System.out.println(name+"\n"+num+"\n"+d);
	}
}