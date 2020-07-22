package string;
import java.util.Scanner;
import java.lang.Math;
public class Convert0sTo5s {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T= sc.nextInt();
	while(T-->0)
	{
		int n=sc.nextInt();
		System.out.println(new GFG().convertFive(n));
	}
}
	
}
class GFG{
	int  convertFive(int num) {
		String str = String.valueOf(num);
		String str2= "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='0')
		   str2+=str.charAt(i);
			else
				 str2+='5';
				
		}
		
		int res = Integer.parseInt(str2);
		return res;
	}
}
