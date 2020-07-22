package pattern;
import java.util.Scanner;
public class Pattern2 {
public static void main(String[] args)
{
	System.out.println("Enter the value for n : ");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	while(n!=0)
	{
		for(int i=1;i<=n;i++)
			System.out.print("* ");
		System.out.println();
		n--;
	}
}
}
