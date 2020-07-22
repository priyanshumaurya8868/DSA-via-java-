package whileloop;

import java.util.Scanner;



public class PalindromeInt {
	public static void main(String[] args)
	{
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0,temp=n;
		while(temp>0)
		{
			reverse=(reverse*10)+(temp%10);
			temp/=10;
		}
     if(reverse==n)
     {System.out.println("yup..!");
     
     }
     else
    	 System.out.println("nope..!");

	}
     
}
