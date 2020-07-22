package collectionFramework.deque;

import java.util.NoSuchElementException;

public class MyDeque<E> {
	
	static class Node <G>{
		public G data;
		public Node <G> next,pre;
//		Node()
//		{
//			}
		Node(G item){
			this.data =item;
		}
		}
	Node<E> front,rear; 
	
	// opt :ins ,del get isEmpty
	public void insertionFront(E item) {
		Node<E> temp = new Node<>(item);
		
		
 		if(front==null || rear == null) {
			rear= front= temp;
		}
 		else
 			{front.pre =temp;
 			temp.next=front;
 			front =front.pre;
 		}
 		 	}
	public void insertionRear(E item) {
		Node<E> temp = new Node<>(item);
 		if(front==null || rear == null) {
			rear= front= temp;
		}
 		else {
 			rear.next = temp;
 			temp.pre =rear;
 			rear= rear.next;
 			}	
 		}
	public E deleteFront() {
		 if(front.next==null) {
			 E temp = front.data ;
			 front = rear = null;
			 return temp;
		 }
		 else {
		 
		 if(!isEmpty()) {
		Node<E> toDel = front;
		front = front .next;
		front.pre =null;
		return toDel.data;
		 }
		 else 
			 throw new NoSuchElementException();
	 }
	 }
	 
	 public E deleteRear() {
	if(rear.pre == null) {
		E temp = rear.data;
		rear =front= rear.pre;
		return temp;
	}
	else
	{
		if(isEmpty())
			 throw new NoSuchElementException();
		 else {
			 Node<E> toDel =rear;
			 rear =rear.pre;
			 rear.next =null;
			 return toDel.data;
		 }
	}
	 }
	boolean isEmpty() {
		return (front==null && rear==null);
	}
 
 public E getFront() {
	 if(isEmpty()) {
		 return null;
	 }
	 else
		 return front.data;

 }
 public E getRear() {
	 if(isEmpty()) {
		 return null;
	 }
	 else
		 return rear.data;

	  }
 
 public void showData(){
	 Node<E> f =front,r= rear;
	 
	  System.out.print("[");
	  
	  while(f!=null)
	  {
		  System.out.print(f.data+"->");
		  f=f.next;
	  }
	  System.out.println("]");
	  System.out.print("[");
	  while(r!=null)
	  {
		  System.out.print(r.data+"<-");
		  r=r.pre;
	  }
	  System.out.println("]");
  }
}
