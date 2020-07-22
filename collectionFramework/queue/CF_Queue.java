package collectionFramework.queue;

import java.util.LinkedList;

import java.util.Queue;

public class CF_Queue {

	public static void main(String[] args) {

		//#1 : THROWS EXCEPTION : -> add(); remove(); element();
		
		//#2 : RETURN false/null : -> offer(), poll(), peek();
		
		Queue <Integer> queue = new LinkedList<>(); // can't make queue as a object of the list class because if u then u will no longer able to use remove(). 
		// the remove(o) we have used in the ArrayList needs IndexNo as an argument  where remove() in the LinkedList class has been overloaded (that remove & return the 1st element)
	
		// func that throws exception 
		queue.add(11);
		queue.add(22);
		
		System.out.println(queue.element());//11
		System.out.println(queue.remove());//11
		System.out.println(queue.remove());//22
		
	//	System.out.println(queue.remove());  //Exception : ->  java.util.NoSuchElementException
		
		queue.offer(11);
		queue.offer(22);
		queue.offer(34);
		
		System.out.println("\n");
		
		System.out.println("Peek : ");System.out.println(queue.peek());//11   
	
	
		
		
		System.out.println("First element : "+queue.poll());
		System.out.println("Second element : "+queue.poll());
		System.out.println("Third element  : "+queue.poll());
		System.out.println("Next element : "+queue.poll());
        System.out.println("Now peek : "+queue.peek());
	}

}
