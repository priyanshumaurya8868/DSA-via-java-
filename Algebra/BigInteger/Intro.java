package Algebra.BigInteger;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Intro {

    public static void main(String[] args) throws Exception{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      
     BigInteger a= new BigInteger(br.readLine().trim());
     BigInteger b= new BigInteger(br.readLine().trim());
     BigInteger sum = BigInteger.ZERO;
     BigInteger mul = BigInteger.ZERO;
     
    sum = a.add(b);
    mul =a.multiply(b);
     
     System.out.println(sum);
     System.out.println(mul);
    }
}