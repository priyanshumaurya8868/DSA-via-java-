package functionalInteface;
/*
 *  functional interface is an interface that contains exactly one abstract method.
 *  it can have any number of default or static methods along with object class methods
 *  java provides predefined functional interface to deal with functional programming
 *  Runnable,ActionListener,Comparable are some of the example of the functional interfaces
 */



/*
 * java lambda expression are java's first step into function programming
 * it is an anonymous function that does'nt have a name and that doesn't belong to any class
 * it provides a clear and concise way to represent a method interface via expression
 * it provide the implementation  of a function  interfaces and simplifies the software development 
 */

@FunctionalInterface
interface Cab{ // functional interface will have exactly one abstract method
	
	void bookCab();// by default public abstract 

}
@FunctionalInterface
interface Cab2{
	void bookCab(String source,String destination);
}
//class UberX implements Cab{
//	public void bookCab() {
//		System.out.println("UberX booked !! Arriving soon!!");
//	}
//}
@FunctionalInterface
interface Compare{
	int comp(int a,int b);
}

public class LambadaExpression {
 static int staticVar=1;
	public static void main(String[] args) {


//		cab cab  = new UberX(); // 1. polymorphic Statement
//		cab.bookCab();
		
		/********************* 2. ANAONYMOUS CLASSS IMPLEMNTATION *******************************/
	
//		Cab cab = new Cab() {
//			
//			@Override
//			public void bookCab() {
//				// TODO Auto-generated method stub
//				System.out.println("UberX booked !! Arriving soon!!");
//				
//			}
//		};
//		cab.bookCab();
		
		/***************************************** 3. LAMBDA EXPRESSION ****************************/
//		Cab cab = () -> {
//			System.out.println("UberX booked !! Arriving soon!!");
//		};
//		cab.bookCab();
	
/*******************************************************************************************************************************************************************************************************/
		/***************************************** LAMBDA PARAMETER ****************************/
		 /* 
		  * Zero Parameter ()->{};
		  * One parameter (para) ->{};
		  * multi-parameter (p1,p2,p3) -> {};
		  */
		Cab2 c2 = (source,des) -> {
			System.out.println("UberX booked From "+source+" to "+des+"!! Arriving soon!!");
		};  
		
	  	c2.bookCab("Prem Nagar", "Raipur");
	  	
	// you can also return something  	
	Compare cp = (a,b)->{
		
		if(a>b) return a;
		else 
			return b;
	};
	System.out.println(cp.comp(45, 34));//45
	 	 
// you can use local,static & instance variable inside the lambda expression		
	 int instanceVar =10;
	 
	 Compare cp2 = (a,b)->{
		 System.out.println(instanceVar);
		 int localVar =109;
		 System.out.println(localVar);
		 System.out.println(LambadaExpression.staticVar);
		 
			if(a>b) return a;
			else 
				return b;
	 };
	 System.out.println("Largest : "+cp2.comp(3, 34));
	
	}

}
