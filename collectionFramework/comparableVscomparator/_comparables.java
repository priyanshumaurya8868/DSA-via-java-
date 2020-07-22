package collectionFramework.comparableVscomparator;

import java.util.ArrayList;
import java.util.Collections;

public class _comparables {

	// public void sort(List list): It is used to sort the elements of List. List elements must be of the Comparable type.
	
	public static void main(String[] args) {
	

ArrayList<student> s = new ArrayList<>();


s.add(new student(13,"priya"));
s.add(new student(20,"ankush"));
s.add(new student(18,"priyanshu"));
s.add(new student(13,"riya"));
for(student st : s)
System.out.println("before : "+ st.marks+" "+st.name);System.out.println();
Collections.sort(s);
for(student st: s)
System.out.println("after : "+st.marks+" "+st.name);	
	
/***************************************************************************************************************************/
// in reverse order :

ArrayList<scholar > s2 = new ArrayList<>();
s2.add(new scholar (14,"Ram"));
s2.add(new scholar (17,"Shyam"));
s2.add(new scholar (9,"Gopi"));
s2.add(new scholar (18,"Noori"));
System.out.println("\t Before :");
for(scholar  st : s2)
	System.out.println(st.marks+ " " + st.name );
Collections.sort(s2);
System.out.println("\t After :");
for(scholar  st : s2)
	System.out.println(st.marks+" "+st.name);


	}

}
//to make this class comparable type :

//step 1: implement Comparable interface
class student implements Comparable<student>{
	int marks;
 String name;
 public student(int marks,String name){
	 this.marks=marks;
	 this.name=name;
	 
 }
 //step 2:
 @Override
 public int compareTo(student obj) { //step 3:
//	 if(this.marks==obj.marks)
//		 this.name.compareTo(obj.name);
//	 else if(this.marks> obj.marks)
//		 return 1;
//	 else if(this.marks<obj.marks)
//		 return -1;
//
//	return 0;
	 
	 return this.marks-obj.marks;
 }
}
class scholar  implements Comparable<scholar >{
	int marks;
	String name;
	public scholar (int marks,String name) {
		this.marks=marks;
		this.name=name;
	}
	
	@Override
	 public int compareTo(scholar  st){    
//		 if(marks==st.marks)    
//		 return 0;    
//		 else if(marks<st.marks)    
//		 return 1;    
//		 else    
//		 return -1;    
		
		return st.marks-this.marks;
	 } 
}