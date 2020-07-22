package oops;
class dog
{
	int legs;
}

public class MethodIntroAndOverloading {
	
	/* here, default arrgument is supported which was in c++ as, we cant use this 
	 * 	Static void sum(int ,int ,int=0)
	 */
	static void  sum(int a,int b)
	{
		System.out.print("sum of "+a+" & "+b+" = ");
		System.out.println(a+b);//after "" + becomes a String concatenation operator
	}
	static void  sum(int a,int b,int c)//here u need to use static keyword for to be called by static main()
	{
		System.out.print("sum of "+a+" "+c+" & "+b+" = ");
		System.out.println(a+b+c);//after "" + becomes a String concatenation operator
	}
public static void main(String[] args)
{
	sum(5,6);
	System.out.println();
	sum(7,9,4);
	dog d1 =new dog();
	dog d2 = new dog();
	/****************************************************************************************************************************************/
	/* java is call by value language always
	 * in case when we pass an object/non-primitive data type so the compiler create as copy of the reference 
	 * of it pass pass that copy for the parameter of the method and then
	 * that parameter will also point to the same memory location
	 */
	d1.legs =3;
	d2.legs=5;
	System.out.println("\n\n\t\tEarlier : ");
	System.out.print ("dog 1 legs : "+d1.legs);
	System.out.println(" dog 2 legs : "+d2.legs);
	//passing non-primitive data type 
	swap(d1,d2);
	System.out.println("\t\tLater :");
	System.out.print ("dog 1 legs : "+d1.legs);
	System.out.println(" dog 2 legs : "+d2.legs);
	//no change because wee just have exchange the reference between the objects intside the function which doesn't affect the our program   
	// but as our compiler is passing the copy of reference  of the objects to the function parameter so through them we can some changes  as inthe below func call
	//google
	mutation(d1);
	System.out.println("\n\nmutated d1 has legs : "+d1.legs);
}
static void swap(dog d1,dog d2)
{
	dog temp =d1;
	d1=d2;
	d2=temp;
}
static void mutation(dog d)
{
	d.legs=6;
}

}
 
