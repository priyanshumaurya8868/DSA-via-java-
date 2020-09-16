

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
	public static int MOD =(1000*1000*1000); 
	
	private static long linearRec(int n,int k,int[] b, int c[]) {
		if(n <= k) return b[n-1]; //since till, k  -> ->  a[i] = b[i]
		long[][] trans = buildTrans(k, c);
//		System.out.println("initially trans : -");
//		for(int r= 0;r<k;r++) {
//			for(int e=0;e<k;e++) {
//				System.out.print(trans[r][e]+" ");
//			}
//			System.out.println();
//		}
		trans = pow(trans, n-k);
//		 System.out.println("finally trans : -");
//		 for(int r= 0;r<k;r++) {
//		 	for(int e=0;e<k;e++) {
//		 		System.out.print(trans[r][e]+" ");
//		 	}
//		 	System.out.println();
//		 }
		long res[] = multiply(trans, b);
		
//		System.out.println("res: -");
//		for(long  h : res)
//			System.out.print(h+" ");
//		System.out.println();
		
 		return res[0];
	}
	

	private static long[][] pow(long[][] trans, int i) {
		if(i ==1 )return trans; 
		long[][] res = new long[trans.length][trans[0].length];

		for(int  j =0 ;j < trans.length; j++)res[j][j]=1; 
//		int k= trans.length;
//		 System.out.println("res Ia : -");
//		 for(int r= 0;r<k;r++) {
//		 	for(int e=0;e<k;e++) {
//		 		System.out.print(res[r][e]+" ");
//		 	}
//		 	System.out.println();
//		 }
		while ( i > 0) {
			if(i%2 ==1) res =multiply(res,trans);
			trans= multiply(trans,trans);
				i/=2;
		}
		return res;
	}
	


	private static long[][] multiply(long[][] res, long[][] trans) {
	int k =trans.length;
			long[][] ans = new long[k][k];
		for(int i =0; i < k; i++) {
			for(int j=0;j < k; j++)
			{
				for(int l=0; l < k; l++) {
					ans[i][j] += (res[i][l]*trans[l][j])%MOD;
					ans[i][j] %=MOD;
					
				}
			}
		}
		return ans;
	}
 private static long[] multiply(long[][] trans,int[] a) {
	long[] res = new long[trans.length];
	for(int  i=0 ;i < trans.length; i++) {
		for(int j =0 ; j <trans.length; j++) {
		//	 ai = c1*ai-1 + c*2ai-2 + ... + ck*ai-k (for i > k)
			res[i] += (trans[i][j]*a[a.length-1-j])%MOD;
			res[i]%=MOD;
		}
	}
	return res;
 }
	private static long[][] buildTrans(int k, int[] c) {
		long[][] trans = new long[k][k]; 
		for(int  i=0; i < k; i++) trans[0][i] = c[i];
		for(int i=1; i<k; i++) trans[i][i-1] =1;
		return trans;
	}


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C= Integer.parseInt(br.readLine().trim());
        while(C-->0) {
        	int k = Integer.parseInt(br.readLine().trim()); 
   	int i=0;    int[] b = new int[k];String[] ipb = br.readLine().trim().split(" "); for(String s : ipb) b[i++] = Integer.parseInt(s);
        i=0;	int[] c = new int[k];String[] ipc = br.readLine().trim().split(" "); for(String s : ipc) c[i++] = Integer.parseInt(s);
        	
        int n = Integer.parseInt(br.readLine().trim());
        
        System.out.println(linearRec(n, k, b, c));
        }
	}
}
