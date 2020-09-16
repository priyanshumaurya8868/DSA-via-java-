package functionalInteface.methodReference;
interface Calculator{
	void  add (int n1,int n2);
}
class Calc{
	static void addSomething(int n1,int n2) {	int s= n1+n2;
		System.out.println("addingSomething "+n1+" & "+n2+" = "+s);
	}
	void letsAdd(int n1,int n2) {
		int s= n1+n2;
		System.out.println("letsAdd "+n1+" & "+n2+" = "+s);
	}
}

interface Messenger{
	Message msg(String m);
}
class Message{
	Message(String msg){
		System.out.println("Message : "+ msg);
	}
}
public class sample {

	public static void main(String[] args) {
	
	//	Calc.addSomething(2, 33);
		
		//1. Reference to  a static method
		Calculator c1= Calc :: addSomething; // method referencing
		c1.add(32, 54);
            
		//2. Reference to anon static method
		Calc classObj = new Calc(); //obj creation 
		Calculator cal = classObj::letsAdd;  //method referencing
		cal.add(3, 2);
		
		//3. Reference to a constructor
		Messenger mref = Message::new; //     method referencing
		mref.msg("happy codding!!");
		
		
}

}
