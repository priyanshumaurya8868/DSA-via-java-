package collectionFramework.comparableVscomparator._comparators;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		
ArrayList<Student> al = new ArrayList<>();
al.add(new Student(18,"Neha",35));
al.add(new Student(17,"Vanshika",43));
al.add(new Student(19,"Trisha",56));
al.add(new Student(21,"Priya",65));
al.add(new Student(25,"Riya",52));

System.out.println("On the basis of age :");
//way-1 -> step3:
Collections.sort(al,new AgeComparator());

for(Student s :al) {
System.out.println(s.age+" "+s.name+" "+s.marks);
}
System.out.println();

/******************************************************************VIA ANNYOMUS CLASS *****************************************************/
//System.out.println("On the basis of marks");
//Collections.sort(al,new Comparator<Student>(){
//	public int compare(Student s1,Student s2) {
//		return s1.marks-s2.marks;
//	}
//});
//for(Student s :al) {
//System.out.println(s.age+" "+s.name+" "+s.marks);
//}
//System.out.println();


///************************************************************ lambda expression******************************************************/
System.out.println("On the basis of name :");
Collections.sort(al,( s1, s2)-> {
		return s1.name.compareTo(s2.name);
	
});
for(Student s :al) {
System.out.println(s.age+" "+s.name+" "+s.marks);
}
System.out.println();

//as we know that the next argument gonna be a comparator so u don't need to define => new Comparator<student> 
//as we know that there'll we only one function for comparator so don't need declarer that
//as type is already known by the compiler so dont need to write it again in the parenthesis
//for above flexibilities u must write lambda sign right after ()

 /****************************************** METHODS OF Comparator class *********************************************************************************/

/*  
 *  1: comparing
 *  2: thenComparing
 *  3: reverse
 */
Collections.sort(al,Comparator.comparing(Student::getMarks).thenComparing(Student::getName).thenComparing(Student::getAge).reversed());

//thencomparing() & reversed() => optional and can be n number of times 

for(Student s :al) {
System.out.println(s.age+" "+s.name+" "+s.marks);
}
System.out.println();



}
}


class Student {
	int marks ;
	String name;
	int age;
	
public Student(int age,String name,int marks) {
	this.age=age;
	this.marks=marks;
	this.name=name;
	
}
public int getMarks() {
	return marks;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
} 



//way-1 -> step1: 
class AgeComparator implements Comparator<Student>{  
	//way-1 -> step2: 
public int compare(Student s1,Student s2){  
//if(s1.age==s2.age)  
//return 0;  
//else if(s1.age>s2.age)  
//return 1;  
//else  
//return -1;  

          //or
return s1.age-s2.age;
}  
}  
//
//Comparable	Comparator
//1) Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.	
//The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
//2) Comparable affects the original class, i.e., the actual class is modified.	Comparator doesn't affect the original class, i.e., the actual class is not modified.
//3) Comparable provides compareTo() method to sort elements.	Comparator provides compare() method to sort elements.
//4) Comparable is present in java.lang package.	A Comparator is present in the java.util package.
//5) We can sort the list elements of Comparable type by Collections.sort(List) method.	We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
