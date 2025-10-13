package basic;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scn.nextInt();
		System.out.println("enter 2nd value");
		int b = scn.nextInt();
		System.out.println("enter character");
		char operator=scn.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println("addition is : "+(a+b));
			break;
		case '-':
			System.out.println("minus is : "+(a-b));
			break;
		case '*':
			System.out.println("mul. is : "+(a*b));
			break;
		case '/':
			if(b!=0)
			{
			System.out.println("division is : "+(a/b));
			}
			else
			{
				System.out.println("it's infinite");
			}
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}
}