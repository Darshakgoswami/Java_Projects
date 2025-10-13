package basic;
import java.util.Scanner;
public class User_Defined__Two_D_array {
	public User_Defined__Two_D_array()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the numbers of row");
		int rows=scn.nextInt();
		System.out.println("enter the numbers of column");
		int cols=scn.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("enter elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		System.out.println("OUTPUT IS : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new User_Defined__Two_D_array();
	}
}