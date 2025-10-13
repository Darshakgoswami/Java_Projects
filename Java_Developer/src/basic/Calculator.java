package basic;

public class Calculator {
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mul(int x1,int y1)
	{
		return x1*y1;
	}
	double div(int a1,int b1)
	{
		if(b1!=0)
		{
		return a1/b1;
		}
		else
		{
			System.out.println("invalid !");
			return 0;
		}
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a1=cal.add(50,70);
		System.out.println("addition is : "+a1);
		int s1=cal.sub(70, 60);
		System.out.println("substraction is : "+s1);
		int m1=cal.mul(80, 20);
		System.out.println("multiplication is : "+m1);
		double d1=cal.div(50,10);
		System.out.println("division is : "+d1);
	}
}