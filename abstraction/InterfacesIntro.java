package abstraction;
//An interface in Java is a blueprint of a class.
// interfaces can have abstract methods and variables. It cannot have a method body. 
//Java Interface also represents the IS-A relationship.
//It cannot be instantiated just like the abstract class.
//Since Java 8, we can have default and static methods in an interface.
//Since Java 9, we can have private methods in an interface.

interface printable //by default abstract  
{ 
	 // declare constant fields  
    // declare methods that  abstract   (without body)
    // default/static methods         (with body)
void print();

static void  msg1() {System.out.println("static method");} 
default void msg(){System.out.println("default method");}  

}

interface showable extends printable //inheritating printable
{
//	The Java compiler adds public and abstract keywords before the interface method.
//	Moreover, it adds public, static and final keywords before data members.
	void show() ;
}

 class testInterface implements showable{
	public void print() // public keyword required because Error :Cannot reduce the visibility of the inherited method from  showable
	{
		System.out.println("hello");
	}
	public void show() {
		System.out.println("world");
	}
	
}
public class InterfacesIntro {

	public static void main(String[] args) {
		testInterface t = new testInterface();
		t.print();
		t.show();

		// accessing default method
		printable p = new testInterface();
	 p.msg();
	 
	 // accessing static method 
	 printable.msg1();
}
}
