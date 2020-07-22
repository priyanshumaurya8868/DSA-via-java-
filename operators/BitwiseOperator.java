package operators;

public class BitwiseOperator {
 public static void main(String[] agrs)
 {
	 /* bit wise operator are :-
	  * AND '&'   (only when both are true then true)
	  * OR  '|'   (only when both are false then false)
	  * XOR   '^' (only when both are same then false)
	  * NOT  '!'   (used to reverse the output)
	  * Right-shift '>>' (shift every bit towards right side)
	  * left-shift  '<<' (shift every bit towards left side)
	  */
	 
	 // AND Operator
	 
	 int a=6;  // in terms of binary 110
	 int b=4;  // in terms of binary 100
	 int c= a&b;//         a & b  =  100 (i.e 4 in decimal)
	 System.out.println("a & b = "+c);
	  
	 // OR Operator
	    //a=6      // in terms of binary 110
	   //b=4       // in terms of binary 100
             c= a|b;//         a & b  =  110 (i.e 6 in decimal)
	 System.out.println("a | b = "+c);
	 
	 //  XOR Operator
	 /*
	  * 4 = 100
	  * 6 = 110
	  *4^6= 010 (i.e 2 in decimal)
	  */
	 System.out.println("a ^ b = " +(a^b)); //need to use parenthesis '()'after + sign
	  
	 // Right-Shift   right most bit disappears and each bit shifted in right side 
	 
	  /* 13 = 1101 >> 0110 >> 0011 >> 0001 >> 0000
	   *   =>  13      6       3       1       0
	   */
	  int d =13;
	  System.out.println("One time right shift : "+(d >> 1));
	  System.out.println("Two time right shift : "+(d >> 2));
	  System.out.println("Three time right shift : "+(d >> 3));
	  System.out.println("Four time right shift : "+(d >> 4));
	  
	  // Left-Shift   (one more bit(i.e zero) adding on the  right most  place) , size ++
	  
	  
	  /*      0000 << 1000 << 0100 << 11010 << 1101
	   *   =>  0        8       4     26      13
	   */
	  System.out.println(" ");
	  int e =13;
	  System.out.println("One time left shift : "+(e <<  1));
	  System.out.println("Two time left shift : "+(e << 2));
	  System.out.println("Three time left shift : "+(e << 3));
	  System.out.println("Four time left shift : "+(e << 4));
	  
	  
	 
 }
}
