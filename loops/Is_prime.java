package loops;
import java.util.Scanner;
public class Is_prime {
	public static void main(String[] args)
	{
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		boolean Isprime = true;
		
	// time complexity = O(n)
	/*
		// since 2 is the smallest prime number, so the loop start with 2 till n-1;
		for(int i=2;i<n;i++)
		{
			if(n%i== 0)
				Isprime = false;
			
		}
		
		*/
		
		// optimize algorithm
		// we know that if a number (say n) is prime so it's one of the factor lies from [ 2 to (under-root of n)](closed bracket)
		
		for(int i=2;i*i<=n;i++)
		{
			if(n%i== 0)
				Isprime = false;
			
		}
		
		if(n<=1)
			Isprime=false; // 1 is not a prime number
		System.out.println("Is prime : "+Isprime);
		
		
	}
}
