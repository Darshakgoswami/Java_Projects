// join method is used when new thread needs to wait for another thread to finish before execution

package Multithreading;

public class Thread_4 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread_4 th=new Thread_4();
		Thread_4 th1=new Thread_4();
		Thread_4 th2=new Thread_4();
		th.start();
		th.join();
		th1.start();
		th2.start();
	}
}