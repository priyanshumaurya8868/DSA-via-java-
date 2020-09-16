package Regex;

import java.util.regex.Pattern;

public class RegexQuantifierAndMetacharacters {
	/*
	 *********** Quantifiers : we can use it to specify no of Occurrence to match
Regex	Description
X?  	X occurs once or not at all.
X+	    X occurs once or more times.
X*	    X occurs zero or more times.
X{n}	X occurs n times only.
X{n,}	X occurs n or more times.
X{y,z}	X occurs at least y times but less than z times.
	 */ 
	
	/*
Regex	Description
.   Any character (may or may not match terminator)
\d 	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r] [ \r\n\t\f ].
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary  (this would include spaces, dashes, commas, semi-colons, etc)
\B	A non word boundary

********  => while using these we have to add one extra back-slash("\") 
 e.g. because if we use single "/s" then the compiler would except an escape character (which are : [\t\n\x0B\f\r]) 
  and then it'll not able found "\s" in that list & it will return and error
	 */

//	The caret ( ^ ) symbol: Setting position for match :tells the computer that the match must start at the beginning of the string or line.
//	Example : ^\d{3} will match with patterns like "901" in "901-333-".
//	The dollar ( $ ) symbol
//	It tells the computer that the match must occur at the end of the string or before \n at the end of the line or string.
//	Example : -\d{3}$  will match with patterns like "-333" in "-901-333".
	
	/********************************************************************** IMPORTANT LINK**************************************************************/
	//   https://www.rexegg.com/regex-quickstart.html           (REGEX CHEATS)
	/******************************************************************************************************************************************************/
	
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\w+","weffew987"));
//		System.out.println("? quantifier ....");  // (one or none)
//		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
//		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
//		
//		System.out.println("+ quantifier ....");
//		System.out.println(Pattern.matches("(.)+","priyanshumaurya"));
//		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
//		
//		System.out.println("* quantifiers...");
//		System.out.println(Pattern.matches("[jdk]*" , ""));
//		
//		/*Create a regular expression that accepts 10 digit numeric characters 
//		 starting with 7, 8 or 9 only.*/  
//		System.out.println("{n} quantifiers...");
//		System.out.println(Pattern.matches("[789][0-9]{9}","7895463679"));
//		System.out.println(Pattern.matches("[789][0-9]{9}","6890997541"));//false (not start from 7 or 8 or 9)
//		System.out.println(Pattern.matches("[789][0-9]{9}","789546367"));//false (<10)
//		/*Create a regular expression that accepts alphanumeric characters only.  
//		Its length must be six characters long only.*/  
//		
//		System.out.println(Pattern.matches("(?:\\.)+",".." ));
//		System.out.println(Pattern.matches("(\\w)+.(\\d)+@(.)+","priyanshumaurya.8868@gmail.com" ));//just a e.g.
//		//this valid only for those e-mails address that have same pattern as mine
//		
		 
		
	}

}
/*
 * [set_of_characters] – Matches any single character in set_of_characters. By default, the match is case-sensitive.

Example : [abc] will match characters a,b and c in any string.
[^set_of_characters] – Negation: Matches any single character that is not in set_of_characters. By default, the match is case sensitive.

Example : [^abc] will match any character except a,b,c .
[first-last] – Character range: Matches any single character in the range from first to last.

Example : [a-zA-z] will match any character from a to z or A to Z.
The Escape Symbol : \
If you want to match for the actual ‘+’, ‘.’ etc characters, add a backslash( \ ) before that character. 
This will tell the computer to treat the following character as a search character and consider it for matching pattern.

Example : \d+[\+-x\*]\d+ will match patterns like "2+2"
and "3*9" in "(2+2) * 3*9".
Grouping Characters ( )
A set of different symbols of a regular expression can be grouped together to act as a single unit and behave as a block,
 for this, you need to wrap the regular expression in the parenthesis( ).

Example : ([A-Z]\w+) contains two different elements of the regular 
expression combined together. This expression will match any pattern 
containing uppercase letter followed by any character.
Vertical Bar ( | ) :
Matches any one element separated by the vertical bar (|) character.

Example :  th(e|is|at) will match words - the, this and that.
\number :
Backreference: allows a previously matched sub-expression(expression captured or enclosed within circular brackets ) 
to be identified subsequently in the same regular expression. \n means that group enclosed within the n-th bracket will be repeated at current position.
Example : ([a-z])\1 will match “ee” in Geek because the character 
at second position is same as character at position 1 of the match.
Comment : (?# comment) –
Inline comment: The comment ends at the first closing parenthesis.
Example : \bA(?#This is an inline comment)\w+\b
# [to end of line] : X-mode comment. The comment starts at an unescaped # and continues to the end of the line.

Example :  (?x)\bA\w+\b#Matches words starting with A
 */
