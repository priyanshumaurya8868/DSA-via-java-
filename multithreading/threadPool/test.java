package multithreading.threadPool;

//step 1
import java.util.concurrent.ExecutorService; // used for shutdown
import java.util.concurrent.Executors;

class tp implements Runnable {
	private String s;
	public tp(String s) {
		this.s = s;
	}
	private void processMsg() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(start) Message  = "+s);
		processMsg();
		System.out.println(Thread.currentThread().getName()+"(end)");
	}
		
}

public class test {

	public static void main(String[] args) {

 ExecutorService es = Executors.newFixedThreadPool(5); // threadPoll of 5 threads
 
 for(int i =0;i<= 10 ;i++) {
	 
	 Runnable r= new tp(""+i);
	 es.execute(r); 
	 
 }
 es.shutdown();
 
 while(!es.isTerminated()) { }
 // Note: that isTerminated is never true unlesseither shutdown or shutdownNow was called first.
		System.out.println("Finishing all tasks");
	}

}

