package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPP_RecursiveSequenceVersion_II {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int C= Integer.parseInt(br.readLine().trim());
		 while(C-->0) 
		 {
	       int k = Integer.parseInt(br.readLine().trim());
	       String[] ipB = br.readLine().trim().split(" ");
	       String[] ipC = br.readLine().trim().split(" ");
	       String[] mnp = br.readLine().trim().split(" ");
	       
	    long m = Long.parseLong(mnp[0]);
	    long n = Long.parseLong(mnp[1]);
	    int p = Integer.parseInt(mnp[2]);
	    
	    //taking long as in further journey when we perform multiply size gonna increases...
	    int i =0;
	    long[] b = new long[k];
	    for(String s : ipB) {b[i] = Long.parseLong(s); b[i++]%=p;}
	    i=0;
	    long[] c = new long[k];
	    for(String s : ipC) { c[i] = Long.parseLong(s); c[i++] %=p;}
	        System.out.println();
	   System.out.println( linearRec(m,n,p,k,b,c));
	       
		 }
	}

	private static long linearRec(long m, long n, int p, int k, long[] b, long[] c) {
if( n <= k)
	{int sum =0; // System.out.println("n<=k");
		for(int i=(int)m; i<= n; i++) {
			sum += b[i-1]%p;
			sum%=p;
		}return sum;
	}	long sum0k =0;
	for(int i=0 ; i< k; i++ ) {
		sum0k +=b[i]%p;
		sum0k%=p;
	}	long[][] trans = buildTrans(k+1, p, c);
    long[][] tn = pow(trans, n-k, p);
	long[] Fn =new long[k+1];
     for(int i =1; i<k+1; i++)
	  Fn[i] = b[b.length-i];
     if(m > k){
    	 Fn[0] =0;
         long[] res = multiply(tn, Fn, p);
    //	 System.out.println(" m >  k && n >  k");
    //	System.out.print("\nres : ");for(long e :res)System.out.print(e+" ");
    		long[][] tm= pow(trans, m-k, p);

    		long resm[] = multiply(tm, Fn, p);
    //		System.out.print("\nresm : ");for(long e :resm)System.out.print(e+" ");
    	    return (res[0]-resm[0]+resm[1])%p;
    	 
     }
	Fn[0] =sum0k;  
	//System.out.print("Fn : ");for(long e :Fn)System.out.print(e+" ");

      long[] res =multiply(tn, Fn, p);
	
	if(m==n) return res[1]%p;
if( m <= k && n > k) { //System.out.println("( m <= k && n > k)");
		long sum0m = 0;
		 for(int i =0; i<m-1; i++)  // m-1 because we need a(m) + a(m+1) +...+a(n);
		 { sum0m +=b[i]%p;
			 sum0m %=p;
		 }
		 return (res[0]-sum0m)%p;
	}
  return 0;
	}
	
	private static long[][] buildTrans(int k, long p, long[] c) {
		long[][] trans = new long[k][k];
		trans[0][0] =1; //for S(n-1);
		for(int i =1; i<= c.length; i++)
		{
			trans[0][i] = c[i-1]%p;//for s(n) = s(n-1) + a(n)
			trans[1][i] = c[i-1]%p;//for a(n) 
		}  ////for  a(n-1) a(n-2) ... a(n-k)
		for(int i=2; i<trans.length;i++) {
			trans[i][ (i-1)]=1;  
		}return trans;
	}
	
     private static long[][] pow (long[][] trans,long n, long  p)
     {
    	  
    	 if( n ==1) return trans;
    	long[][] res = new long[trans.length][trans[0].length]; 
    	for( int i=0; i< trans.length;i++) res[i][i] =1;
    	while(n > 0) {
    		if(n%2==1) 
    			res = multiply(res,trans,p);
    		trans =multiply(trans,trans,p);
    		n>>=1;
    	}
    	
    	return res;
     }

     private static long[][] multiply(long[][] trans, long[][] trans2,long p) {
 		long[][] res = new long[trans.length][trans[0].length];
 		for(int i =0; i< res.length; i++) {
 			for(int j=0; j< res[0].length; j++) {
 				for(int  k =0 ; k < res.length; k++ ) {
 					res[i][j] += (trans[i][k]* trans2[k][j])%p; 
 				}
 				res[i][j]%=p;
 			}
 		}
 		return res;
 	}
     
 	private static long[] multiply(long[][] trans,long[] c, long p) {
        long res[] = new long[c.length];
        
        for(int i =0 ;i < trans.length; i++) {
     	   for(int j =0 ;j< c.length; j++) {
     		   res[i] += (trans[i][j] * c[j])%p; 
     	   }    
     	   res[i]%=p;
        }
		return res;
	}
}
