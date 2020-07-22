package oops.inheritence;

public class MainClass {

	
	public static void main(String[] args) {

     Teacher t = new Teacher();

 t.name ="Anuj Kumar Sharma"; t.walk();
 //func overriding
t.eat();
//special func
 t.teac();
 
 System.out.println();
 
Singer s = new Singer();
System.out.println("\t singer : ");
s.name = "Arjit Singh";
s.walk();
s.eat();
// singer class special functions
s.sing();
/*********************************** NO MULTIPLE/HYBRID INHERITENCE ******************************************************/

/*To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
 If A and B classes have the same method and you call it from child class object, 
 there will be ambiguity to call the method of A or B class.
 */
// ONLY SINGLE , MULTI-LEVEL & HERARICAL INHERITENCE exists */
		

/*************************************************************************************************************************************************************************/
/**************************************************************** instanceof keyword  ************************************************************************************/
/*************************************************************************************************************************************************************************/
// instanceof : The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
// return type : boolean

System.out.println("/************************************ instanceof keyword *****************************/");
System.out.print("t instanceof Teacher :" );
System.out.println(t instanceof Teacher); 
System.out.print("t instanceof human : ");
System.out.println(t instanceof human);




                                


}
}
