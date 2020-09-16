package oops.innerClassAndNestedClass.innerclasses;
// A non-static class that is created inside the another class,but outside the a method is called member inner class.

class testMemberOuter1{
	private int data = 30;
	class inner{
		void msg(){System.out.println("data is : "+data); }
	}
}
public class MemeberInnerClass {

	public static void main(String[] args) {
		
		// way we can access
		
		//1. outer object
		testMemberOuter1 out= new testMemberOuter1();
	   testMemberOuter1.inner  in  = out.new inner();
	   in.msg();
		
//	   Internal working of Java member inner class
//	   The java compiler creates two class files in case of inner class. 
//	   The class file name of inner class is "Outer$Inner". If you want to instantiate inner class, you must have to create the instance of outer class.
//	   In such case, instance of inner class is created inside the instance of outer class.
	}

}
