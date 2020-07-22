package collectionFramework.ArrayList;
import java.util.*;
public class MethodsOfArrayList {
	
//METHOD OF COLLECTION :- add(),addAll(),size(),remove(),iterator(),removeAll(),clear()
//METHOD OF ArrayList  :- add(Element),add(index,Element),addAll(Collections),get(index),set(index,value),remove(index),removeAll(),clear(),size(),contains(),toArray()

	
	public static void main(String[] args) {
		
		//#1 :add(Element) & add(index,element) [Appending]

		
		
		List <String> fruit = new LinkedList<>();
		//keeping this as an object of the list is beneficial in future down casting
		
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("hi");
		
		
		List <String> vegetable = new ArrayList<>();  //		List <String> vegetable = new ArrayList<String>(); if u don want warning
		vegetable.add("Potato");
		vegetable.add("Carrot");
		vegetable.add("Tomato");

		// #2 addAll(Collections);	              [ Appending ]
		System.out.print("Elements are : ");
		fruit.addAll(vegetable);
		fruit.forEach(a->{
			System.out.print(a+", ");
		});System.out.println();
         
		
		//#3 add(index, element)             [ Appending ]
		System.out.print("Appending lichi at index 1: ");fruit.add(1,"Lichi");System.out.println(fruit);

		//#4 get(index)                       [ Access ]
		System.out.print("At Index 3 : ");
		System.out.println(fruit.get(3));
		
		
		//#5 set(index,value)                [Updating..]

		System.out.print("set on 3 : ");fruit.set(3,"banana"); System.out.println(fruit);
		
   //   #6 remove(index)     & removeAll(Collections)                [ Deleting ]
		
		System.out.print("Delting at index 1:");fruit.remove(1);System.out.println(fruit);
		fruit.removeAll(vegetable);System.out.println("Removing vegetables : "+fruit);
		
	// #7 contains(element);
		System.out.println("Is fruit contains Apple : "+ fruit.contains("Apple"));
		
	// #8 toArray()
		
		// if we write fruit.toArray(); then this will return an array of Object class
	
//		Object x[] = fruit.toArray();System.out.print("Elements are : ");
//		for(int i= 0; i< fruit.size();i++)
//			System.out.print(x[i]);System.out.println();
		
		//but if we are sure about type of the elemnets in the Array list then 
		
		String temp[] = new String[fruit.size()];
		
		fruit.toArray(temp);System.out.println("Array from ArrayList : ");
		for(String e : temp)
		System.out.println(e);
		

}

}
