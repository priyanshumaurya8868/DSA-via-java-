package interviewQuestions;

import java.util.*;

public class SlidingWindowMaximum {
	static class Solution{
		public int[] maxSlidingWindow(int[] a, int k) {
			
			Deque <Integer> dq = new LinkedList<>();
			int n = a.length;
			if(n<=1 ) return a;
			int ans[] = new int[n-k+1];
			int i = 0;
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
					dq.removeLast();
				dq.addLast(i);
			}
			for(;i<n;i++) {
				ans[i-k] = a[dq.peekFirst()];
				while(!dq.isEmpty() && dq.peekFirst() <= i-k)
					dq.removeFirst();
				while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
					dq.removeLast();
				dq.addLast(i);
			}
			ans[i-k] = a[dq.peekFirst()];
			return ans;
		}
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int a[] = {1,5,2,6,2,1,0,7,13,6,9,14}; 
		int[] ans = s.maxSlidingWindow(a, 3);
		for(int x :ans )
			System.out.print(x+", ");
		
	}

}
