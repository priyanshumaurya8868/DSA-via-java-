package collectionFramework.genericsSelfImplementation;


public class intro {
public static void main(String[] args) {
	pair<String,Integer> p = new pair("Priyanshu",45);
	pair<Float,Boolean> p2 = new pair(2.243,true);
		// here, you can't use int, float,double inside <> because these data types are not extends Object class 
	   // and here in generic u can only define Object class's children
	   // that;s why there are some wrapper class like Integer,Float,Double,String etc.
	
	p2.getDiscription();
	p.getDiscription();
	
	// but if u want their instance member variable to be initialized with a specific type of data then use wrapper classes in angular bracket (i.e. <>)
	
	
	
}
}
