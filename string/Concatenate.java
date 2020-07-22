package string;

public class Concatenate {
	public static void main(String[] args) {
		/* there are two ways :
		 *1)->  by concatenation operator (i.e '+')
		 *2)->  by  new String = String.concat(anotherString)
		 */
	// way 1 :	
	 String s1 = "Priyanshu";
	 s1+='0';
	 String s2 = " Morya";
	 String s3 = s1+s2;
	 System.out.println(s3);
	 
		//Note: After a string literal, all the + will be treated as string concatenation operator.
	System.out.println(20+20+" sum "+20 +20);
	
	// way 2 :
	System.out.println(s2.concat(s1));
	System.out.println(s1.concat(" Kumar"));
	
	
	}
	

}
