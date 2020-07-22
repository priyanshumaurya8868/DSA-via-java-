package datatype;

public class Typecasting {

	public static void main(String[] args) {
		float y =2.233f; //f is required to write in the end else compiler gonna consider it as a double
		
		int x= (int)y;//type casing 
		//this type casting always gonna offer me the floor value 
		//type casting not required when we convert 
		//byte->short->int->float->double
		// can't move  like <- <- without typecasting
		System.out.println("type casted data");
       System.out.println(x);

	}

}
