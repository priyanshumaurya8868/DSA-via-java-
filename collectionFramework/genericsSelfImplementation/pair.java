package collectionFramework.genericsSelfImplementation;

public class pair <X,Y>  //just to implement generic in our program all we need to write this "<> "and it'll be decide by us the generic datatype/place holder we put in it
{                       // can also be <X,Y ,...,Z>
	X x;
	Y y;
	pair(X x,Y y){
		this.x = x;
		this.y = y;	
	}
public void getDiscription() {
	System.out.println(x+ " & "+ y);
}

}
