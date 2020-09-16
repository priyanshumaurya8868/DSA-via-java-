package Algebra;

public class binaryExponentiation {
	static  long binpow(long a, long b,long m) {
	    a %= m;
	   long res = 1;
	    while (b > 0) 
	    {
	    	
	        if (b %2 !=0)
	            res = res * a % m;
	        
	        a = a * a % m;
	        b >>= 1;
	      
	    }
	 	    return res;
	}
	
	
	static long fpow(long a,long b,long m)
	{
		if(b==0) return 1;

		if(b%2==0) {
			return fpow(((a)*a)%m,b/2,m)%m;
}
		else
			return (fpow(a%m,b-1,m)*a)%m;
	}
	
	// since, ((a%m)*(b%m))%m = (a*b)%m
	
	

    public static void main(String[] args) {

   System.out.print(binpow(2,2147483647,13)+" = "); 	   System.out.println(fpow(2,2147483647,13));

   System.out.print(binpow(2,3,5)+" = "); 	               System.out.println(fpow(2,3,5));
    	
   System.out.print(binpow(3,18132,17)+" = "); 	           System.out.println(fpow(3,18132,17));
   
   System.out.print(binpow(2374859,3029382,36123)+" = ");  System.out.println(fpow(2374859,3029382,36123));
 
   System.out.println(Integer.bitCount(1010)); 
    
    }
}
