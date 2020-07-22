package pattern;
import java.util.Scanner;
public class HPattern7 {
public static void main(String[] args)
{ System.out.println("Enter the value for n : ");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	//part-1
	if(n>0)
	System.out.println("* ");
	
	for(int i=2;i<=n-1;i++) {
		System.out.print("* ");
		for(int j=1;j<=i-2;j++)
			System.out.print("  ");
		System.out.println("* ");
	}
for(int i=1;i<=n;i++) {
	System.out.print("* ");
}
}
}
