package collectionFramework.priorityqueue;

import java.util.PriorityQueue;

public class CF_priorityqueue {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //here in java it is implemented via heap data structure

		
		pq.add(32);
		pq.add(24);
		pq.add(75);
		pq.add(35);
		System.out.println(pq); //un-orderdly saved in the the queue
	
		
		System.out.println(pq.remove()); // 24  -> removes priority-wise/orderdly
		System.out.println(pq.remove()); //32
		System.out.println(pq.contains(74));
		
		System.out.println();
		
		System.out.println(	pq.peek()); // or  	
		System.out.println(	pq.element()); //Retrieving the highest priority element
		
		System.out.println();
		
		System.out.println(pq.remove()); //35
		System.out.println(pq.remove()); //75  ->Throws:NoSuchElementException - if this queue is empty
		
		
	}

}
