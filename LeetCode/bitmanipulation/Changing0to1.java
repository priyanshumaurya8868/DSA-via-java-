package LeetCode.bitmanipulation;

import java.util.Scanner;



public class Changing0to1 {

static void way1(int s ) {

	    String s1=Integer.toBinaryString(s);
	    System.out.println(Math.abs(Integer.parseInt(s1.replaceAll("0","1"),2)-s)+" " +Integer.parseInt(s1.replaceAll("0","1"),2));

	 
}

static void way2(int n ) {

	  int p =n;
	  
	  {
		  n|=(n>>1);
		  n|=(n>>2);
		  n|=(n>>4);
		  n|=(n>>8);
		  n|=(n>>16);
		  n|=(n>>32);
	  }
	  System.out.println("difference : "+ (n-p));
	  System.out.println("output : "+n);
}
	public static void main(String[] args) {
	System.out.println("hi");
 way2(8);
 way1(8);
	}

}
