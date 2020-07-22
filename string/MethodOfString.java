package string;

public class MethodOfString {
	public static void main(String[] args) {
		// 1: char charAt(int index);
		String s1 = "Priyanshu";
		// indexing starts from 0
		System.out.println("s1 = "+s1);
		System.out.println("char at index 8 :"+s1.charAt(8)); 
		System.out.println("Length : "+s1.length()); // just like an array
		System.out.println("beg index  4 : "+s1.substring(4));
		System.out.println("substring from 0 to 5 :"+ s1.substring(0,5));
		
		// 2 :boolean contains(charSequence)
		
		System.out.println("is s1 contains Priya  :" +s1.contains("Priya"));
		
		// 3 : isEmpty()

	System.out.println("is s1 empty ? "+ s1.isEmpty());
	 
	// concatenation   
	// String concat(String str)
	String s2=s1.concat(" Kumar")+" Morya";
	System.out.println(s2);
	
// String replace(char old,char new)
	System.out.println("After replacing 'a' from 'g' : "+s2.replace('o','g'));
	
	/***************************splitting*****************************************/
	 /*
	  String[] split(String regex)  //regex means simple string
	  */
	String cars = "Hyundai,Maruti/Swift!Wago+nar,Ferrai,Lamborghini";
	String[] allcars =cars.split("[ ,/!]+"); // square bracket needed fo immplementaion of different  splitters
	System.out.println("\nnew String cars : "+cars);
			for(String car : allcars) {
				System.out.println(car);
			}
/* int indexOf(char ch)	
 * it return the index of the very first occurence of that char if present 
 * (and leave or discard the rest of the forehead occurence in case of more that one occurence of that char )  
 *  it recur -1 if character not found
 */
	
			System.out.println("First Occurence of char 'M' : "+cars.indexOf('M'));	
			// int indexOf(String str)	
			System.out.println("Startin index of string i.e. Kumar : "+s2.indexOf("Kumar"));
 
			// String toUppercase()
   System.out.println("toUpperCase() : "+s2.toUpperCase());
   // String toLowercase()
  System.out.println("toLowerCase() : "+s2.toLowerCase());	
  //String trim()
  String p = "                         hi                      ";
  System.out.print("String with whitespaces : "+p);
   System.out.println("\nAfter trim() : "+p.trim());
	}
}
