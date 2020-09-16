package Regex;
import java.util.regex.*;
public class MatcherClassFunctions {

	public static void main(String[] args) {
	          
		String targetString1 = "abaabaaab";
		System.out.println("Targeted String : "+ targetString1);
		System.out.println("String Lenght : "+targetString1.length());
		
		
		String x1= "a";  // regex  
		Pattern p1  = Pattern.compile(x1);  Matcher m1 = p1.matcher(targetString1);
		System.out.println("********************  x1 : a **************************");
		while(m1.find()) System.out.println("found at Index  : "+m1.start()+" Matched content : "+m1.group());
		
		System.out.println("");
		
		String x2 = "a+";//one or more
		System.out.println("********************  x2 : a+ **************************");
	    Pattern p2= Pattern.compile(x2);  Matcher m2= p2.matcher(targetString1);
		while(m2.find()) System.out.println("found at index : "+m2.start()+ " Matched content : "+m2.group());
		
		System.out.println("");
		
		String x3 = "a*";
		System.out.println("********************  x3 : a* **************************");
		 Matcher m3= Pattern.compile(x3).matcher(targetString1);
		 while(m3.find()) System.out.println("found at index : "+m3.start()+" Matched content : "+m3.group());
    
		 // since, in regex cursor can move end+1 index also...  (
		 /*
		  * 1 => as every time we use Matcher class's method named as  "end()" it also return (endIndex +1)..
		  * 2 => here in above case b is at 8th  index (i.e is the last possible index in the string and after b there
		         is nothing (which is  valid case if we use * symbol ) )
		         
		          #resonBehindTheOutput ("found at index : 9 Matched content : ")
		  */
		 
		 System.out.println("*******************************************************************");
		 System.out.println("*******************************************************************");
		 
		 String targetString2 = "a7b k@9";
		 System.out.println("Target String : ");
		 System.out.println("String Length : "+targetString2.length());
		 
		 System.out.println("\n******************** Regex : \\s **************************");
		 Matcher m4 = Pattern.compile("\\s").matcher(targetString2); 
		 while(m4.find()) System.out.println("found at index : "+m4.start()+" Mathched content : "+m4.group());
		 
		 System.out.println("\n******************** Regex : \\d **************************");
		 Matcher m5 = Pattern.compile("\\d").matcher(targetString2);
		 while(m5.find()) System.out.println("Found at index "+m5.start()+ " Matched content : "+m5.group());
		 
		 System.out.println("\n******************** Regex : \\D **************************");
		 Matcher m6 = Pattern.compile("\\D").matcher(targetString2);
		 while(m6.find()) System.out.println("Found at index "+m6.start()+ " Matched content : "+m6.group());
		
		 
	}

}
