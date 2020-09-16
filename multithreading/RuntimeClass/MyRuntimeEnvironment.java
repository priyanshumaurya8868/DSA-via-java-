package multithreading.RuntimeClass;

import java.util.HashMap;

class t{
	public t() {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i =0;i<=100;i++) {
			hm.put(i, i);
		}
	}
}

public class MyRuntimeEnvironment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime rt = Runtime.getRuntime(); //get singleton instance of Runtime class
	
		System.out.println("No of Cores : "+rt.availableProcessors());
		System.out.println("****************** Before ********************");
		System.out.println("Total Memory : "+rt.totalMemory());
		System.out.println("Free Memory : "+rt.freeMemory());
		
		for(Long i=(long) 0;i<100;i++) {
			new t();
		}
	
		System.out.println("****************** After ********************");
		System.out.println("Total Memory : "+rt.totalMemory());
		System.out.println("Free Memory : "+rt.freeMemory());
		
		System.gc();
		System.out.println("****************** After System.gc()********************");
		System.out.println("Total Memory : "+rt.totalMemory());
		System.out.println("Free Memory : "+rt.freeMemory());
	
	
		
		
		
	}

}
