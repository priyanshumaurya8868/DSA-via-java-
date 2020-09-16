import java.util.*;
//Link : https://www.hackerearth.com/practice/notes/matrix-exponentiation-1/
//prob : https://www.spoj.com/problems/SEQ/
import java.io.*;
public class temp {
	private static int MOD = 1000000000;
	
	private static long fibo(int n )
	{
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

	

	
	private static long[] multiply1(long[][] trans,long[] c) {
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
				for(int  k =0 ; k < res.length; k++ ) {
					res[i][j] += (trans[i][k]* trans2[k][j])%MOD; 
				}
				res[i][j]%=MOD;
			}
		}
		return res;
	}


	public static void main(String[] args) throws Exception 
{      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long t=  Integer.parseInt(br.readLine().trim());
//		
//while(t-->0) {
//int k= Integer.parseInt(br.readLine().trim());
//		 String[] inb = br.readLine().split(" ");
//		 String[] inc = br.readLine().split(" ");
//		 
// int  n = Integer.parseInt(br.readLine().trim());
// 
//     
//      long [] b= new long[k];
//      long [] c= new long[k];
//
//      for(int i=0; i<k ;i ++) {
//    	  b[i] = Integer.parseInt(inb[i])%MOD;
//    	  c[i] = Integer.parseInt(inc[i])%MOD;
//      }
//      
//      System.out.println(linearRec(k, b, c,  n));   
//}		
System.out.println("size : ");
int s =Integer.parseInt(br.readLine().trim());
long[][] trans = new long[s][ s];


for(int i=0; i<s;i++ ) {
	 int k =0 ;
	 for(String ele : br.readLine().trim().split(" "))
       trans[i][k++] = Integer.parseInt(ele);     	
}
long[][] res = trans.clone();
  while (true) {
    trans = res ;
      System.out.println("Enter pow : ");
 int  p = Integer.parseInt(br.readLine().trim());
     trans =  pow(trans, p);
    System.out.println("\n");
    
     for(int i =0 ;i <s; i++) {
     	for(int j =0 ; j< s; j++) 
     		System.out.print(trans[i][j]+" ");
     	System.out.println();
     	}
     
  	long c[] = new long[s];  int k=0;
  	System.out.println("enter the elements for the c[]");
  	 for(String  ele : br.readLine().trim().split(" "))
  	      c[k++] = Long.parseLong(ele);
  c=	multiply1(trans, c);
  for(Long l : c)
  	System.out.println(l+"->");
  }  
        
        
}
 private static long linearRec(int k, long[] b, long[] c, int n) {
if(n <= k && n >0) return b[n-1];
  
long[][] trans = new long[k][k];
//building trans matrix
int i =0;
while(i < k-1) 
	trans[i][++i]=1;	
i=0;
while(i<k)
trans[k-1][i] = c[k-(++i)];

//System.out.println("initially trans : -");
//for(int r= 0;r<k;r++) {
//	for(int e=0;e<k;e++) {
//		System.out.print(trans[r][e]+" ");
//	}
//	System.out.println();
//}

 trans = pow(trans, n-k);
  
// System.out.println("\nfinally trans : -");
// for(int r= 0;r<k;r++) {
// 	for(int e=0;e<k;e++) {
// 		System.out.print(trans[r][e]+" ");
// 	}
// 	System.out.println();
// }
 
long[] res = multiply1(trans, b);
//System.out.println("res : -");
//for(long  h : res)
//	System.out.print(h+" ");
//System.out.println();
 
	return res[res.length-1];
	}
}


