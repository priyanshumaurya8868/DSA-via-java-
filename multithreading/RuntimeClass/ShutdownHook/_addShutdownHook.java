package multithreading.RuntimeClass.ShutdownHook;

class demo extends  Thread{
	public void run() {
		System.out.println("Successfully shutdown hook task complete");
		
	}
}
public class _addShutdownHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().addShutdownHook(new demo()); //it works same as destructors in C/C++
		
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		
		try {
			Thread.sleep(1700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//````````````````````````````````````````````````````````````````````````````````````````
//`````````````````` description ````````````````````````````````````````````````````


/*
Java Shutdown Hook
The shutdown hook can be used to perform cleanup resource or save the state when JVM shuts down normally or abruptly. 
Performing clean resource means closing log file, sending some alerts or something else. 
So if you want to execute some code before JVM shuts down, use shutdown hook.

When does the JVM shut down?
The JVM shuts down when:
user presses ctrl+c on the command prompt
System.exit(int) method is invoked
user logoff
user shutdown etc.
The addShutdownHook(Thread hook) method
The addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine. Syntax:



Factory method
The method that returns the instance of a class is known as factory method.
*/