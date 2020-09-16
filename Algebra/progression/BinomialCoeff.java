package Algebra.progression;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BinomialCoeff {

	private static void nCr(int n, int r) {
		 // nCr = nC(r-1)
		if(r > n-r) {
			r= n-r;
		}
		BigInteger res = new BigInteger("1");
	//	nCk = n * (n-1) *... (n-k+1) / [k*k-1*...1]
		for(int i = 0; i< r; i++) {
			
		res=res.multiply(new BigInteger(String.valueOf(n-i)));
		res=res.divide(new BigInteger(String.valueOf(i+1)));
		}
		
		res = res.mod(new BigInteger(String.valueOf(1000*1000*1000 +7)));
		System.out.println(res);
	}
	public static void main (String[] args) throws Exception{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int t = Integer.parseInt(br.readLine().trim());
	 
	 while(t-->0) {
		 String[] a = br.readLine().split(" ");
		 int n = Integer.parseInt(a[0]);
		 int r = Integer.parseInt(a[1]);
		 nCr(n, r);
	 }
	}

}
//48049791
//1435 489