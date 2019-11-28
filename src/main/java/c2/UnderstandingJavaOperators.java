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
 * 3. Overflow is when a number is so large that it will no longer fit  within the data type, so the
 * system "wraps around" to the next lowest value and counts up from there. There’s also an
 * analogous underflow, when the number is too low to fit in  the data type.
 *
 * 4. when using the assignment operator, the result of the assignment is an expression in and of
 * itself, equal to the value of the assignment
 *
 * 5. For object comparison the equality operator is applied to references to the objects, not the objects they point to
 * </pre>
 */
public class UnderstandingJavaOperators {

  public static void main(String[] s) {
    castingPrimitives();
    assignmentAndCompoundOperators();
    relationalOperators();
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

    int x = 4;
    long y = 9;
//    int z = x * y;//this does not compile as the result is a long

    x *= 9;//this compiles, as the compound operator automatically casts the result

  }

  public static void assignmentAndCompoundOperators() {
    int x = 0;
    int y = (x = 4); //this will assign the value 4 to x and to y
    System.out.println(y);
    y = (x += 4); //the compound assignment operator has the same behaviour
    System.out.println(y);
  }


  public static void relationalOperators() {
    int x = 10, y = 20, z = 10;
    System.out.println(x < y); // Outputs true
    System.out.println(x <= y); // Outputs true
    System.out.println(x >= z); // Outputs true
    System.out.println(x > z); // Outputs false

    Integer x1 = 1;
    Double y1 = 1d;
    System.out.println(y1 < x1);

    System.out.println(x1);
  }
}
