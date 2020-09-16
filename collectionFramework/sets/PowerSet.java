package collectionFramework.sets;
import java.util.*;
public class PowerSet<Y> {
               
	 public Set<Set<Y>> powerSet(Set<Y> s){
		 
		 @SuppressWarnings("unchecked")
		Y[] a = (Y[])s.toArray(); 
	
		 Set<Set<Y>> res = new HashSet<>();
		 
		long n = (long)Math.pow(2, s.size()); // no of ele in P(s)
		 System.out.println("Size : "+n);
		for(int i =0; i< n ; i++) {
			Set<Y> temp = new HashSet<Y>();
			for(int j =0; j < s.size(); j++) {
                /* Check if jth bit in the  
                counter(i.e. 'i') is set If set then  
                print jth element from set */
				if((i & (1<<j)) > 0) {
					temp.add(a[j]); 
					System.out.println("adding "+a[j]+ " j : "+j);
				}
			}
			res.add(temp);
			System.out.println(i+1+"ele => "+" temp :"+temp+" res : "+res);
		}
		 return res;
	 }
}
