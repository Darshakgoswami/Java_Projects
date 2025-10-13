// Thread is an independent path of execution within a program
// Multithreading refers to two or more
// Tasks executing concurrently within a single program

// THREAD LIFE-CYCLE
// new, runnable,running,terminated/blocked

// new = when thread is created / when we create thread object
// start()=> the thread is not yet scheduled for running
// schedule it for running using start() method

// runnable state=> the runnable state means that the thread is ready
// for execution and is waiting for the availability of the processor

// yield()=> if we can give permission thread to relinquish
// leaving control to another
// thread of equal priority before it's turn comes
// we can do so by using
// the yield method()

// i.e. you can pause execution of current thread and let allowed
// execution of another thread with equal priority

// running means that the processor has given it's time to thread for it's execution

// it has been suspended using suspend() method. A suspend thread can be revived by using the resume() method

/* sleep()=> we can put a thread to sleep for a specified time period using the method sleep(time)
 where time is in milliseconds=> thread.sleep(3000)*/

/* it has been told to wait until some event occurs, this is done using the wait() method.
 the thread can be scheduled to run again using the notify() method*/

/* A thread is said to be blocked when it is prevented from entering into the runnable state and
subsequently the running state*/

// this happens when the thread is suspended, sleeping, or waiting in order to satisfy certain requirements

/* dead()=> every thread has a life-cycle, a running threadends, it's life when it has completed 
 executing it's run() method */

// THREAD CREATION
// thread can be created in 2 ways
// 

package Multithreading;

public class Thread_1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println(i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		Thread_1 th = new Thread_1();
		th.start();
	}
}