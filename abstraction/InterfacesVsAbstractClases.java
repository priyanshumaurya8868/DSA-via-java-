package abstraction;
interface A{
void a();//bydefault, public and abstract 
void b();
void c();
void d();
void e();
}
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{
	public void a()
	{
		System.out.println("hi I'm a");
	}
	//yha nhi tho inche, pr sbke kahi na kahi na body deni hogi
}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class C extends B{
	public void b() {
		System.out.println("hi I'm b");
	}

	public void c() {
		System.out.println("hi I'm c");
	}
	public void d() {
		System.out.println("hi I'm d");
	}
	public void e() {
		System.out.println("hi I'm e");
	}

}

public class InterfacesVsAbstractClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 C c = new C();
 c.a();
 c.b();
 c.c();
 c.d();
 c.e();
	}

}
