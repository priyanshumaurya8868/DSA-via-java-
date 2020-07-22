package scanerIntro;
import java.util.Scanner;
public class ScanerBasics {

	public static void main(String[] args) {
		//creating an object so that we can access all the functions of the call named  scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your key :");
		int x=sc.nextInt();
	
		System.out.println("The key that you have entered : "+x);
		
	
	}

}
