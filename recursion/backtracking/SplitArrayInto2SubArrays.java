package recursion.backtracking;
import java.util.*;


public class SplitArrayInto2SubArrays {

	public static void main(String[] args) {
int a[]= {2,1,2,3,4,8};
split(a);

	}
	public static void split(int a[]) {
		ArrayList<Integer> ans = new ArrayList<>();int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		boolean isPossible = (sum&1)==0 && splitUtil(a, 0, sum/2, ans);
		if(isPossible)
			for(int e : ans) {
				System.out.println(e+" ");
			}
		else
			System.out.println("Not Possible!");
		
		
	}
	public static boolean splitUtil(int a[],int i,int sum,ArrayList<Integer> ans) {
if(i>=a.length||sum<0) return false;
		if(sum==0)return true;
				ans.add(a[i]);
				boolean leftPossible= splitUtil(a, i+1, sum-a[i], ans);
				if(leftPossible) return true;
				ans.remove(ans.size()-1);
				return splitUtil(a, i+1, sum, ans);
		
	}

}
