package stringBuffer;

public class DeclarationAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("Priyanshu ");
		System.out.println("sb1 : "+ sb1);
		
/* NOTE : You can't convert string to stringBuffer like this :-
		StringBuffer sb2 = "hi dear";
		System.out.println(sb2);
		*
=>>	*hence there is only one method of declaration
		*/
		
/***********************************************************************************************/
/**********************************METHODS******************************************************/
	/* 1)-> Concatenate : StringBuffer = StringBuffer.append("charSequence");
	 
	 */
		sb1.append("Morya"); //mutable string
		System.out.println("\nconcatenated StringBuffer : "+sb1);//Priyanshu Morya
		
		
		/* 2)-> Inserting :  StringBuffer.insert(int index(begning));
		 * 
		 */
		
		sb1.insert(12, 'u');
		System.out.println("\nInserting char 'u' at indexNo. 12 : "+sb1);
		sb1.insert(10,"Kumar ");
		System.out.println("Insering String [Kumar ] at indexNo. 10 : "+sb1);
		
		/* 3)-> Replacing : StringBuffer.replace(int begIndex,int endIndex.char/String)
		 *  
		 */
		sb1.replace(9,10," Adarsh"); // index 9 : space (inclusive means gonna replace) //index 10 A (exclusive means gonna as it is)
		System.out.println(sb1);
		
		/* 4)-> Deleting : StringBuffer.delete(int start,int end,)
		 * 
		 */
		
		
		sb1.delete(9, 10);
	System.out.println("\nAfter deletion : "+sb1);
	
	/* 5)-> reverse 
	 * 
	 */
	 sb1.reverse();
	 System.out.println("\nAfter reverseing : "+sb1);
	 
	 /* 6-> capacity()  
	  *  help in knowing the current capacity of the string buffer which was 16 by default and increment by ((oldCapacity*2)+2) whenever the old limit exceed 
	  */
	 System.out.println("Capacity : "+sb1.capacity());
	 
	 /* 7)-> ensureCapacity()
	  * 
	  */
	 
	 sb1.ensureCapacity(53);//no effect if we pass capacity lesser or equal to current capacity
	 System.out.println("After sb1.ensureCapacity(10) : "+sb1.capacity());

	 sb1.ensureCapacity(60);//((oldCapacity*2)+2) it only happens when we put greater capacity in this function than current capacity
	 System.out.println("after incrementing capaacity by ensureCapacity(60) : "+sb1.capacity()); // 54*2+2=110
		StringBuffer sb2 =sb1;
		System.out.println("reversing sb1 and store in sb2\nsb2 : "+ sb2);
		sb1.reverse();
		System.out.println("reverse sb1 again to get into original state\nsb1 :"+sb1);
	
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));
		System.out.println("because\nsb1 : "+sb1+"\nsb2 : "+sb2);
		System.out.print("Execution Time : ");
		System.out.println(+System.currentTimeMillis()-startTime+"ms");
		
	}
               
}
