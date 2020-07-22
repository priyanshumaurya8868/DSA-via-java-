package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[5]= 30/0; //ArithmethicException
			System.out.println(a[10]); //IndexOutOfBound
		}
		catch(NumberFormatException e) {
			System.out.println("exp 3 : "+e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("exp 4 : "+e);
		}
		catch(ArithmeticException e){
			System.out.println("exp 1 : "+e);
			}
		catch(NullPointerException e) {
			System.out.println("exp 2 : "+e);
		}
		
	
		//exception is the parent class of all the exceptions (used wen for generalizing)
		catch (Exception e) {    
			System.out.println("exp 5 : "+e);
		}
		// THESE SEQUENCE OF THE CATCH'S EXCEPTION HANDLER SHOULD NOT BE CHANGE WHILE IMPLEMENTION ELSE U WILL RECEVE COMP-ERROR
		
		finally 
			{System.out.println("finally block is always executed irresptive of the occurence of exceptions");}  
		
		System.out.println("rest of the code...");
	}

}
 /*************************************************************** NOTE **********************************************/
 /* 1: At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception
*/