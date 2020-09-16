package oops.innerClassAndNestedClass;

class outer{
	static int  data = 332;
	int val =43;
	static class inner{
	 inner(){
			System.out.println(data);
		//	System.out.println(val); //error -> cannot access non static members.
		}
		static void func() {
			System.out.println("accessing a static func()");
		}	
	}
}
public class StaticClass {

	public static void main(String[] args) {
	
		
		outer.inner  oi = new outer.inner(); //no need to create an outer object
		
		
       outer.inner.func(); //no need to create the instance of static nested class  
	}

}
//A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.
//
//It can access static data members of outer class including private.
//Static nested class cannot access non-static (instance) data member or method.