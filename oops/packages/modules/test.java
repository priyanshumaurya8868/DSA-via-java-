package oops.packages.modules;
import oops.packages.modules.Samsung;
import oops.packages.*;
public class test {
	public static void main(String[] args)
	{
		//assessories class is default(access specifier) so we access it in any of the file within this modules package
		assessories a = new assessories();
		
		// this is sub package file 
		// can't access default classes from it's main-packages class's 
		// e.g.
		//Hello h= new Hello(); oops.packages.Hello
		
	}

}
