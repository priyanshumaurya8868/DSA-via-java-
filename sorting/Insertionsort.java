package sorting;

public class Insertionsort {

	public static void main(String[] args) {
	
      int array[]= {9,8,7,64,5,2,3,4};
      int n= array.length;
      
      //outer loop i.e unsorted sub array
        for(int i=1;i<n;i++)
        { int temp=array[i];
        	int j=i-1;
        	//inner loop -> sorted sub array
        	//using while loop as we don't know starting and terminating point
        	while(j>=0 && array[j]>temp)
        	{
        		array[j+1]=array[j];
        		array[j]=temp;
        		//regulating loop
        		j--;
        	}
        	array[j+1]=temp;
        }
        System.out.print("Sorted Array : ");
		for(int item : array)
			System.out.print(item+", ");
	}

}
