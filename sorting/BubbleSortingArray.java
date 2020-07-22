package sorting;

import java.util.Scanner;

public class BubbleSortingArray {

	public static void main(String[] args) {
	System.out.println("size : ");
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	int array[]=new int[n];
	System.out.println("Enter the elements : ");
	for(int i =0 ;i<array.length;i++)
		array[i]=sc.nextInt();
	
	for(int i=0;i<n-1;i++)
	{  boolean sorted=true;
		for(int j=0;j<n-1-i;j++)
		{   
			if(array[j]>array[j+1])
			{ 
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				sorted=false;
			}
			
		}
	 if(sorted) break;
	}
	System.out.print("Sorted Array : ");
for(int i=0;i<n;i++)
	System.out.print(array[i]+ ", ");

	}
}
