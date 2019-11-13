package c1;

/**
 * <pre>
 * things to remember
 *
 * 1. When a number is present in the code it is called a literal; by default java
 * assumes you are defining an int
 *
 * long max = 3123456789; // DOES NOT COMPILE *
 * long max = 3123456789L; // Now java  knows it is a long
 *
 * if there is a point inside the literal, java assumes by default it is a double
 *
 * float f = 8.79;//Type mismatch: cannot convert from double to float *
 * double f = 8.79;//OK
 *
 * 2. primitive types hold their values in the memory where the variable is allocated
 *
 *
 * </pre>
 *
 * @author sergiogp
 */
public class VeriifyingPrimitiveTypesCapacity {

  {
    // long max = 3123456789; // The literal 3123456789 of type int is out of range
    long max = 3123456789L; // Now java knows it is a long

    // float f = 8.79;//Type mismatch: cannot convert from double to float
    double f = 8.79;// OK

    int integer_with_underscores = 1_000_000;

    //the underscores really does not represent anything,
    // it is only readable syntax
    double whatIsThis = 1_00_0.0_0;

    System.out.println("whatIsThis:" + whatIsThis);


    /*it is possible to assign integer values to bigger variables */
    int i1 = 10;
    long l1 = 10;
    float f1 = 10;
    double d1 = 10;
  }

  {
    int i = 8;
    System.out.println("byte:" + getValues(i));
    i = 16;
    System.out.println("short:" + getValues(i));
    i = 32;
    System.out.println("int:" + getValues(i));
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }

  private String getValues(int i) {
    return

        String.format(
            "length = %s bits = [-2^%s,2^%s - 1] = [-%s,%s]= %s possible values"
            , i, i - 1, i - 1, Math.pow(2, i - 1), Math.pow(2, i - 1) - 1, Math.pow(2, i)
        );


  }

  public static void main(String[] string) {
    VeriifyingPrimitiveTypesCapacity v = new VeriifyingPrimitiveTypesCapacity();

    System.out.println();
  }
}
