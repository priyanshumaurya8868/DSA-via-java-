import java.util.*;

// find subset divisible with size of set or
// find duplicate with index
class B{
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int ans,sum=0,b[],used[];
		while(t-->0){
			int n = in.nextInt();
			b = new int[n+1];
			used= new int[n];
			sum =0;
			for(int i=1; i<n; i++)
				used[i] = -1;

			for(int i=1; i<=n; i++)
				b[i] = in.nextInt();
			for(int i=1; i<=n; i++){
				sum = (sum+b[i])%n;
				if(used[sum]!=-1)
				{
					System.out.println(i-used[sum]);
					for(int j=used[sum]+1; j<=i; j++)
						System.out.print(j+" ");
					System.out.println();
					break;
				}
				used[sum]=i;
			}
		}
	}
}