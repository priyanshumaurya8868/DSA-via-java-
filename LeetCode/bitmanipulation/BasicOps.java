package LeetCode.bitmanipulation;

public class BasicOps {


	// Count the number of ones in the binary representation of the given number.
    static int count_one (int n)
    {int count=0;
        while( n>0 )
        {
        n = n&(n-1);
           count++;
        }
        return count;
}
    
    boolean check_ith_Bit (int N,  int  i)
    { 
        if(( N & (1 << i)) ==1 )
            return true;
        else
            return false;
    }
	
    //Find the largest power of 2 (most significant bit in binary form), which is less than or equal to the given number N.
	static long largest_power(long N)
    {
        //changing all right side bits to 1.
        N = N| (N>>1);
        N = N| (N>>2);
        N = N| (N>>4);
        N = N| (N>>8);
        N = N| (N>>16);

    //as now the number is 2 * x-1, where x is required answer, so adding 1 and dividing it by
                   return (N+1)>>1;

    }
	public static void main(String[] args) {
		

	}

}
