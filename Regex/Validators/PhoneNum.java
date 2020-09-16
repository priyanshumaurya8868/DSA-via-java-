package Regex.Validators;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class PhoneNum {

	public static void main(String[] args) throws Exception {
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 String regex  = "(91|0)?[789][\\d]{9}";
      while(true)
      {  
    	  if(Pattern.matches(regex, br.readLine().trim()))
    	   System.out.print(" => Valid..!\n");
    	   else
    	   System.out.print(" => InValid...!\n");
      }
	}

}
