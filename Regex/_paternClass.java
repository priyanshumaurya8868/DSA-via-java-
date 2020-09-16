package Regex;
// regex :- it is used to repersent a group of strings according to particular pattern,
// Important Application 
/*
 * to develop validation framework
 * to develop pattern matching application (cltr + F in windows & grep in UNIX)
 * to develop translator like Compilers,Interpreter and Assemblers Etc...
 */

import java.util.regex.Pattern;//Used for defining patterns
//1. -> it is a compiled version of Regular Expression
//2. we can create a pattern object by using compile() of Pattern class (which is a Static Factory method)

// static factory method : => by using a class name a method is called,& that method returns the same class's object

import java.util.regex.Matcher;//Used for performing match operations on text using patterns
//we can use Matcher object to match the given pattern in the targeted String
// object can be created by using matcher() of pattern class

public class _paternClass {

	public static void main(String[] args) {
/*********************************************** way 1 : **********************/
		Pattern ptrn = Pattern.compile(".xx."); //It is used to compile the given regular expression into a pattern.
		//here,=> a vaild string can have at max 4 character & can contain anything at its 1st & last-place  but it must have _xx_ in two mid places
		
		Matcher mchr = ptrn.matcher("axx1");//It is used to create a matcher that will match the given input against this pattern.
		
	   boolean b1= mchr.matches();//Attempts to match the entire region against the pattern. 
		System.out.println(b1);
		
	 Pattern p = Pattern.compile("ab");
	 Matcher m = p.matcher("ababbabab");
	 int count =0 ;
	 while(m.find()) // m.find works as similar as cltr + F in eclipse 
	 {count++;
		 System.out.println("Count = "+count+ " -> start at : "+ m.start()+
				 " -> end at : "+(m.end()-1) // here end() returns endIndex+1 (i.e -1 is placed there)
		 +"-> content : "+m.group()); 
	 }
System.out.println("hernce the total nuber of the matched pattern are : "+ count);
		/***************************************** way 2: *******************/
		boolean b2 =Pattern.compile(".xx.").matcher("1xxh").matches();
		System.out.println(b2);
/****************************** way 3:****************************************/
		boolean b3 = Pattern.matches(".xx.","RxxG");
		System.out.println(b3);

System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  



		
	}

}