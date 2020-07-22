package oops.packages;
import oops.packages.modules.Samsung;
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung music1 = new Samsung(2,1500);
		
		
	/*
	  	 u can,t access dp over here  decause it is default
  music1.dp();
	 */
		
		/*  tying to access default access specified class name assessories 
		 *  which accessible within the package only
		 *  let see can we access it from its sub package
		 */
		
		/*
		 * assessories a=new assessories();    //compilation error  
		  
		  hence, we can only access default classes within a packages not from sub-packages
		  
		 */
		
		
		// access the public functions 
		oops.packages.modules.Samsung.main(args);
		
		oops.packages.modules.Nokia n1 = new oops.packages.modules.Nokia(2, 2000);
		n1.dp();
	}
	class Hello
	{
		Hello()
		{
			System.out.println("default class of main package\nhello");
		}
	}
	
	/***********************************************************************************************************************************************************/
	/*                                                    ANOTHER WAY TO ACCESS THE ACCESSIBLE STUFF                                                           */
	/***********************************************************************************************************************************************************/
	
	

}
