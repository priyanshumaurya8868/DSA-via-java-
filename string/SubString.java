package string;

public class SubString {
	public static void main(String[] args) {
		// 2ways
	/*	public String substring(int startIndex): This method returns new String object containing the substring of the given string from specified startIndex (inclusive).
		public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.
	*/
		String s1 = "PriyanshuMorya";
		
		System.out.println(s1.substring(9));// start inclusive
		
		System.out.println(s1.substring(0,9)); // end exclusive
	}

}
