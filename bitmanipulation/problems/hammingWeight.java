package bitmanipulation.problems;
//bitShifting e.g 0110 >>>1 = 0011
public class hammingWeight {
	public static int hammingWeight(int n) {
		int ones = 0;
	    	while(n!=0) {
	    		ones = ones + (n & 1);
	    		n = n>>>1;
	    	}
	    	return ones;
	}
	
	//another way counting 
	 public static int hammingWeight2(int n) {
	        
	      int count =0; 
	        while (n!=0){
	           n = n&(n-1);
	            count++;
	        }
	        return count;
	    }
	
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(0000000000000000001111111101));

	}

}
