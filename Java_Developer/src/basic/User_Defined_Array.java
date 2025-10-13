package basic;
import java.util.Scanner;
public class User_Defined_Array {
	public User_Defined_Array()
	{
		int total=0;
		double average=0.0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scn.nextInt();
		int number[]=new int[size];
		String name[]=new String[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the numbers");
			number[i]=scn.nextInt();
			System.out.println("enter the names");
			name[i]=scn.next();
		}
		int min = number[0];
		for (int i = 0; i < size; i++) {
		    if (min > number[i]) {
		        min = number[i];
		    }
		}
		System.out.println("Minimum number in the array : " + min);
		int max=number[0];
		for (int i=0;i<size;i++)
		{
			System.out.println("numbers are : "+number[i]);
			System.out.println("names value are : "+name[i]);
			total+=number[i];
			average=(double)total/size; // type-casting, int ne double ma convert karyu.
			if(max<number[i])
			{
				max=number[i];
			}
			if(max==number[i])
			{
				System.out.println("maximum value is at index position : "+i);
			}
		}
		System.out.println(""+ "total of the array values are : "+total);
		System.out.println(""+"average of the array values are : "+average);
		System.out.println(""+"Maximum number in the array : "+max);
	}
	public static void main(String[] args) {
		new User_Defined_Array();
	}
}