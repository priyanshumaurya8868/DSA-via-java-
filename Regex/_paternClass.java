package Regex;

import java.util.regex.Pattern;//Used for defining patterns

import java.util.regex.Matcher;//Used for performing match operations on text using patterns

public class _paternClass {

	public static void main(String[] args) {
/*********************************************** way 1 : **********************/
		Pattern ptrn = Pattern.compile(".xx."); //It is used to compile the given regular expression into a pattern.
		//here,=> a vaild string can have at max 4 character & can contain anything at its 1st & last-place  but it must have _xx_ in two mid places
		
		Matcher mchr = ptrn.matcher("axx1");//It is used to create a matcher that will match the given input against this pattern.
		
	   boolean b1= mchr.matches();//Attempts to match the entire region against the pattern. 
		System.out.println(b1);
		
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
