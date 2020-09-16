package Algebra.BigInteger;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

class factorialOfLargeNum {
	public static void main (String[] args) throws Exception {
		//code
	BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
int t =  Integer.parseInt(br.readLine().trim());

while(t-->0){
   int n = Integer.parseInt(br.readLine().trim());
   BigInteger  b =  BigInteger.ONE;
   for(int i=2;i<=n;i++)
     b= b.multiply(BigInteger.valueOf(i));
   
   System.out.println(b);
   
}
	    
	    
	}
}