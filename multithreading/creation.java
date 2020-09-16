package multithreading; //javaTpoint

//There are two ways to create a thread:
//
// 1) By extending Thread class.
// 2) By implementing Runnable interface.


// benifical we want to  perform inheritance  & multiThreading together (as multiple inheritance not sported in java)
class t1 implements Runnable{
	 
	// there is a need of define  [public abstract void run()]
	@Override
 public void  run(){
		for(int i =10;i<=100;i+=10)
		{
			 System.out.println(Thread.currentThread().getName()+" -"+i+"%"  );
			  // currentThread is just like a [ this keyword for threads]
			 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 }
}
//`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
 // we generaly  extends Thread  when we aim to override some other method beside run() too 
class t2 extends Thread{
	 public void  run(){
			for(int i =10;i<=100;i+=10)
			{
				 System.out.println(Thread.currentThread().getName()+" -"+i+"%"  );
				 try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	 }
}

public class creation {
	public static void main(String[] args) {
		
 // 1. interface Runnable
		Runnable r= new t1();
		Thread thread1 = new Thread(r); // in-order to use methods of thread class
		
// 2.  extending  Thread class
		t2 thread2  = new t2();
		
		thread1.start();
		thread2.start();
		
	}

}
