package Regex.splting;

import java.util.regex.Pattern;

public class PatternSplit {
 
	// Spilt() we use to split the given target String according to  the given pattern
	public static void main(String[] args) {
	
		String ts1 = "hi..! how_r_u..?";
		System.out.println("Target String : "+ ts1);
	
		   Pattern p1 = Pattern.compile("\\s");
		   String[] str1 = p1.split(ts1); System.out.println("Split via space");
		   for(String s : str1)System.out.println("=> "+s);
		   
 System.out.println();
 
		   String ts2 = "priyanshumaurya.8868@gmail.com";
		   Pattern p2 = Pattern.compile("[.]");
		   String[] str2 = p2.split(ts2); System.out.print(" split by [.] => ");
		   for(String s : str2)System.out.println("=> "+s);
		   
 System.out.println();
 		   
		   Pattern p3= Pattern.compile("\\.");
		   String[] str3 = p3.split(ts2); System.out.print(" split by \\. => ");
		   for(String s : str3)System.out.println("=> "+s);
		   
 System.out.println();
 	
		   // below example doesn't gonna return  anything, because we are splitting via . (splitting by anything , ( or we can say ignoring anything) )
		   Pattern p4 = Pattern.compile(".");
		   String[] str4 = p4.split(ts2); System.out.print(" split by . => ");
		   for(String s : str4)System.out.println("=> "+s);
		   
		   System.out.println("\nhi");
		   
		// NOTE : => String class has   also a spliting function  in it... 
		   
		 //   String class split() method can take pattern as arrgument where as 
		   //pattern class spilt method can take target string as a arrgument
		   
		   System.out.println("*************************************** String.split() *******************************************");
		   String s = "Durga Software Solution ";
		   for( String s1 : s.split("\\s")) System.out.println(" => "+s1);
		   
		   
		   
	}

 
	
}
