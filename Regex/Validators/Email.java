package Regex.Validators;
import java.util.*;
import java.util.regex.Pattern;
class emailUtil{
	String regex ;
	List <String> emails =new ArrayList<>();
	emailUtil(){
		regex= "^[a-zA-Z0-9-\\+]+"   //=> madatory  => avoid the ocurrence of .(dot) at 1st place  => + sign
				      +
				"(\\.[a-zA-Z0-9-])*"// => .(dot) optional ,
				       +
				  "@" // => mandatory
				    +
			  "[a-zA-Z0-9-]+" // => domain name => avoiding early(or direct) dot interaction just after @ 
				     +
				     "(\\.[a-zA-Z0-9])*" // => pre-extention  (optional)=>  no - sign after .(dot) 
				     +
				     "(\\.[A-Za-z]{2,})";//  => post extention (mandatory) => no 0-9 range,-,+ 
	}
	public  void print() {
		 for(String email : emails) {
			 System.out.println(email+" : "+Pattern.matches(regex, email));
		 } System.out.println();
	}
}
public class Email {

	public static void main(String[] args) {
	
emailUtil e = new emailUtil();
e.emails.add("priyanshumaurya.8868@gmail.com");//true
e.emails.add("priyanshumaurya.8868@redKit.com.au");//true
e.emails.add(".nallaAdmi@gmail.com");//false
e.emails.add("mkyong@%*.com");//false

		e.print();
	}

}
//ref (for invalid and valid cases) : https://www.regexpal.com/96927
//ref (intro )                      : https://www.geeksforgeeks.org/write-regular-expressions/
//ref (for special exp)             : https://www.geeksforgeeks.org/write-regular-expressions/

