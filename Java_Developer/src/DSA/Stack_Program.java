package DSA;

import java.util.Stack;

/* stack is used to store data in LIFO-FORM
Last In First Out
stack is implemented using linked list or array
stack is used in many applications like undo operation in text editor */

public class Stack_Program
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack();
		
		// push elements in stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		// print stack
		System.out.println("Stack : "+stack);
		
		System.out.println(stack.peek()); // returns the top elements of the stack without removing it
		System.out.println(stack.pop()); // removes the top elements of the stack and return it
		System.out.println(stack); // stack after pop operation
		
		// add more elements after pop operation
		stack.push(500);
		System.out.println(stack); // print stack after adding more elements
		
		// find index of an each element
		for(Integer i : stack)
		{
			System.out.println(i+" "+stack.search(i));
		}
		System.out.println(stack.isEmpty()); // check if stack is empty
		System.out.println(stack.indexOf(50));
		System.out.println(stack.get(0));
		System.out.println(stack.size()); // get the size of the stack
		System.out.println(stack.contains(30));
		
		System.out.println(stack.capacity()); // get the capacity of the stack(not available in stack class
	}

}