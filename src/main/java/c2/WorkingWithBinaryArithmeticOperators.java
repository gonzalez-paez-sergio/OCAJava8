package c2;

public class WorkingWithBinaryArithmeticOperators {

  /**
   * 1. if two values have different data types, Java will automatically promote one of the values
   * to the larger of the two data types
   *
   * <p>2. If one of the values is integral and the other is floating point, java will automatically
   * promote the integral value to to the floating point value's data tye
   *
   * <p>3. Smaller data types, namely byte, short and char are first promoted to int any time they
   * are used with a java binary arithmetic operator, even if neiter of the operands is int.
   *
   * <p>4. After all promotions has occurred and the operandos have the same data type, the
   * resulting value will have the same data type as its promoted operands
   */
  private void numericPromotions() {

    /* first case */
    int x = 1;
    long y = 33;

    /* data type result is long */
    long result = x + y;

    /*second case*/
    double d = 2.3;
    float f = 3.4F;

    /* result is float, observe the F at the end of the f's value, remember all the floating point
    literals are always asumed to be double*/
    double result1 = d + f;

    /*third case*/
    short xx = 34;
    short yy = 4;

    /* the result is an int
     *
     * both values are casted to int before operating
     *
     * the result ifself of the / operator is an int, it is the floor of the actual the actual result of the division
     */
    int result3 = xx / yy;

    /*4 case*/
    short a = 14;
    float b = 13;
    double c = 30;

    /*the result is double
     *
     * 1. a is casted to int before using it
     *
     * 2. a is casted again to float to be operated with another float
     *
     * 3. the result of  a * b is promoted to a double in order to be operated with c, the result will be double
     */
    double result4 = a * b / c;
  }
}
