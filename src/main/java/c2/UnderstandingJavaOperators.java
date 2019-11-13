package c2;

/**
 * <pre>
 * Things to remember
 *
 * 1. Unless overridden with parenthesis, Java operator follow order of operation by decreasing
 * order of precedence. if 2 operators have the same level of precedence then java guarantee left to
 * right evaluation
 *
 * 2. Casting primitives is required anytime you go from a larger numerical data type into  a
 * smaller one
 *
 *
 * 3. Overflow is when a number is so large that it will no longer fit  within the data type, so the
 * system "wraps around" to the next lowest value and counts up from there. There’s also an
 * analogous underflow, when the number is too low to fit in  the data type.
 * </pre>
 */
public class UnderstandingJavaOperators {

  public static void main(String[] s) {
    castingPrimitives();
  }

  private static int y;

  {
    y = 4;
    /* all the elements are already int, so there is not promotion
     * the last step is the promotion of 9 to double 9.0
     */
    double x = 3 + 2 * y--;

    System.out.println(y + "-" + x);

  }

  public static void doubleExpression() {
    int expression = 0;
    /**
     * this is the error when we try to use the two operands on the same value
     * src/c2/UnderstandingJavaOperators.java:20: error: unexpected type
     * --expression++; ^ required: variable found: value 1 error
     */
    //(--expression)++;
  }

  public static void castingPrimitives() {
    int i1 = 10;//OK
//  	int i2 = 1.0;//NOOK (incompatible types, Required: int, found: double)
    int i2 = (int) 1.0;//OK

    short s1 = 32767;//OK
//		short s2 = 32768;//NOOK , this number is out of range for short
    short s3 = (short) 32768;//OK , but the value assigned will be  -32768 (overflow)
    short s4 = (short) 32769;//OK , but the value assigned will be  -32767 (overflow)
		
    short s5 = (short) -32768;//OK
    short s6 = (short) -32769;//OK , but the value assigned will be  32767 (underflow )

    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
  }
}
