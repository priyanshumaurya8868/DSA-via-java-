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
		System.out.println("\nCar has been created..");
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
	
	
		
	 car c1= new car() {
		 
	//from here	
		@Override
		void breaking() {
			// TODO Auto-generated method stub
			System.out.println("new breaking() of anonymous inner class");
		}
		
		@Override
		public void acc() {
			// TODO Auto-generated method stub
			System.out.println("new acc of annoymous class!!");
			
		}
		// to here, there is an anonymous class (with no name) , have to define each time when u want to use it, 
		//there  is compulsion to define each abstract method again 
	}; // remember this ;
    
	c1.acc();
	c1.breaking();
	c1.honk();
		
 // ~ly  u can define an interface too
//	interface Eatable{  
//		 void eat();  
//		}  
//		class TestAnnonymousInner1{  
//		 public static void main(String args[]){  
//		 Eatable e=new Eatable(){  
//		  public void eat(){System.out.println("nice fruits");}  
//		 };  
//		 e.eat();  
//		 }  
//		}
	//}
	
	
	}

}
