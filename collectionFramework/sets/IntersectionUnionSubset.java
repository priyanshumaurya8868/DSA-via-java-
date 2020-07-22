package collectionFramework.sets;

import java.util.*;

public class IntersectionUnionSubset {

	public static void main(String[] args) {
		
           Set<Integer> s1= new HashSet<>();
           Set<Integer> s2= new HashSet<>();
           Set<Integer> s3= new HashSet<>();
           
           
           s1.add(3);
           s1.add(15);
           s1.add(30);
           s1.add(45);
           s1.add(33);
           s1.add(63);
           s1.add(40);
           
         
           s2.add(15);
           s2.add(30);
           s2.add(45);
           
           
           s3.add(10);
           s3.add(20);
           s3.add(30);
           s3.add(40);
           /************************************************* SUBSET **************************************************/
           System.out.println("s1 : "+ s1 );
           System.out.println("s2 : "+s2);
           System.out.println("s3 : "+s3);
           System.out.println();
           System.out.println("s2 subset of s1 : "+ s1.containsAll(s2) );
           System.out.println("s1 subset of s2 : "+s2.containsAll(s1));
  
  /************************************************* INTERSECTION **************************************************/
           Set<Integer> intersection = new HashSet<Integer>(s3);
           intersection.retainAll(s2);
           System.out.println("s1 intersection s2 : "+intersection);
           
       
           /************************************************* UNION **************************************************/
           Set<Integer> Union =s3;
           Union.addAll(s2);  //still change has been occured in s3 if dont want manipulate the data of s3 allocate a separate space in memory
           System.out.println("s3 Union s2 : "+Union);
           
	}

}
