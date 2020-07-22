package collectionFramework.maps;
import java.util.*;
import java.util.HashSet;

class marker{
int price;
String colour;
public marker(int x,String s) {
	price = x;
	colour =s;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((colour == null) ? 0 : colour.hashCode());
	result = prime * result + price;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	marker other = (marker) obj;
	if (colour == null) {
		if (other.colour != null)
			return false;
	} else if (!colour.equals(other.colour))
		return false;
	if (price != other.price)
		return false;
	return true;
}
}
public class HashcodeEqualsPart_2 {
	public static void main(String[] args) {
	
		marker m1= new marker(10,"blue");
		marker m2=new marker (10,"blue");
		
		Set<marker> markers =new HashSet<>();
		markers.add(m2);
		markers.add(m1);
		System.out.println("m1 = "+m1);
		System.out.println("m2 = "+m2);
		System.out.println("m1==m2 : "+(m1==m2));
		System.out.println(markers);
	}

}
