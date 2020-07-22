package encapsulation;
/*encapsulation : in java is the process of wrapping code and data into single unit
 * 
 * java packages 
 * access modifies
 * 
 * like we have done in this class 
 * (all detail related to student store in one class)
 */

/********************** how to achieve encapsulation ****************** 
 * step 1 : declare all variable of a class private
 * step 2 : provide public setter & getter method that will used to read & write these variable values 
 */
public class Student {
	//step 1: declare all variable private
	private int age; //  achieving data-hiding though encapsulation
	private String name;
	
	
	//step2: getter and setter
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>20)  //here we restrict age to modified by anyone from outside the this class by declare its age var private (achieving encapsulation)
			System.out.println("Your are too old to be a student in our school!");
		else
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	

}
/*
 *******************why encapsulation********************************** 
 * clean and easy  to read code 
 * to control modification
 * easy to debug 
 */

/*********************************** Data Hiding Vs encapsulation *****************************
 *  encapsulation refer to bundling of related field and methods together, this aloow as to achieve dataHiding.
 *  encapsulation itself is not a dataHinding
 *  */ 
