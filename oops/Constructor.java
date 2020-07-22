package oops;
class vehicle
{
	int wheels;
	String colour;
	// Constructor : it just similar to the method but not method(but not a method)which is automatically invoked when a object is created, generally used for solving the issue of initialization
	// it has no return type 
	// it will always have the same name  as that is of the class
	vehicle() // default constructor which automatically created by the compiler if don't create any parameterized constructor in a class
	{
		
	}
  vehicle(int wheels)//Parameterized constructor : A constructor that accepts some parameters
	{ 
		this.wheels= wheels;
				//this keyword  : it is specifically created for each object, that helps in accessing the instance member variable inside the the class
				//scope : class only
	}
  // constructor over-loading
  vehicle(int wheels,String colour)
  { this.wheels=wheels;
  this.colour=colour; 
  }

  /* Destructor : there is no destructor in java
   * java does not support destructors. All freeing the memory task is done by GARBAGE COLLECTOR. 
   * Java has it's own memory management feature using garbage collector. 
   * When you use finalize() the object becomes available for garbage collection and you don't need to explicitly call for the destructor.
   */
	
}
public class Constructor {
	public static void  main(String[] args)
	{
		
		// in case if if don't have constructor functionality
		vehicle bike =new vehicle();//invoking default constructor
		bike.wheels=2;
		bike.colour="white";
		System.out.println("\tBike  "+"\nwheels : "+bike.wheels+"\nColour : "+bike.colour);
		
		/****************************************************************************************************************************/
		                          // with constructors
		vehicle car =new vehicle(4); car.colour="yellow";
		System.out.println("\tCar \nWheels : "+car.wheels+"\nColour : "+car.colour);
vehicle scooty = new vehicle(2,"Blue");
System.out.println("\n\n\tScooty  "+"\nwheels : "+scooty.wheels+"\nColour : "+scooty.colour);
		}
	}
		/*/************************************ NOTE ********************************/
//you can't declare the default constructor of parent class as private if u want to create any object of their child & 
//it is required to create if want another parameterized constructor in parent class
//because that need to invoke at that time...

// -> TO Over come this problem  use abstract class 

	



