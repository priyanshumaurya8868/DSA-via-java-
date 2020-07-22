package scanerIntro;
import java.util.Scanner;
public class SimpleInterestCal {

	public static void main(String[] args) {
		
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the principal :");
  int principal=sc.nextInt();
  System.out.println("Enter the rate :");
  float rate=sc.nextFloat();
  System.out.println("Enter the time :");
  int time=sc.nextInt();
 float sI =(principal*time*rate) / 100; 
  System.out.println("Simple Interest :"+sI);
  
	}

}
