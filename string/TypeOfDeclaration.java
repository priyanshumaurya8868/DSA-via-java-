package string;

public class TypeOfDeclaration {
	public static void main(String[] args)
	{
		// 2 ways 
		// 1-> by literals (in string constant pool)
		String s1 = "Literals"; 
        System.out.println(s1);

        //2-> by new keyword

        String s2 = new String("via New keyword !");
        System.out.println(s2);
		  
	}

}
 