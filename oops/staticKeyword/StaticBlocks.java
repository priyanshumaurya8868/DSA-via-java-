package oops.staticKeyword;

public class StaticBlocks {
/* it execute before main just like pagrama as that was in c
 * it helps initializing the static variable in our program 
 */
	
		
		static {
			System.out.println("static block  : 1 ");
		}
		static{
			System.out.println("static block : 2");
		}
		public static void main(String[] args)
		{
			System.out.println("hi..!this is main block");
		}
	

}
