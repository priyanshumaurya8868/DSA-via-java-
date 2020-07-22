package collectionFramework.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class GfG_que {

	public static void main(String[] args) {
		
		
	Scanner sc =new Scanner(System.in);
	int t =sc.nextInt();
	while(t-- > 0) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			}
		sc.close();
		for(i=0;i<n;i++) {
			if(i<k) {
				pq.add(a[i]);
			}else {
			if(pq.peek()<a[i])
			{
				pq.remove();
				pq.add(a[i]);
			}
		}
		}
		ArrayList<Integer> ans = new ArrayList<>(pq);
	
		Collections.sort(ans,Collections.reverseOrder());
		for(int x : ans)
			System.out.print(x+", ");
	//	System.out.println(ans);
	}

	}

}
