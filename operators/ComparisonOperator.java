package operators;

public class ComparisonOperator {
	// also know as relation operator
	
//the always gonna return boolean value (i.e either true or false)
	public static void main(String[] args) {
		
/*
 * Operator	Description	Example
== (equal to)	Checks if the values of two operands are equal or not, if yes then condition becomes true.	(A == B) is not true.
!= (not equal to)	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	(A != B) is true.
> (greater than)	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	(A > B) is not true.
< (less than)	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.	(A < B) is true.
>= (greater than or equal to)	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.	(A >= B) is not true.
<= (less than or equal to)	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
 */
		int a=6;
		int b=8;
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a==b);
		//reversing the decision by 'NOT' operator
		System.out.println(!(a!=b));
		
	}

}
