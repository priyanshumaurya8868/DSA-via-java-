package exceptionHandling;
import java.io.*;
public class throwsKeyword {
static void m() throws IOException{
	throw new IOException();
	
}
//There are two cases:
//Case1:You caught the exception i.e. handle the exception using try/catch.
//Case2:You declare the exception i.e. specifying throws with the method.


 static void n() throws IOException //implementing case 2:
{
	m(); 
	System.out.println("mid");
}
 
//Case1: You handle the exception
//In case you handle the exception, the code will be 
//executed fine whether exception occurs during the program or not.
	public static void main(String[] args) {
		// implementing case 1: 
		try {
			n();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
		System.out.println("rest of the code..");

	}

}
//// NOTE : You can declare multiple exceptions e.g.
//public void method()throws IOException,SQLException.


//You cannot throw multiple exceptions