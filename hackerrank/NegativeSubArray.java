package hackerrank;
import java.util.*;

public class NegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int count=0;
int n = sc.nextInt();
int[] a= new int[n];
for(int i =0;i<n;i++) {
	a[i] = sc.nextInt();
	int sum=a[i];
	if(sum<0) count++;
	for(int j=i-1;j>=0;j--) {
		 sum +=a[j];
		 if(sum<0) count++;
	}
		
}sc.close();
System.out.println(count);
	}

}
