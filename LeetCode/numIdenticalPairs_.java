package LeetCode;
import java.util.*;
public class numIdenticalPairs_ {
	static   public int numIdenticalPairs(int[] nums) {
	      int gp =0;
	      List<Integer> repeatTeller = new ArrayList<Integer>();
	      for(int i=0;i<nums.length;i++){
	    	  if(repeatTeller.contains(nums[i]))
	    		  continue;
	    	  else {repeatTeller.add(nums[i]);
	          int n = counter(nums,i);
	          if(n>0){ 
	        	  System.out.print("gp  : "+gp);
	              gp +=(n*(n-1))/2;
	              System.out.println("-> gp  : "+gp);
	          }
	      }
	      }
	      return gp;
	  }
	  private static int counter(int[] a ,int id){
	      int count =0; 
	      for(int i=id;i<a.length;i++){
	          if(a[i] == a[id])
	              count++;
	      }
	      System.out.print(count + " ");
	      return count;
	  }
	    public static void main(String[] args) {
	   
	    	int a[]={1,2,3,1,1,3};
	    	System.out.println(numIdenticalPairs(a));
	    }

}
