package recursion.numbers;
import java.util.*;
public class GFGseries {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int t =sc.nextInt();
	while(t-->0) {
		int n = sc.nextInt();
		int[] a = new int[2+n];
		a[0] = 0;
		a[1] = 1;
		GFG(a,n);
		System.out.println();
	}
	}
public static void GFG(int a[],int n) {
		for(int i=2;i<n;i++) {
			a[i]=a[i-2]*a[i-2]-a[i-1];
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
}

}
