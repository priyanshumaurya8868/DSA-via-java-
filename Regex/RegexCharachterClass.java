package Regex;

import java.util.regex.Pattern;

public class RegexCharachterClass //these are just a single character comparison against defined regex
{

	/*
	 * 
No.	Character Class	Description
1	[abc]	        a, b, or c (simple class)
2	[^abc]	        Any character except a, b, or c (negation)
3	[a-zA-Z]    	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]   	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)

	 */
	
	public static void main(String[] args) {
		
		System.out.println("1(a). "+Pattern.matches("[xyz]", "x"));// true(among x or y or z)
		System.out.println("1(b). "+Pattern.matches("[xyz]","xxyyzz"));//false (x,y,z comes more than once)
		System.out.println("1(c). "+Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		
		System.out.println("2(a). "+Pattern.matches("[^abc]","g"));//true => any character except a,b & c
		
		System.out.println("3(a). "+Pattern.matches("[a-zA-Z]","p"));// true => any character from a-z Or A-Z
		System.out.println("3(b). "+Pattern.matches("[a-zA-Z]","P"));// true => any character from a-z Or A-Z
		System.out.println("3(c). "+Pattern.matches("[a-zA-Z]","@")); // false
		
//		[a-p[p-z]] => Range: a to p or q to z (inclusive) (union)
	System.out.println("4(a). "+Pattern.matches("[a-p[q-z]]","p"));//true
	System.out.println("4(b). "+Pattern.matches("[a-p[q-z]]","a"));//true
	System.out.println("4(c). "+Pattern.matches("[a-p[q-z]]","z"));//true
	System.out.println("4(d). "+Pattern.matches("[a-p[q-z]]","az"));//false only char are valid  #multipleOccurrenceOfValidCharacters
	
// 	    [a-z&&[def]]	d, e, or f (intersection)
	System.out.println("5(a). "+Pattern.matches("[a-z&&[def]]", "d"));//true
	System.out.println("5(b). "+Pattern.matches("[a-z&&[def]]","a"));//false => "a" is not a intersection of [def]

//    	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
	System.out.println("6(a)"+Pattern.matches("[a-z&&[^bc]]","a" ));//true
	System.out.println("6(b)"+Pattern.matches("[a-z&&[^bc]]","b" ));//false 
	
//    [a-z&&[^m-p]]	a through z, and not m through y(subtraction)	
	System.out.println("7(a) "+Pattern.matches("[a-z&&[^m-z]]","p"));//false
	System.out.println("7(b) "+Pattern.matches("[a-z&&[^m-y]]","a"));
	}
}
