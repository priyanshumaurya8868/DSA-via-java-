package recursion.gameTherory;

public class maxxCoinGame {

	public static void main(String[] args) {
		int a[] = {1,5,7,3,2,4};
		System.out.println(maxxCoin(a, 0, a.length-1));
	}
 
	public static int  maxxCoin(int a[],int l,int r) {
		if(l+1==r)
			return Math.max(a[l], a[r]);
		return Math.max(a[l]+Math.min(maxxCoin(a, l+2, r),maxxCoin(a, l+1, r-1)),
			        	a[r]+Math.min(maxxCoin(a, l+1, r-1),maxxCoin(a, l, r-2)));
	}
	
}
