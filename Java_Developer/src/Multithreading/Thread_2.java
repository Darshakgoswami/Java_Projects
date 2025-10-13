package Multithreading;

// Implements the runnable interface

public class Thread_2 implements Runnable
{

	public static void main(String[] args) 
	{
		Thread_2 th = new Thread_2();
		Thread t = new Thread(th);
		t.start();
	}

	@Override
	public void run() 
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
	}
}