package basic;
public class Two_D_Array {
	public Two_D_Array()
	{
		// with size
		int arr[][]=new int[3][3];
		arr[0][0]=12;
		arr[0][1]=13;
		arr[0][2]=14;
		arr[1][0]=15;
		arr[1][1]=16;
		arr[1][2]=17;
		arr[2][0]=18;
		arr[2][1]=19;
		arr[2][2]=120;
		
		// without size
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Two_D_Array();
	}
}