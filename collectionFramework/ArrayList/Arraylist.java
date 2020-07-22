package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	/* 
	 *   #bhaiya ke notes is good  : 
	 *    ArrayList Class is an  implementation list interfaces to create an resize-able arrays
	 *    
	 *    in java we need to declare the size of the array before we us it. once we declare the size of the array it is hard to change it
	 *    
	 *   the size of the array gets double when we crrosed the certain threshold limit
	 *   
	 *    RandomAccess, clone-able, serializable,non synchronized,can contain duplicate elements.
	 *    
	 */

	public static void main(String[] args) {
		
// TYPE OF DECLARATTION :-
	//1 :non generic-> can put any data type related item 
		
    //2 : generic  
		
		
		/****************************************** non-Generic ***********************/
		ArrayList Generic = new ArrayList();
  
		Generic.add("String");
		Generic.add(23);
		Generic.add(2.23);
		Generic.add(true);
		// #1 
		System.out.println(Generic);
		
		// #2
		System.out.print("Generic traversal using iterators : ");
		Iterator ij = Generic.iterator();
		while(ij.hasNext()) {
			System.out.print(ij.next()+", ");
		}System.out.println("\n");
       //NOTE : IN NON-GENERIC CASE you can't  use forEach loop for iterating 
		
		ArrayList <Integer> nongenerics  = new ArrayList();
		//generics.add("fds"); // error
		nongenerics.add(23);
		nongenerics.add(33);
		nongenerics.add(24);
		nongenerics.add(76);
		nongenerics.add(56);
		nongenerics.add(68);
		
		/** way from that we can iterate  ArrayList *********************************/
		Collections.sort(nongenerics);
// 1 : 
		
		System.out.println(nongenerics);
		
// 2 : Iterator 
		System.out.println("Traversing list through Iterator :");
		 Iterator itr=nongenerics.iterator(); //generic iterator
		 while(itr.hasNext())              //check if iterator has the elements 
	  System.out.println(itr.next());//printing the element and move to next  
// 3 : for each loop
		 System.out.print("Iterating By for-each loop : ");
		for(Integer i : nongenerics)
			System.out.print(i+", ");System.out.println();
// 4 : for loop 
			System.out.print("Using for loop : ");
			for(int i=0;i< nongenerics.size();i++)  // ArrayList.size()  = Array.length
				System.out.print(nongenerics.get(i)+", ");
			System.out.println();
			
// 5 :  forEach() with lambda expression
			System.out.print("forEach() method : ");  
			//The forEach() method is a new feature, introduced in Java 8.  
			nongenerics.forEach(a->{  //Here, we are using lambda expression 
				System.out.print(a+", ");
			});System.out.println();

// 6 :  forEachRemmainning() with lambda expression
				System.out.print("forEachRemainig() method : ");  
				
			//need to iterator's object
				Iterator <Integer> itr2 =nongenerics.iterator(); // non-geric iterator
				itr2.forEachRemaining(a->{
					System.out.print(a+", ");
				});System.out.println();
				
		 
				/*********************************** SORTING ******************************************/
				 
				Collections.sort(nongenerics);
				
				System.out.println("Sorted ArrayList : "+nongenerics);
				
				
				
				
				
				
				

	
	
	
	}

}
