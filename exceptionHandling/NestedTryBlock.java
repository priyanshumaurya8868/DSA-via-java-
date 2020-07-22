package exceptionHandling;

public class NestedTryBlock {
/*
 * ....  
try  
{  
    statement 1;  
    statement 2;  
    try  
    {  
        statement 1;  
        statement 2;  
    }  
    catch(Exception e)  
    {  
    }  
}  
catch(Exception e)  
{  
}  
....  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			try {
				int u  = 30/0;
				
			}catch(ArithmeticException e) {
				System.out.println("TryBlock 1.1 : "+e);
			}
			
			try {
				int a[] = new int [5];
				System.out.println(a[10]);
			}catch(IndexOutOfBoundsException e) {
				System.out.println("TryBlock 1.2 : "+e);
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
