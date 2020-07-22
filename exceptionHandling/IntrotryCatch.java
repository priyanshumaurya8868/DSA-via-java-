package exceptionHandling;

public class IntrotryCatch {

	public static void main(String[] args) {
	int i=0;
		try{
			int u = 20/i;// runtime exception or checked exception
			
			System.out.println(" so, i = "+u); // not gonna execute due to runtime exception
		   } 
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(" i can't be zero, hence incrementing by two.. :");
			System.out.println("u = "+(20/(i+2)));
			// providing solution of the problem if u can
		
		}

	}

}
// unchecked exception: Arithmetic exception-> null pointer exception -> number format exception ->index out of bound
/*
 * int a=50/0;//ArithmeticException  
 * 
 * String s=null;  
System.out.println(s.length());//NullPointerException

String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  


* int a[]=new int[5];  
a[10]=50; //ArrayIndexOutOfBoundsException / (incase of string it'll) StringIndexOutOfBoundI

*/

