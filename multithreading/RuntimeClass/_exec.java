package multithreading.RuntimeClass;

import java.io.IOException;

class Notepad extends Thread{
	
	public void run() {
		try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
class Shutdown implements Runnable{
	@Override
	public void run() {
		try {
			Runtime.getRuntime().exec("shutdown -s -t 3000");
			//  Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");  
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
//Here you can use -s switch to shutdown system, -r switch to restart system 
//and -t switch to specify time delay.

class Restart implements Runnable{
	@Override
	public void  run () {
		try {
			Runtime.getRuntime().exec("shutdown -r -t 0");
		}catch(IOException e) {
	     e.printStackTrace();
		}
	}
}


public class _exec {

	public static void main(String[] args) {
	

//	Thread t1 = new Thread(new Notepad());
//	t1.start();
		
	//	new Thread(new Shutdown()).start();
		
		new Thread(new Restart()).start();
		
		
	}

}
