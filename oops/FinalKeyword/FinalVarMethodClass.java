package oops.FinalKeyword;
//you can assign final keyword to variable, classes and method :
//1 : a final variable can not be changed(initialization can be done earlier and later doesn't mater but only once)
//2 : a final method cannot be override 
//3 : a final class can not be extended 
class vehicle {
//	final vehicle() { //error
//		
//	}
	
	//final variable
	final int maxSpeed = 100;
	final static int EMI;
	
	static {
		EMI =1500;   // can also be assigned inside the constructor
	}
	
	final void start() {
		System.out.println("vehicle is starting...");
	}
	
	
}
final class car extends vehicle {
	
//	void start() {
//		System.out.println("car is starting");  //Error :-> overriding of the final method
//	}
	
}

//class wagnoR extends car{    //error : -> can;t extend final class
//	
//}
public class FinalVarMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c =new car();
		
		// c.EMI =1500;  // Error  : -> cannot assign final var in main func()
		
		System.out.println("EMI : "+c.EMI);
	
	c.start();
	
	}

}

/*Q) Can we declare a constructor final?
No, because constructor is never inherited.
Error : llegal modifier for the constructor in type vehicle; only public, protected & private are permitted
*/
