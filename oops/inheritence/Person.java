package oops.inheritence;
//class can't be protected/ private
public class Person extends human {
	
	Person(){
		//super();//calling parent constructor via super keyword
		System.out.println("constructor : Person");
	}
		
		
		
	
	
	 public void eat()
	 {
		 System.out.println("Person : "+name+" is eating");
		 
	 }
	 public void walk() {
		 System.out.println(name+" is walking");
		 
	 }
	 /****************************************************************************************************/
	 /*                 IF U WANT THAT NOONE CAN ACCESS UR PARENT CLASS                                  */
	 // THEN simply declare it's default constructor as private  like 

}
