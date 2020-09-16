package Algebra.progression.matrixExponentialtion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearRecurrence {
	private static int MOD = 1000000000;

	// suitable for (3X3)*(3X1)
	private static long[] multiply1v(long[][] trans,long[] c) {
           long res[] = new long[c.length];
           
             //   (row movement of c)  *  (column movement of trans)
           for(int i =0 ;i < trans.length; i++) {
        	   for(int j =0 ;j< c.length; j++) {
        		   res[i] += (trans[i][j] * c[j])%MOD; 
        	   }    
        	   res[i]%=MOD;
           }
		return res;
	}
//******************************************************************************	
  private static long[] multiply2v(long[] c,long[][] trans) {
	  long res[] = new long[c.length];
	  // col move ->c & row move -> trans
	  for(int i=0; i < trans.length; i++) {
		  for(int j =0 ; j< trans[0].length;j++) {
			  res[i] += (c[j]*trans[j][i] )% MOD;
		  }
		  res[i] %= MOD;
	  }
	  return res;
  }

	private static long[][] pow(long[][] trans, long i) {
		long[][] res = new long[trans.length][trans[0].length];
		int i1=0;
		while(i1< trans.length) {
			res[i1][i1++] =1;
		}
		
          while(i > 0) {
        	  if(i%2 == 1)
        	     res = multiply(res,trans);
        	    trans = multiply(trans,trans);
        	  i/=2;
          } 
		return res;
	}

	public static void main(String[] args) throws Exception 
{      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t=  Integer.parseInt(br.readLine().trim());
		
while(t-->0) {
int k= Integer.parseInt(br.readLine().trim());
		 String[] inb = br.readLine().split(" ");
		 String[] inc = br.readLine().split(" ");
		 
 int  n = Integer.parseInt(br.readLine().trim());
 
     
      long [] b= new long[k];
      long [] c= new long[k];

      for(int i=0; i<k ;i ++) {
    	  b[i] = Integer.parseInt(inb[i])%MOD;
    	  c[i] = Integer.parseInt(inc[i])%MOD;
      }
      System.out.println("version 1: = "+linearRec1v(k, b, c, n));
      System.out.println("**************************************************************************");
      System.out.println("Version 2: = "+linearRec2v(k, b, c, n));//transpose version     
}			
}
private static long linearRec1v(int k, long[] b, long[] c, int n) {
if(n <= k && n >0) return b[n-1];
  
long[][] trans = new long[k][k];
//building trans matrix
int i =0;
while(i < k-1) 
	trans[i][++i]=1;	
i=0;
while(i<k)
trans[k-1][i] = c[k-(++i)];

System.out.println("initially trans : -");
for(int r= 0;r<k;r++) {
	for(int e=0;e<k;e++) {
		System.out.print(trans[r][e]+" ");
	}
	System.out.println();
}

 trans = pow(trans, n-k);
  
 System.out.println("finally trans : -");
 for(int r= 0;r<k;r++) {
 	for(int e=0;e<k;e++) {
 		System.out.print(trans[r][e]+" ");
 	}
 	System.out.println();
 }
 
long[] res = multiply1v(trans, b);

System.out.println("res : -");
for(long  h : res)
	System.out.print(h+" ");
System.out.println();
 
	return res[res.length-1];}

private static long linearRec2v(int k , long[] b , long[] c,int n) {
	if(n <= k && n >0) return b[n-1];
	 long[][] trans = new long[k][k];
	 
	 int i =1;
	 while(i < k) {
		 trans[i][i-1] =1;
		 i++;
	 }
	 i=k-1; int g=0;
	 while(i >=0)
	 {
		 trans[i][k-1]  = c[g++];
		 i--;
	 }
	System.out.println("initially trans : -");
	for(int r= 0;r<k;r++) {
		for(int e=0;e<k;e++) {
			System.out.print(trans[r][e]+" ");
		}
		System.out.println();
	}
	 trans = pow(trans, n-k);
	 System.out.println("finally trans : -");
	 for(int r= 0;r<k;r++) {
	 	for(int e=0;e<k;e++) {
	 		System.out.print(trans[r][e]+" ");
	 	}
	 	System.out.println();
	 }
	 long res[] = multiply2v(b, trans);
	 
	System.out.println("res : -");
	for(long  h : res)
		System.out.print(h+" ");
	System.out.println();
	
	return res[res.length-1];}
}
