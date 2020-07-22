package exceptionHandling;
class InvalidAge extends Exception // step 1 :inheriting the behavior of the parent exception class
{
	//step2 : constructor that accept a string for showing the costum output msg
	InvalidAge(String a){
		
		super(a); //passing msg to parent exception class
	}
}


public class CostumException {

	static void valid(int age) throws InvalidAge  // it is mandatory  u to handled / declare
	{
		if (age<18) {
			throw new InvalidAge("You are too young...!");	
		}
		else
			System.out.println("You can vote!");
	}

	public static void main(String[] args) {
		 
		try {
			valid(64);
			valid(13); //executed - exception received
			valid(19); // unexecuted
		}catch(Exception e) {
			System.out.println("Exception occured : "+e);
		}
		System.out.println("rest of the code...");

	}

}
