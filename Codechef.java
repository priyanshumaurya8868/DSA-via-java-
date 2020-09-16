/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	

	public static void main (String[] args) throws Exception
	{
		
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long t = Long.parseLong(br.readLine().trim());
	while(t-->0) {
		int n = Integer.parseInt(br.readLine().trim());
		int[] b = new int[n+1];
		int[] used = new int[n]; for(int i =1; i<n; i++) used[i]=-1;
		int sum =0;	
		String[] ip = br.readLine().trim().split(" ");
		int  i =1;
		for(String s : ip)b[i++] = Integer.parseInt(s);
	
	
	for(i=1;i<=n; i++) {
	sum = (sum + b[i])%n;
      if(used[sum] != -1) 
      {
			System.out.println(i- used[sum]);
			for(int j = used[sum]+1; j <=i; j++)
				System.out.print(j+" ");
			System.out.println();
			break;
		}
       used[sum] = i;
	}	
	}
	}
}
