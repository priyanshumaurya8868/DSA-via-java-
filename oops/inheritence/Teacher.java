package oops.inheritence;
//extends keyword is used by Teacher class to be a child class of of person class
public class Teacher extends Person {
 Teacher()
 {
//Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
	 // super();//calling parent constructor via super keyword
	 System.out.println("constructor : Teacher\n");
	 
 }
	public void teac()
	{
		System.out.println(name+" is teaching");
	}
	
	//now function eat() overriding 
	public void eat()
	{ System.out.print("calling eat fun via super key word : ");super.eat();
		System.out.println("Teacher  : "+name + " is eatting\noverride eat()\n");
	}
	//Overriding: If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
	
	

}
