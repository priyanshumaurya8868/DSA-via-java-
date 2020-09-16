import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TestClass {
	
	private static void ncr(int n, int r) {
		//if(n<=0 || r < 0 || n < r) {System.out.println("0"); return;}
		if( r  > n-r)
			r= n-r;
		// ncr = n*(n-1)*...*(n-k+1)/ [k*(k-1)...1]
		BigInteger res = new BigInteger("1");
		for( int i=0; i < r; i++) {
			res = res.multiply(new BigInteger(String.valueOf(n-i)));
			res = res.divide(new BigInteger(String.valueOf(1+i)));
		}
		System.out.println(res);
	}
	
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] ip1 = br.readLine().trim().split(" ");
	String[] ip2 = br.readLine().trim().split(" ");
	 int N = Integer.parseInt(ip1[0]);  int k = Integer.parseInt(ip1[1]);
	int temp =0;int count=0;
	 for(int i =0; i < N; i++) {
		 temp = Integer.parseInt(ip2[i]);
		 if(temp%2 ==0) count++;
	 }
	
	ncr(count, k);
	
}
}
