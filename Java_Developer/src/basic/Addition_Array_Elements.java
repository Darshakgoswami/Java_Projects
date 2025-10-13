package basic;
import java.util.Scanner;
public class Addition_Array_Elements {
	public Addition_Array_Elements()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the numbers of row");
		int rows=scn.nextInt();
		System.out.println("enter the numbers of column");
		int cols=scn.nextInt();
		int arr[][]=new int[rows][cols];
		int sum=0;
		System.out.println("enter elements");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=scn.nextInt();
                sum=sum+arr[i][j];  // Adding element to sum
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
		System.out.println("Addition is : "+sum);
	}
	public static void main(String[] args) {
		new Addition_Array_Elements();
	}
}