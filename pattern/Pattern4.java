package pattern;
import java.util.Scanner;
public class Pattern4 {
public static void main(String[] agr)
{
	System.out.print("Enter the value for n :");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
 for(int i=1;i<=n;i++) {
	 int j; for(j=1;j<=n-i;j++)
		 System.out.print("  ");
	 for(;j<=n;j++) {
		 System.out.print("* ");
	 }
	 System.out.println();
 }
}
}
