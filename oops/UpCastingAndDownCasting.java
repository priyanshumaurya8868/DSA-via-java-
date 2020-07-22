package oops;
class parent
{
	String name;
	parent()
	{
		System.out.println("constructor of parent");
	}
	void method ()
	{
		System.out.println("method of parent");
	}
}
class child extends parent{
	int id;
	
	child(){
		System.out.println("constructor of child");
	}
	//override method
	void method(){
		System.out.println("method of child");
	}
}
public class UpCastingAndDownCasting {

	public static void main(String[] args) {
		
 //Upcasting: Upcasting is the typecasting of a child object to a parent object. 
  
		/* Upcasting can be done implicitly.
  * Upcasting will be done internally(means object dono ke bane te kio ki dono k constructor call hue) and 
  * due to upcasting the object is allowed to access only parent class members and 
  * child class specified members (overridden methods, etc.) but not all members.
  */
		//upcasting
		parent p = new child();
		p.name = "Priyanshu";
	//access parent stuff and override method of child
	// hence can't access	
		//p.id =1;

		System.out.println("\n"+p.name); 
        p.method(); 
        
     // Trying to Downcasting Implicitly 
        
       // child c =new parent(); ->compilation error
	
        //child c =(child)new parent(); -> run time error
	
	//down casting explicitly :downcasting means the typecasting of a parent object to a child object. 
        //Downcasting cannot be implicitly/internally.
        
        child c = (child)p;
        c.id =1;
		System.out.println("\n"+c.name);
		System.out.println("id : "+c.id);
        c.method();
        
        
        
	}

}
