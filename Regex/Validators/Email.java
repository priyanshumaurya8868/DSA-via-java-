package Regex.Validators;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "^" //start
				+ "[a-zA-Z0-9]" // restricting the 1st character to alpha-numeric
				+"([a-zA-Z0-9]+[\\._\\-]?)*" //  remaining characters //preventing two consecutive dots n other symbols...
				+ "@"  // mandatory symbol
				+"[a-zA-Z0-9]+" //domain name
				+ "([.][a-zA-Z]+)+" //covering .co.in
				+ "$"; //end
		while(true) {
//			 Pattern p = Pattern.compile(regex);
//			  Matcher m = Pattern.matcher(sc.nextLine());   => error ******************DO CHECK REASON ************************************** 
			if(Pattern.matches(regex, sc.nextLine()))
				System.out.println( "=> Valid...!");
			else System.out.println("=> InValid..!");
				
					}
	}
}
//ref (for invalid and valid cases) : https://www.regexpal.com/96927
//ref (intro )                      : https://www.geeksforgeeks.org/write-regular-expressions/
//ref (for special exp)             : https://www.geeksforgeeks.org/write-regular-expressions/

