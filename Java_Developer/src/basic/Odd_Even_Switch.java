package basic;
import java.util.Scanner;

public class Odd_Even_Switch {

	static int checkOddEven(int num) {
        if (num % 2 == 0) {
            return 0;
        } 
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        switch (checkOddEven(number)) {
            case 0:
                System.out.println(number + " is Even.");
                break;
            case 1:
                System.out.println(number + " is Odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}