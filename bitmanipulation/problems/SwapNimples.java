package bitmanipulation.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapNimples  //means : 01000110 ->  01100100
{
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		{ 
			int n = Integer.parseInt(br.readLine().trim());
			
			int n1= n;
			int i=0; int res=0;
	 while( n1> 0 && i <8)
	 {
		 if(( n &(1<<i)) > 0)
		 {
			 if( i < 4) {
				 int temp = (1<<i+4);
				 res|=temp;
				// System.out.println("res -> "+res + "| temp -> "+temp+ "| i -> "+i);
			 }
			 
			 if(i >=4) 
			 {
			
				 int temp =  (1<<i-4);
				 res|=temp;
				// System.out.println("res -> "+res + "| temp -> "+temp+ "| i -> "+i);
			 }
		 }
		n1>>=1;  i++;
		 
	 }
		   System.out.println(res);
		 
		}
	}
}
