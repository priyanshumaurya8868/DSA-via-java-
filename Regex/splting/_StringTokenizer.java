package Regex.splting;
import java.util.*;


public class _StringTokenizer {
/*
 * => specially designed class for tokenization activity
 * 
 * => everything like string,stringBuffer,StringBuilder resides inside the "java.lang"
       but this class reside in java.util...
 */
	public static void main(String[] args) {

		// => it takes space as a by default argument
		String  inputString = "Validation Hopes Urge";System.out.println("Input String : "+inputString); 
		
	 StringTokenizer st1 = new StringTokenizer(inputString);
	while(st1.hasMoreTokens()) System.out.println(st1.nextToken());
		
	String inputString2 = "14-9-2020";
	System.out.println("Input String  : "+inputString2 );
	
	StringTokenizer st2 = new StringTokenizer(inputString2,"-" );
	while(st2.hasMoreTokens()) System.out.println(st2.nextToken());

	}

}
