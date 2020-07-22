package string;

public class Anagram {
 public static void main(String[] args)
 {
	 String a="Bula";
	 String b="Aulb"; boolean Anagram =true;
// int[] al = new int[256];
//	 int[] bl = new int[256];
//	int i; for(i=0;i<a.length();i++)
//	{
//		al[(int)a.charAt(i)]++;
//	}
	/*  toChararray() returns array of character from string
	  for(char c : a.toCharArray())
	 {
		 int index =(int) c;
		 al[index]++;
	 }
	 */
	 
//	
//	 for(i=0;i<b.length();i++)
//	{
//	 bl[(int)b.charAt(i)]++;
//	}
//	
//	 for(i=0;i<256;i++)
//	 {
//		 if(al[i]!=bl[i])
//		 {
//			 Anagram =false;
//		 }
//	 }
	 /***************************************************************************************************************************************************************
	  *                                         way 2:  using only array of int
	  */
	a= a.toLowerCase();
	b= b.toLowerCase();
	 int al[]= new int[256];
	 int i; for(i=0;i<a.length();i++)
			{
				al[(int)a.charAt(i)]++;
			}
	 
	 for(i=0;i<b.length();i++)
		{
			al[(int)b.charAt(i)]--;
		}
	 
	 for(i=0;i<256;i++)
		 {
			 if(al[i]!=0)
			 {
				 Anagram =false;
				 
			 }
		 }
	 if(a.length()!=b.length())
		 Anagram=false;
	 
	
	 
	 if(Anagram)
		 System.out.println("Anagram");
	 else
		 System.out.println("Not Anagram");
 }
}
