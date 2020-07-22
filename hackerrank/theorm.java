package hackerrank;
import java.util.*;
public class theorm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0) {
		int a =sc.nextInt();
		int b =sc.nextInt();
		int n =sc.nextInt();
		int s=a;
		for(int i=0;i<n;i++) {
			s+=Math.pow(2,i)*b;
		System.out.print(s+" ");
		}
		System.out.println();
	}

}
}