package array;
import java.util.*;
public class sorting {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n =sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(int i : a)
			{
				System.out.print(i+" ");
			}
		}

	}

}
