package LeetCode.bitmanipulation;

public class reverseBits_ {
static public int reverseBits(int n) {
    int res =0;
    for(int i =0 ; i<32; i++){
        res<<=1;
        res = res|(n&1);
        n>>=1;
    }
    return res;
    
}
    
public static void main(String[] args) {
	System.out.println(reverseBits(1011111111) );
}
}
