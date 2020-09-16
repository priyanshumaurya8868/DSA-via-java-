package Regex.Validators;
import java.io.*;
import java.util.regex.Pattern;



public class YAVA_language {

	/********************* YAVA language rules...
	 * => the allowed characters are a-zA-Z0-9, # and $
	 * => the length of identifiers should be atleast 2
	 * => 1st characters should be lower case a-k
	 * => 2nd character should be Digit divisible by 3 {0,3,6,9}
	 */
	
	public static void main(String[] args) throws Exception {
String regex = "[a-k][0369][a-zA-Z0-9#\\$]*";
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true) {
	System.out.println("is this valid ..? => "+Pattern.matches(regex, br.readLine()));
	
}
	}

}
