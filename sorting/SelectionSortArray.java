package sorting;

public class SelectionSortArray {

	public static void main(String[] args)
	{
		int[] array = {-1,5,2,3,7,};
		int n= array.length;
		for(int i=0;i<n-1;i++)
		{int minInd=i;
			for(int j=i;j<n;j++)
			{
				
				if(array[minInd] > array[j])
				{
					minInd=i;
				}
			}
			if(minInd!=i) {
			int temp = array[minInd];
			array[minInd] =array[i];
			array[i]=temp;
			}
		}
		System.out.print("Sorted Array : ");
		for(int item : array)
			System.out.print(item+", ");
	}

}
