package multithreading.PriorityOfThreads;

class thread extends Thread{
	
	public void run() {
		{
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+"|Priority :"+currentThread().getPriority());
		}
	}
	
}



public class Priority {

//	3 constants defined in Thread class:
//		public static int MIN_PRIORITY  //i.e 1
//		public static int NORM_PRIORITY //i.e 5
//		public static int MAX_PRIORITY  //i.e 10
	
	//preemptive scheduling
	
	
	public static void main(String[] args) {
	
		thread t1= new thread(); t1.setPriority(Thread.MIN_PRIORITY); t1.setName("@@ 1st"); 
		//thread t2 = new thread();t2.setPriority(Thread.NORM_PRIORITY); t2.setName("## 2nd"); t2.start();
		thread t3 = new thread();t3.setPriority(Thread.MAX_PRIORITY); t3.setName("$$ 3rd"); 
		
		 t3.start();

		 t1.start();
	}

}
// there is no guarantee that t3 executes first every time....