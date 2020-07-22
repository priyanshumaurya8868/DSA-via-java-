package polymorphism;
class Animal{
	
}
class pet extends Animal{
	public void walk() {
		System.out.println("Pet is walking");
	}
}

class dog extends pet{
	public void walk() {
		System.out.println("Dog is walking");
}

// basically it just another name of method overriding (run time polymorphism)

	}
public  class Runtimepolymorphism {

	public static void main(String[] args) {
		dog d =new dog();
		pet p = d;
		Animal a= d;
        p.walk(); // dog method 
		d.walk();  // dog method
//		a.walk();// compile time error 
		
		
/***************************************** reason for way overriding happens  ******************************************/
		System.out.println(p instanceof dog); 
		
	pet p2 =new pet(); 
		System.out.println(p2 instanceof dog);
		p2.walk();
	}
}
// note : compile can't predict 

//over loading = compile time polymorphism //same name diff parameters
