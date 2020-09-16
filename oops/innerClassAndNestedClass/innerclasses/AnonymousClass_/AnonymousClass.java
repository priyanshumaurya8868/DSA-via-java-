package oops.innerClassAndNestedClass.innerclasses.AnonymousClass_;

//A class that have no name is known as anonymous inner class in java. 
//It should be used if you have to override method of class or interface. 
//Java Anonymous inner class can be created by two ways:
//
//1. Class (may be abstract or concrete).
//2. Interface

abstract class car {
car (){
	System.out.println("\nCar has been created..");
}
public abstract void acc();

abstract void breaking();

public void honk() {
	System.out.println("car is honking..");
}
}


public class AnonymousClass {
	
	
public static void main(String[] args) {

	
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


//what happen  actually ??
//		a class is created that extends car class and its name will be decided  by the compiler 
//provide the implementation of the breaking() and acc() method
// and the object of the anonymous class is refereed by the c1 reference variable of car type.

c1.acc();
c1.breaking();
c1.honk();
	
// ~ly  u can define an interface too
//interface Eatable{  
//	 void eat();  
//	}  
//	class TestAnnonymousInner1{  
//	 public static void main(String args[]){  
//	 Eatable e=new Eatable(){  
//	  public void eat(){System.out.println("nice fruits");}  
//	 };  
//	 e.eat();  
//	 }  
//	}
//}


}

}
