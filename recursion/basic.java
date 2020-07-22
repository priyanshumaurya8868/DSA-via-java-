package recursion;
//three 3 steps for recursion:
//	1: base case: think of the simplest possible/smallest input for this function
//	2: Breaking up the problem into small problems
//	3: Generalize : make a generalized function that solves the problem.
//	put this all together into a mathematical function or a tree
public class basic {
	public static void main(String[] args) {
		System.out.println("sum of 5 : "+sumN(15));
	System.out.println("2^4 : "+pow(2, 4));
	System.out.println("fastpow 2^4 :"+fastpow(2, 4));
	System.out.println("paths for reaching in ath ending of 4X4 grid :"+pathsmXnGrid(4, 4));
	}
public static int sumN(int n) {
	if(n==1)return 1; //base case : 
	return sumN(n-1); //generalize 
}

public static int pow(int a,int b) {    //simple O(n)
	if(b==0)return 1;
	return pow(a,b-1)*a;
}

public static int fastpow(int a,int b) {
	if(b==0)return 1;
if(b%2==0) return fastpow(a*a,b/2);  //O(log n)>
	return fastpow(a,b-1)*a;			
}

public static int pathsmXnGrid(int m,int n) {
	if(m==1||n==1) return 1;
	
	return pathsmXnGrid(m-1,n)+pathsmXnGrid(m, n-1);  
}

}
