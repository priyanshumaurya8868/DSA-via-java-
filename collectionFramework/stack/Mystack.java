package collectionFramework.stack;
import collectionFramework.linkedlist.MyLinkedList;
public class Mystack<E> {
	//basic operation : push(), pop(), peek(), empty()
	private MyLinkedList<E> ll = new MyLinkedList<E>();
	void push(E item) {
	ll.add(item);
	}
	E pop() throws Exception {
		if(ll.isEmpty())
			throw new Exception("Stack is empty!");
		return ll.removeLast();
	}
	E peek() throws Exception {
		if(ll.isEmpty())
			throw new Exception("Stack is empty!");
		return ll.getLast();
	}
	boolean Empty() {
  return  ll.isEmpty();
		
	}
	

}
