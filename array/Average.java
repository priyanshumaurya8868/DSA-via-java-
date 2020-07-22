package array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

   System.out.println("Enter the no. of student in your batch : ");
   Scanner sc=new  Scanner(System.in);
   int n=sc.nextInt();
   int[] array;
   // or int array[];
   array = new int[n];
   System.out.println("Enter the marks  of "+n+"students : ");
   for(int i=0;i<array.length;i++)
	   array[i]=sc.nextInt();
   int average = 0;
   
   for(int i=0;i<array.length;i++)
      average+=array[i];
  
   average/=n;
   System.out.println("Average : "+average);
 
      sc.close();
      

	}

}
