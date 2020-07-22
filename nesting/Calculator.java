package nesting;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the first number : ");
	 
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		sc.nextLine(); // in order to nuteralized the enter effect
		char operation =sc.nextLine().charAt(0); //extraction the very first element of the string
		
		
		switch(operation)
		{
		case '+':
			System.out.println((a+b));
			break;
		case '-' :
			System.out.println((a-b));
			break;
		case '*' :
			System.out.println((a*b));
			break;
		case '/':
			System.out.println((a/b));
			break;
		case '%':
		System.out.println((a%b));
		break;
		default:
			System.out.println("invalid operation");
		}
		
	}

}
