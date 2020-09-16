package string;

import java.util.Arrays;

public class StringComparisons {
	public static void main(String[] args) {
		/******************************************  COMPARITION **********************************************************************************************/
		
		/* ways :  3 
		 * ***********************************   boolean value ****************************************
		 *  1-> by == (compare String their reference )
		 *  2-> by equals()  (compare with their content) 
	      2.1-> by equalsIgnoreCases (do the same job by ignoring cases of the String)
	      
	      ***********************************  int return *****************************************************************************************
		 *  3-> by compareTo() (compare lexicographically the content of string  and return integer) 
		     if s1>s2 (i.e s1.compareTo(s2) = +ve value; )
		     if s1<s2 (i.e s1.compareTo(s2) = -ve value; )
		     if s1==s2 (i.e s1.compareTo(s2) = 0; )
		  */
			
		
			
			String s1 ="Priyanshu";
			System.out.println("s1 = "+s1);
			
			String s2 ="Priyanshu";
			System.out.println("s2 = "+s2);
			
			String s3 =new String("Priyanshu");
			System.out.println("s3 = "+s3);
			
			
			
		    System.out.println(s1==s2);
			 
			System.out.println("Apni Kaksha :" + s1==s2); //hence we can't write any string in the begnning if we are using == for comparision 
		
			System.out.println("    s1.equals(s2) : "+s1.equals(s2));
			
			System.out.println("    s1.compareTo(s2) : "+s1.compareTo(s2));
			
			System.out.println("*****comparing s1 and s3***************");
			
			System.out.println(s1==s3); //false
			System.out.println(s1.equals(s3));//true
			System.out.println(s1.compareTo(s3));//0
			
			String s4 = "PRIYANSHU";
			System.out.print(s4);  System.out.println(" Vs "+s1);
			
			System.out.print("==  : ");
			System.out.println(s1==s4);
			System.out.println("s1.equals(s4) : "+ s1.equals(s4));
			System.out.println("s1.equalIgnoreCases(s4) : "+s1.equalsIgnoreCase(s4));
			System.out.println("s1.compareTo(s4) : "+ s1.compareTo(s4)); //lower case have larger value
			
			      
			
			String s5 ="abc";
			String s6 = "cba";
			System.out.println();
			System.out.println(s5.compareTo(s6));
					 
			String se = s5+s6;
		char[] ch	 = se.toCharArray(); Arrays.sort(ch);
		

	      

	}
}
