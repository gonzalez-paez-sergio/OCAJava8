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

    int x = 1;
    long y = 33;

    // data type result is long
    long result = x + y;

    double d = 2.3;
    float f = 3.4F;

    // result is float, observe the F at the end of the f's value, remember all the floating point
    // literals are always asumed to be double
    double result1 = d + f;
  }
}
