package exceptionHandling;
/*
 * The Java throw keyword is used to explicitly throw an exception.

We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception.

The syntax of java throw keyword is given below.

throw exceptionhandler
 */
public class throwKeyword {

	  static void validate(int age) throws ArithmeticException
	  {  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		   public static void main(String args[]){  
		      validate(13);  
		      validate(19);
		      System.out.println(" fewr rest of the code...");   
		  }
	
				 
	 }
	
	// even after one  throw exception noone of the remaining statement gonna execute

