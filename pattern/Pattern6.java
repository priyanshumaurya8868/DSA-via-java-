package pattern;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args)
	{
		System.out.println("Enter the value for n : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=(2*n);i++)
		{
			if(i<=n)
			{
				for(int j=1;j<=i;j++)
					System.out.print("* ");
			}
			else
			{
				for(int j=1;j<=(2*n-i);j++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
