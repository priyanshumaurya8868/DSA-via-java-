package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		int n = sc.nextInt(); //no of lines -1
		
	//insertion part:	
		while(n-->0) {
			
			ArrayList<Integer> ele =new ArrayList<>();
			int d=sc.nextInt();//element in lines -2
			while(d-->0) {
				int num =sc.nextInt();
				ele.add(num);
			}
			al.add(ele);
		}
		//accessing part
		int q= sc.nextInt();//line -3 no of queries
				while(q-->0) {
					int x= sc.nextInt();
					int y=sc.nextInt();
//					ArrayList<Integer> util =al.get(x-1);
//					System.out.println(util.get(y-1));
					try {
						System.out.println(al.get(x-1).get(y-1));
					}catch(Exception e) {
						System.out.println("ERROR!");
					}
					
				}
			
		
	}
	
}