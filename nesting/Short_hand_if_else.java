package nesting;

public class Short_hand_if_else {
	public static void main(String[] args)
	{
		int a=3,b=7,c=9;
		int s=(a>b)?((a<b)?b:a):((b>c)?b:c);
		System.out.println(s);
	}

}
