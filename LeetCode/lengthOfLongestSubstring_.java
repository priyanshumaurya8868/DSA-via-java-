package LeetCode;

import java.util.HashMap;
//the basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values,
//and keep two pointers which define the max substring. move the right pointer to scan through the string , 
//and meanwhile update the hashmap. If the character is already in the hashmap, 
//then move the left pointer to the right of the same character last found. 
//Note that the two pointers can only move forward.

public class lengthOfLongestSubstring_ {

	 static public int lengthOfLongestSubstring(String s) {
		   if(s == null) return 0; int  j=0; int max=0;
		   HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		   for(int i=0;i<s.length();i++) {
			   if(hm.containsKey(s.charAt(i))) {
				   j = Math.max(j, hm.get(s.charAt(i))+1); //+1 because of what we we have done below //values a 
			   }
			   hm.put(s.charAt(i), i);
			   max =Math.max(max, i+1-j); // for coping " " is testcase
		   }
		   return max;
		    }
	    
	    public static void main(String[] args) {
	    int n =	lengthOfLongestSubstring("abcabcabc");System.out.println(n);
	 
	    }

}
