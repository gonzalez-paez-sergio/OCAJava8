package c2;


/**
 * Things to remember
 * 
 * Unless overriden with parenthesis, Java operator follow order of operation 
 * by decreasing order of precedence. 
 * if 2 operators have the same level of precedence then java guarantee left 
 * to right evaluation 
 * 
 * 
 *
*/
public class UnderstandingJavaOperators {

	{
		int y = 4;
		/*
		 * the last step is the upcast of 9 to double 9.0		
		 */
		double x = 3 + 2 * --y;

		System.out.println(y + "-" + x);
	}	

	public static void main (String [] string ) {

		int expression = 10;

		/**
		 * this is the error when we try to use the two operands on the same value
		 * src/c2/UnderstandingJavaOperators.java:20: error: unexpected type
		 * 		--expression++;
		 * 			    ^
		 *   required: variable
		 *   found:    value
		 * 1 error
 		 */
		//(--expression)++;
	
		UnderstandingJavaOperators u = new UnderstandingJavaOperators();
	}
	
}
