/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

class GFG {
	
	
	private static BigInteger ncr(int n, int r) {
		BigInteger res= new BigInteger("1");
		if(r > n-r) n= n-r;
		for(int i =0; i< r; i++) {
			 res = res.multiply(new BigInteger(""+(n-i)));
			 res = res.divide(new BigInteger(""+(i+1)));
			//System.out.println("res -> ncr "+res);
		}
	
		return res;
	}
	private static void cat(int n) {
		BigInteger res = ncr(2*n,n);
		res = res.divide(new BigInteger(""+(n+1)));
		System.out.println(res);
	}
	
	
	
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine().trim());
			cat(n);
		}
		
	}
}