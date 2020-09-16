package multithreading.DaemonThread;

class Demonthread implements Runnable{
	 
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Demonthread running...");
		}
	}
}
class userthread implements Runnable{
	public void run() {
		for(int i =0;i<=100;i+=10) {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("userThread :  ->"+i+"%");
		}
	}
}
public class test {
	
	public static void main(String[] args) {
		Thread dt = new Thread(new Demonthread()); dt.setDaemon(true); dt.start();
		Thread ut = new Thread(new userthread()); 
		ut.start();
		
		// here, JVM terminates itself aand demon thread after the completion of user thread task
		
	}
	
	

}
