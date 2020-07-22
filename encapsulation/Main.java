package encapsulation;
//import encapsulation.*; // from this way we can import all the public classes of all the avaliable files in packages at once
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student();
System.out.println("for student s1: ");
s1.setAge(22);
s1.setName("Mohit");
System.out.println("age : "+s1.getAge());
System.out.println("Name : "+s1.getName());
System.out.println("\nFor stude nt s2 :");
Student s2 =new Student();
s2.setAge(18);
s2.setName("Hemant kumar");
System.out.println("Name : "+s2.getName());
System.out.println("Age : "+s2.getAge());


	}

}
