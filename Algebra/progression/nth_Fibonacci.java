package Algebra.progression;

public class nth_Fibonacci {

	{
		 //		 In this method we directly implement the formula for nth term in the fibonacci series.
//		 Fn = {[(√5 + 1)/2] ^ n} / √5
//ref : - cpAlgorithms, gfg
	}
	
	 static long formulaBased(int n)
	 {
	 double phy = (1+ Math.sqrt(5))/2;
   return Math.floorMod(Math.round(Math.pow(phy, n)/Math.sqrt(5)), (1000*1000*1000));
	//	  return Math.round(Math.pow(phy, n)/Math.sqrt(5)) ;
	 }
	 
	 {//	 This another O(n) which relies on the fact that if we n times multiply the matrix M = {{1,1},{1,0}} to itself
//	(in other words calculate power(M, n )), 
//	then we get the (n+1)th Fibonacci number.	
	 
	 /*
	        F(n+1)  F(n) 
	        F(n)  F(n-1)
	  */}
	 
	
		private static int MOD = (1000* 1000* 1000);
		
		private static long fibo(int n ) {
			long F[] = new long[] {1,1};
			long c[] = new long[]{1,1};
			int  k=2; 
			
			
			long[][] trans = new long[k][k];
			trans[0][1] = 1;
			trans[k-1] = c;
		     if( n <= k) return F[n-1];
			int p = n-k;
			trans = pow(trans,p);
			
	         long res[]= multiply1(trans,F);
	         
	//System.out.print("n = "+n+" -> pow = "+p +" -> { "); for(int g =0 ;g < res.length;g++) System.out.print(res[g]+" ");System.out.print("}");
	     return res[res.length-1];
			                  
		}

		
		private static long[] multiply1(long[][] trans, long[] c) {
	           long res[] = new long[c.length];
	           for(int i =0 ;i < trans.length; i++) {
	        	   for(int j =0 ;j< c.length; j++) {
	        		   res[i] += (trans[i][j] * c[j])%MOD; 
	        	   }    
	        	      res[i]%=MOD;
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


		private static long[][] multiply(long[][] trans, long[][] trans2) {
			long[][] res = new long[trans.length][trans[0].length];
			for(int i =0; i< res.length; i++) {
				for(int  j=0; j< res[0].length; j++) {
					for(int  k =0 ; k < res.length; k++ )
					{
						res[i][j] += (1*(trans[i][k] * trans2[k][j]))%MOD; 
					}
					res[i][j]%=MOD;
					
				}
			}
			return res;
		}

	
	public static void main(String[] args) {
		System.out.println("hi");
	long sum=0;
	for(int  i=1; i<=10 ; i++)
		sum +=formulaBased(i) ;
	System.out.println(sum);
		//for(int n = 70 ; n<=100; n++)
		int n =1000;
		{
			
//			   System.out.print("n = "+n+" Formula : "+formulaBased(n));
//			      System.out.println(" -> linearRec : "+fibo(n));
		}


	}
	 
}
// w/o mod : 70
