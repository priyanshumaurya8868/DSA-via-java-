package hackerrank;

import java.util.*;

public class TwoPointerAlgo {
static void pair(int a[],int n,int sum) {
	//two pointers
	int i,j;
	int count=0;
	i=0;//pointing to first element
	
	j=n-1;//pointing to the last element
	while(i<=j) {
		if(a[i]+a[j] > sum) {
			j--;
		}
		else if(a[i]+a[j] < sum) {
			i++;
		}
		else if (a[i]+a[j] == sum)
		{i++;
		j--;
	if(a[i]==a[j] && (a[i]+a[j] ==sum ))
		count+=2;
	
		else
		count++;
		}
}
	System.out.println(count);
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0) {
			int n =sc.nextInt();
			int sum =sc.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++) 
				a[i]=sc.nextInt();
			Arrays.sort(a);
			pair(a,n,sum);				
			
		}

	}

}
