package interviewQuestions;
import java.util.*;
public class ZeroSumSubArray {

	public static void main(String[] args) {
		/* given an array, find is there exists a subarray of sum = 0
		 *  n < 10^5
		 */	boolean found =false; int sum= 0;
		 int[] a = {3,4,-1,4,3,-6,-7,2};
	     int n= a.length;
	     for(int i =0; i< n;i++) {
	    	 for(int j=i;j<n;j++) {
	          sum+=a[j];
	          if(sum==0) {
	        	 found=true;
	        	 break;
	          }
	          if(found) break;
	    		
	    	 }
	     }
		
		
		
		
		
		
		
		
		
			
//		Set<Integer> s = new HashSet<>();

//       int n= a.length;
//      
//       for(int i=0;i<n;i++) {
//    	   s.add(sum); 
//    	   sum+=a[i];
//    	   if(s.contains(sum)) {
//    		   found = true;
//    		   break;
//    	   }
//    		   
//       }
     System.out.println(found);
	}

}
