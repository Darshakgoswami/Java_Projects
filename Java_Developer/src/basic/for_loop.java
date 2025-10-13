package basic;

public class for_loop {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		int num=5;
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial is : "+factorial);
		int num1=6;
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				System.out.println("Factors is : "+i);
			}
		}
		int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
	}
}