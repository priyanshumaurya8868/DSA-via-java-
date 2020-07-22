package collectionFramework.linkedlist;



public  class MyLinkedList<E>  {
	public  Node<E> head;

public static class Node<G>{
	public	G data;
		public Node<G> next;
		
		public Node(G data){
			this.data =data;
		}
	}

public void add(E item) {
	Node<E> toInsert = new Node<>(item);
	if(head == null)
	{
		head =toInsert;
		return;
	}
	Node<E> temp  =head;
		while(temp.next!= null) {
			temp= temp.next;
		}
		temp.next = toInsert;
	}

 public void print() {
	 Node<E> temp = head;
	 while(temp!= null) {
		 System.out.print(temp.data+"->");
	
	 temp = temp.next;
 } System.out.println("null");
 }
 
 public void add(int index,E item) {
	 Node<E>  toInsert = new Node<>(item);
	 if(index== 0) {
	toInsert.next= head;
	head=toInsert;
	return;
	 }
	 int i = 0; Node<E> temp = head;
	 while(i<index-1) {
		 i++;
		 temp=temp.next;		 
	 }
	
	  toInsert.next =temp.next;
	  temp.next = toInsert;
 }
 public  void set(int index,E item) {
		 Node<E>  toInsert = new Node<>(item);
		 if(index== 0) {
		toInsert.next= head;
		head=toInsert;
		return;
		 }
		 int i = 0; Node<E> temp = head;
		 while(i<index-1) {
			 i++;
			 temp=temp.next;		 
		 }
		
		  toInsert.next =temp.next.next;
		  temp.next = toInsert;
	 }
  public void remove(int index) {
	 
	  
	  if(index==0) {
		  head=head.next;
		  return;
	  }
		 
	  
	  int i =1; Node<E> temp= head;
	  while(i < index) {
		  i++;
		  temp =temp.next;
	  }
	  temp.next = temp.next.next;
	  
  }
 public  boolean isEmpty() {
	  return head== null;
  }
  public E removeLast()throws Exception {
		 if(head== null)
		  throw new Exception();
		 Node<E> temp = head , toRemove;
		 if(temp.next==null) {
			 toRemove = temp;
			 head= null;
		 }
		 else {
		 while(temp.next.next!=null) {
			 temp =temp.next;
		 }
		 toRemove = temp.next;
		 temp.next=null;
		 
		 }
		 return toRemove.data;
	  }
  public E getLast()throws Exception {
		 if(head== null)
		  throw new Exception();
		 Node <E>temp = head , toRemove;
		 if(temp.next==null) {
			 toRemove = temp;
			
		 }
		 else {
		 while(temp.next.next!=null) {
			 temp =temp.next;
		 }
		 toRemove = temp.next;
 
		 }
		 return (E) toRemove.data;
	  }
  
}

