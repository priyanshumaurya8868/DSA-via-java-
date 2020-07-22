package loops;
import java.util.Scanner;
public class Power {
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Power : ");
		int p = sc.nextInt();
		int result=1;
		for(int i = 0 ; i < p; i++)
		{
			result *= n;
		}
		System.out.println("Result : "+result);
		
	}

}
