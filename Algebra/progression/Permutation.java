package Algebra.progression;

public class Permutation {

//	Permutation refers to the process of arranging all the members of a given set to form a sequence.
//	The number of permutations on a set of n elements is given by n! , where “!” represents factorial.
//	The Permutation Coefficient represented by P(n, k) is used to represent the number of ways to obtain 
//	an ordered subset having k elements from a set of n elements.
	
	
private static Long permutationCoeff(int n,int k)  // O(n) -> time && O(n) -> space
{ 
Long []fact = new Long[n+1]; 

// base case 
fact[0] = (long) 1; 

// Calculate value  
// factorials up to n 
for (int i = 1; i <= n; i++) 
fact[i] = i * fact[i - 1]; 

// P(n,k) = n! / (n - k)! 
for(Long i : fact)
System.out.println(i);
return fact[n] / fact[n - k]; 
} 


	 //O(n) : O(1)-> space 
	public static int nPr(int n, int r) {
		// nPr = n!/(n-r)!
		
		
		if(n-r == n) r= n;  if(r == 0) return 1;	//edge cases 
		int res=1;
	
		for(int i = 0; i<r; i++) {
			 res*= (n-i);
		}
		return res;
	}
	public static void main(String[] args) {
   
		int n = 10;
		int r = 2;
		
		System.out.println("Method 1 : " +permutationCoeff(n, r));
		System.out.println("Method 2 : "+nPr(n, r));
      
		System.out.println(54*53*52*51);
		
	}

}
