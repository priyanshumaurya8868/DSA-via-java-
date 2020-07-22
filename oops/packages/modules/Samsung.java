package oops.packages.modules;
import java.util.Scanner;
  public class Samsung
{// private var can not access outside this class by any file
	private int price;
	private int simCard;
	public Samsung()
	{
		System.out.println("default constructor!");
	}
	
	public Samsung(int simCard,int price)
	{this.price=price;
	this.simCard=simCard;	
	System.out.println("this is feature phone by Samsung \nsim supporting "+simCard+ "sim card \nprice = "+price );
	}
	/**********************************************************************************************************************************************************************/
	void dp()
	{ int dp=price-(28/100*price);
		System.out.println("dp  = "+dp);
		int profit=price-dp ;
		System.out.println("profit = "+profit+"\n\n");
		
	}
	/***********************************************************************************************************************************************************************************/
	public static void main(String[] args) {
		 System.out.println("\nhi welcome to the samsung's main\n");
		 
		 
}//main 
}//class samsung terminate 
  
  // look out test.java for its accessing
  class assessories
  {
	  assessories()
	  {
		  System.out.println("Inside the samsung feature phone you'll get\n1 charger 1 handphone\n");
	  }
  }
	
	


