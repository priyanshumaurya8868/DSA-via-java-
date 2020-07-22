package Regex.Validators;
import java.util.*;
import java.util.regex.Pattern;


class util{  List<String> emails = new ArrayList<>();
static String Regex;

public  void print() {
	 for(String email : emails) {
		 System.out.println(email+" : "+Pattern.matches(Regex, email));
	 } System.out.println();
}
	
}
class simple extends util //missing '@' symbol (only case for what this  can declare an email as invalid!)
{
	simple(){
		 
		 Regex ="^(.+)@(.+)$";
	}
}
class res1 extends util
{
	//2. Adding Restrictions on User Name part	Regex : ^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.]+$
		/*
		 *
	In this regex, we have added some restrictions on username part of email address. Restrictions in above regex are:

	1) A-Z characters allowed
	2) a-z characters allowed
	3) 0-9 numbers allowed
	4) Additionally email may contain only dot(.), dash(-) and underscore(_)
	5) Rest all characters are not allowed
		 */
	
	res1(){
		 
		 Regex ="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.]+$";
	 }
	
}
class res2 extends util{
	res2(){
		Regex = "^[a-zA-Z0-9-._-!#$%^~'`*/=+&?{|}]+@[a-zA-Z0-9.-]+$";
	}
	//This regex example uses all the characters permitted by RFC 5322,
	//which governs the email message format
}
public class EmailStuff {

	public static void main(String[] args) {
		
		
//1. => simple Email vaildators  => Regex : ^(.+)@(.+)$
		
		simple valids =new simple();
		valids.emails.add("priyanshumaurya.8868@gamil.com");
		valids.print();
		//invalid cases (that is now handled)
		simple invalids =new simple();
		invalids.emails.add("hemait#gmailcom");//invalid => missing '@' symbol (only case )
		invalids.emails.add("@yahoo.com");
		invalids.print();
		
//2. Adding Restrictions on User Name part	Regex : ^[a-zA-Z0-9_.-]+@[a-zA-Z0-9.]+$
	
		res1 validr1 =new res1();
		validr1.emails.add("priyanshu_maurya.32@gmail.com");
		validr1.emails.add("priyanshu.maurya.32@gmail.com");
		validr1.emails.add("Vanshika-maurya.32@gmail.com"); 
		validr1.print();
		
		//=> =>   IN-VALID cases are same as above  <= <=
		
//3. Java email validation permitted by RFC 5322 Regex : ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$
  // (userNme  changes  only...)
		
	
		//4. Regex to restrict leading, trailing, or consecutive dots in emails
		
	}
}
