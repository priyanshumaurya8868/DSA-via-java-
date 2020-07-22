package collectionFramework.queue;
import collectionFramework.linkedlist.MyLinkedList.Node;
public class MyQueue<E> {
// #via linkedlist
Node<E> head,rear;

public void enqueue(E item) {
	Node<E> temp = new Node<>(item);
	if(head == null || rear== null) {
		head = rear = temp;
	}
	else 
	{	rear.next = temp;
	rear = rear.next;

}
}
public E dequeue() {
	 E temp=head.data;
	if(head.next==null)
	{
			head= rear = head.next;
	}
	else 
		head = head.next;
	return temp;		
}
boolean isEmpty() {
	return head==null;
}
public E peek()	{
	if(!isEmpty()) {
		return head.data;
	}
	else
		return null;
}

}
