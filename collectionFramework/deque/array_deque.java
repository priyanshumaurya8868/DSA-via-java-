package collectionFramework.deque;

import java.util.ArrayDeque;

public class array_deque {

	/*    operations       :      method                    method
	 *                        (returns null/false)        (throws exception)
	 *                        
	 * insertion from head :   offerFirst(e)/offer(e)        addfirst(e)
	 * removal from head   :    pollFirst()/poll()           removeFirst()/remove()
	 * retrieval from head :    peekFirst()peek()            getFirst()/element()
	 * insertion from tail :    offerLast()                  addLast()
	 * removal from tail   :    pollLast()                  removeLast();
	 * retrieval from tail :    peekLast()                  getLast();
	 */
	
	
	
	public static void main(String[] args) {
	
//		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		
//		ad.offer(23);
//		ad.offer(22);
//		ad.offer(25); 
//		ad.offer(63);
//	ad.offerLast(324);
//		ad.element();
//		ad.element();
//		System.out.println(ad.peekFirst());
//		System.out.println(ad.pollLast());
		
		
/***************************************** stack  ds can  be implement via ArrayDeque *********************************/
		// gonna be more faster as that stack which is implementing list interface is actually extending vector that is slow due to 
	//thread saftey procedures
	ArrayDeque <Integer> stack = new ArrayDeque<>();
	stack.push(12);
	stack.push(52);
	stack.push(22); 
		stack.pop();
		stack.pop();
		System.out.println(stack.pop());//12
		if(stack.peekLast()!= null)
			System.out.println(stack.pop());
		
	
		
	}

}
