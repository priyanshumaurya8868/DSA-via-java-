package collectionFramework.maps;
import java.util.*;
import java.util.Map.Entry;

public class Intro {
//maps are stored Key-Value pair.Key are the unique values associated with individual Values
//donot conatin duplicate
/*
 * map is a interface 
 * types of its classes:-
 * 1: HashMap
 * 2: EnumMap
 * 3: LinkedHashMap
 * 4: WeakHashMap
 * 5: TreeMap
 *  
 */
	
	/* METHODS OF MAPS
	 *  For Insertion : put(K,V),putAll(map) , putIfAbseent(K,V),
	 *  for Accessing : get(K),getOrDefault(K,defaultValue)  -> returns value of key, if not present then return defaultValue
	 *  boolean value : containKey(K),containValue(V)
	 *  updating value: replace(K,newValue)-> replace the value of k, replace(K,old value,new value) ->replace the value of k only if k is associated with old value
	 *  removing value: remove(K),remove(K,V)-:remove K if is associated with value V
	 */
	
	// keySet() 
	//values()
	//entrySet();
	
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> m =new HashMap<String, Integer>();
		m.put("one", 1);
		m.put( "two", 2);
		m.put("three",3);
//*************************************************************************************		
		m.putIfAbsent("two",23); //not gonna execute because two is not Absent
		
		System.out.println("m : "+m);
		//******************************************
		

Map<Character,String> m2 =new HashMap<Character, String>();
m2.put('d',"Dog");
m2.put('e',"Elephant");

Map <Character,String> m1 = new HashMap<Character, String>();

m1.put('a',"Apple");
m1.put('b',"Banana" );
m1.put('c',"Cat");

m1.putAll(m2); // both object should be of same  type
System.out.println("m1 : "+m1);
System.out.println("m2  : "+m2);System.out.println();
//***************************************************************************

                      //#2
System.out.println(m.get("one"));
System.out.println(m.getOrDefault( "ten", 10)); //since "ten" is not present in the m, hence it return default value : 10
System.out.println();

                              //#3
System.out.println("Is m1 contains 'd' :"+m1.containsKey( 'd'));
System.out.println("Is m contains Value 10  : "+m.containsValue(10));


                             //#4
System.out.println(m2.replace( 'd',"Donkey"));
System.out.println("after replacing Dog to Donkey via m2: " );
System.out.println("m1 : "+m1);
System.out.println("m2  : "+m2);System.out.println();


m1.remove( 'x'); //not responding
m1.remove( 'e');
System.out.println("Removing  'e'  : "+m1);
m1.remove( 'b', "bat"); //not responding because b=banana not bat
System.out.println(m1);System.out.println();

System.out.println("keySet of m1 : "+m1.keySet()); //return Collection
ArrayList<String> a = new ArrayList<>(m1.values());
System.out.println("value set of m1 : "+a);
Iterator<String> i= a.iterator();
while(i.hasNext())
	System.out.println(i.next());
System.out.println(m1.entrySet());

Set<Entry<String,Integer>> entry = m.entrySet(); //return set
for(Entry<String,Integer> e : entry) {
	e.setValue(e.getValue()*100);
}
System.out.println("new modified m : "+m);




		
	}

}
