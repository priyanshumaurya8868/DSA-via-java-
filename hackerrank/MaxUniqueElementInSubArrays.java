package hackerrank;

import java.util.*;
public class MaxUniqueElementInSubArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        int n = in.nextInt();
        int m = in.nextInt();
int max=0;
Set<Integer> hs = new  HashSet<>();

Deque<Integer> dq= new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
                     dq.add(num);
                     hs.add(num);
                     if(dq.size()>m) {
                    	 int q_out =(int)dq.remove();
                    	 
                    	 if(!dq.contains(q_out))
                    		 hs.remove(q_out);
                     }
                     max=Math.max(hs.size(), max);
                     
        }
        System.out.println(max);
    }
}



