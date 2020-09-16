package multithreading;
// join() :  it causes the currently running threads to stop executing until the thread it joins with completes its task.
class joinThread implements Runnable{
	public void run() {
		for(int i =0;i<=100;i+=10) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+" ->"+i+"%");
		}
	}
}

public class joinFunc {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new joinThread());
		Thread t2 = new Thread(new joinThread());
		Thread t3 = new Thread(new joinThread());
		t1.setName("@@ 1st Thread");
		t2.setName("## 2nd Thread");
		t3.setName("$$ 3rd Thread");
		
		
		t1.start();t1.join(3000); // only t1 will  run for next 3sec 
		                   
		t2.start();    //after 3sec t1,t2 & t3 will  run concurrently 
		t3.start();
//``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
	// only t1 will  excecute till it finish
//		t1.start();t1.join();   
//		t2.start();
//		t3.start();
		
		
		
	}

}
