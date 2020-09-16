 package bitmanipulation.problems;
class Solution {
    public int hammingDistance(int x, int y) {
          if(x==y) return 0;
      //1. turn on all bits 
        int sx= setBits(x);
        int sy = setBits(y);
       
        // convert into pow of 2
        int cx = checkPoint(sx);
        int cy = checkPoint(sy);
    
            // get power
        int px = count2Pow(cx);
        int py = count2Pow(cy);
        
        int mp =Math.max(px,py);
       
     return  hamping(x,y,mp);
        
        
        
    }
    private int hamping(int x,int y,int n){
        int count =0;
        for(int i =0;i<n;i++){
            if((x & (1<<i)) != (y &(1<<i)))
                count++;
                
        }
        return count;
    }
    private int checkPoint(int n){ //check points 1,2,4,8,16,32,64...
        return (n+1); 
    }

    private int setBits(int n){//it turn on all bits (to 1) 
        n = n|n>>1;
        n = n|n>>2;
        n = n|n>>4;
        n = n|n>>8;
        return n;
    }
    private int count2Pow(int n )
    {
        int count=0;
        while(n!=1){
            count++;
            n/=2;
        }
        return count;
    }
}
public class hammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		System.out.println(s.hammingDistance(1, 4));

	}

}

//What does come to your mind first when you see this sentence "corresponding bits are different"? 
//Yes, XOR! Also, do not forget there is a decent function Java provided:
//Integer.bitCount() ~~~

//public class Solution {
//    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
//    }
//}
