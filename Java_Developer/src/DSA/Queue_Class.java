package DSA;

import java.util.LinkedList;
import java.util.Queue;

// queue is used to store data in FIFO order
// FIRST IN FIRST OUT
// queue is implemented using or array

public class Queue_Class 
{

	public static void main(String[] args) 
	{
		// create queue 
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// add elements to queue
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.offer(50);
		
		// print queue
		System.out.println("Queue : "+queue);
		
		// remove elements from queue
		System.out.println(queue.poll()); // removes the head of the queue and returns it
		System.out.println(queue.remove(30));
		
		// print queue after poll operation
		System.out.println(queue);
		
		// add more elements after poll operation
		queue.add(60);
		System.out.println(queue); // print queue after adding more elements
		
		// peek at the head of the queue
		System.out.println(queue.peek()); // returns the head of the queue without removing it
		System.out.println(queue.contains(20));
	}

}