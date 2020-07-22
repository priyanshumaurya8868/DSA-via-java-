package loops;
 import java.util.Scanner;
public class factorial {
public static void main(String[] args)
{
	System.out.println("Enter the No. :");
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int f=1;
	for(int i=n-1;i>0;i--)
		f *=i;
	System.out.println("Factorial : "+ f);
	
}
}