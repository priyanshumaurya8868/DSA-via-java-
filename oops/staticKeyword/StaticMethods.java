package oops.staticKeyword;

/****************************************************** DISADVANTAGE OF STATIC METHOD **********************************************/
		/*****    1:   The static method can not use non static data member or call non-static method directly.
                       2: this and super cannot be used in static context.     */

class calculate
{ int number; // non-static variable, !accessible by any static method
	static int n;
	
	
	public static int cube(int n) {
		//this.n=n; // 1 : u cannot use this/super keyword in static method
	//	number = n;  // 2 : cannot access non-static field  in static method
		return n*n*n;
	}
}
public class StaticMethods {
/* java main is static so, our compiler dont need to create any object to access the main()
 * that's way it is static just to save memory
 */


	public static void main(String[] args) {
		
		int n=4;
				
		/****************************************************** ADVANTAGE OF STATIC METHOD **********************************************/
				/*****                                         1:  Acessing withoud creating obj *********       */
		System.out.println( "cube of "+ n +" : "+ calculate.cube(n));

	}

	
}

