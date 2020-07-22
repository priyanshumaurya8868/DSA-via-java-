package oops.packages.modules;
public class Nokia
{
	int price;
	int simCard;
	public Nokia()
	{
		
	}
	public Nokia(int simCard,int price)
	{this.price=price;
	this.simCard=simCard;	
	System.out.println("this is feature phone by Nokia\nsim supports "+simCard+ "sim card \nprice = "+price );
	}
	public void dp()
	{ int dp=price-(28/100*price);
		System.out.println("dp  = "+dp);
		int profit=price-dp ;
		System.out.println("profit = "+profit);
	}
	
		static void main(String[] args)
		{// not gonna shot as an output of the this source code for that public keyword needed in front of main()
			Nokia n1=new Nokia(2,1550);
			oops.packages.modules.Samsung s1 = new oops.packages.modules.Samsung();
			 
		}
		
}
 
	
	


