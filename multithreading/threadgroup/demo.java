package multithreading.threadgroup;
import java.lang.ThreadGroup;

class t implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" running..");
	}
}


public class demo {

	
	
	public static void main(String[] args) {
		
	      t runnable = new t();  
	      t run = new t();
		
	ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
    Thread t1 = new Thread(tg1, runnable,"one");  
    t1.start();  
    Thread t2 = new Thread(tg1, run,"two");  
    t2.start();  
    Thread t3 = new Thread(tg1, run,"three");  
    t3.start();  
         
    System.out.println("Thread Group Name: "+tg1.getName());  
     tg1.list();  
   
   //  System.out.println(tg1.toString());
   
	}

}
