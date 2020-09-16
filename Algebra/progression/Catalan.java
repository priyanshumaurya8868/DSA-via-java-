package Algebra.progression;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Catalan {
	
	private static BigInteger ncr(int n, int r) {
		BigInteger res= new BigInteger("1");
		if(r > n-r) n= n-r; // since nCr ==nC(r-1)
		for(int i =0; i< r; i++) {
			 res = res.multiply(new BigInteger(""+(n-i)));
			 res = res.divide(new BigInteger(""+(i+1)));
			//System.out.println("res -> ncr "+res);
		}
	
		return res;
	}
	private static void cat(int n) {
		BigInteger res = ncr(2*n,n);
		// since catalanNo. = (2n)Cn / (1+n)
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


