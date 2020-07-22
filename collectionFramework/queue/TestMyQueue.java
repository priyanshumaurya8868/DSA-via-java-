package collectionFramework.queue;

public class TestMyQueue {

	public static void main(String[] args) {
		
		MyQueue<String>  mq = new MyQueue<>();
		mq.enqueue("riya");
		mq.enqueue("priya");
		mq.enqueue("priyanshu");
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());

	}

}
