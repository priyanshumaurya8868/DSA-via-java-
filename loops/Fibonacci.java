package loops;
import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args)
 { System.out.println("Enter the value of 'n' : ");
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   System.out.println("");
   System.out.println("Your fibonacci series : ");
  
   int a=0;
   int b=1,c;
   System.out.print(a+" "+b);
   for(int i=0;i<(n-2);i++ )
   {
	   c=a+b;
	   System.out.print(" "+c);
	   a=b;
	   b=c;
   }
	   
	 
 }
}
