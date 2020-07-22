package collectionFramework.sets;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		
// NOTE :- > it does not contain duplicates elements (due to hash function)

//		types:-
//		1: HashSets : Stores data unorderredly such that it can perform all operation with time complexity O(1)
//		2: LinkedHashSets : stored data sequentially as it was entered
//		3: TreeSets : stored data in sorted ordered
		
		//#1: 
		Set<Integer> hs = new HashSet<>();
		hs.add(101);
		hs.add(81);
		hs.add(61);
		hs.add(41);
		hs.add(21);
		
		hs.add(101);//try duplicate  
		System.out.println("HashSet : "+hs);
		
/****************************************************************************/	
	       Iterator<Integer> i=hs.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           } 
		
/*************************************************************************/		
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(101);
		lhs.add(81);
		lhs.add(61);
		lhs.add(41);
		lhs.add(21);
		lhs.remove(234);
		System.out.println("LinkedHashSet : "+lhs); 
		System.out.println();
		
		SortedSet<Integer> ts = new TreeSet<Integer>();
		ts.add(101);
		ts.add(81);
		ts.add(61);
		ts.add(41);
		ts.add(21);
	
		System.out.println("TreeSet : "+ts);
		System.out.println();
		System.out.println("Largest element : "+ts.first());
		System.out.println("Smallest element: "+ts.last());
		
		
	    for(int it : ts) {
	    	System.out.println(it);
	    }
		
	}

}
