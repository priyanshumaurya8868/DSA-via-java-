 package oops.innerClassAndNestedClass.innerclasses;
//A class i.e. created inside a method is called local inner class in java.
//If you want to invoke the methods of local inner class, you must instantiate this class inside the method
class localOuter{
	private int data =30;
	void display() {
		int ip=90;// here u can't use access modifier except "final" for this var
		class localInner{
		    private int io =3;
		    final int iq =34;
		    void msg() {
		    	System.out.println(data);
		    	System.out.println(ip);
		    	System.out.println(iq);
		    	System.out.println(io);
		    } 
		} 
		localInner i = new localInner();
		i.msg();
		
	} //display()
}
public class localInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		localOuter obj = new localOuter();

 obj.display();
	}

}

/******************************************* RULES ***********************************************/
//1) Local inner class cannot be invoked from outside the method.
//2) Local inner class cannot access non-final local variable till JDK 1.7. Since JDK 1.8, 
//it is possible to access the non-final local variable in local inner class.