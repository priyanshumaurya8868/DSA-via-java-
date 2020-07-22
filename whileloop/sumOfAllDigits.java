package whileloop;

import java.util.Scanner;

public class sumOfAllDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,temp=n;
		while(temp>0)
		{
			int lastDigit=temp%10;
			sum += lastDigit; // varible for implementing assignment operator should be asigned first(sum)
			//regulating loop
			temp=temp/10;
			
		}
		System.out.println("Sum = "+sum);

	}

}
