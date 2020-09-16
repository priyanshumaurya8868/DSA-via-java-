package collectionFramework.sets;
import java.util.*;
public  class testP {

	public static void main(String[] args) {
 PowerSet<Character> P = new PowerSet<Character>();

 Set <Character> set = new LinkedHashSet<Character>();
 set.add('a');
 set.add('b');
 set.add('c');
  Set<Set<Character>> res = P.powerSet(set);
 
 System.out.println( res.toString());
		
	}

}
