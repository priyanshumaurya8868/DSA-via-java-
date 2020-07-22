package abstraction;


//	A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. 
//  It needs to be extended and its method implemented. It cannot be instantiated.
//	Points to Remember :-
//	An abstract class must be declared with an abstract keyword.
//	It can have abstract and non-abstract methods.
//	It cannot be instantiated.
//	It can have constructors and static methods also.
//	It can have final methods which will force the subclass not to change the body of the method.
abstract class car {
	car (){
		System.out.println("Car has been created..");
	}
	//no defination required after all  they are gonna  replace
	
	
	public abstract void acc();
	
	abstract void breaking();
	
	public void honk() {
		System.out.println("car is honking..");
	}
}
class WagnoR extends car{
public void acc() {
	System.out.println("wagnoR is accelerating..");
	
}
public void breaking() {
	System.out.println("wagnoR is breaking..");
}
}
class Audi extends car{
	public void acc() {
		System.out.println("Audi is accelerating..");
		
	}
	public void breaking() {
		System.out.println("Audi is breaking..");
}
}

class repairShop{
	public void repair(car c) {
		System.out.println("car is reparired");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
	
		car c;
		
		c=new WagnoR();
		c.acc();
		c.breaking();
		System.out.println();
	c = new Audi();
	c.acc();
	c.breaking();
	//concrete method (method with some body in abstract class)
	c.honk();
	
	
		

   
		
	}

}
