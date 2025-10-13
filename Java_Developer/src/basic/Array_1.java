package basic;

public class Array_1 {
	
	public Array_1()
	{
		int [] arr = new int[5];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=15;
		arr[4]=16;
		
		int[] arr2 = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("first array "+arr[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("second array "+arr2[i]);
		}
		for(int v : arr) // FOR EACH LOOP
		{
			System.out.println("foreach loop : "+v);
		}
	}

	public static void main(String[] args) {
		Array_1 obj = new Array_1();
	}
}