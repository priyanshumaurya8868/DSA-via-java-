package collectionFramework.maps;
import java.util.*;

public class HashcodeEqualsPart_1{
/*
 * hashCode() and equals() methods have been defined in Object class which is parent class for java objects.
 * for this reason,all java object inherit a default implementation of these methods
 *  
 *  java hashCode()
 *  object class defined hashCode() method like this :-
 *  
 *  public int hashCode(){
 *  //TODO return the hashCode; 
 *  }
 *  
 *  public boolean equals(Object obj){
 *  return( this==obj);
 *  }
 *  
 */
	
	public static void main(String[] args) {
		
		pen p1= new pen(10,"blue");
		pen p2 = new pen(10,"blue");
		
		
		System.out.println("p1==p2 : "+(p1==p2));//false
		System.out.println("p1.equals(p2) : "+p1.equals(p2));//false  // this method has been overrided in String
		//hence both are at diff memory location
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		
		Set<pen> set  = new HashSet<pen>();
		set.add(p1);
		set.add(p2);
		
		System.out.println(set); 
//two separate objects stored  have similar data 
		//because it has been using default equals() and hashCode()
		

	}

}
 class pen{
	int price;
	String colour;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pen other = (pen) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	public pen(int x,String s) {
		price =x;
		colour = s;
	}
}
/*********************** TO BE CONTINUE... ****************************/
