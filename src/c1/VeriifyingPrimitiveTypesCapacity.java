package c1;

/**
 * 
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
 *
 *
 * Definition of primitive types 
 * byte = 8 bits = [-2^7,2^7) = [-128,128) = 2^8 possible values
 * int = 32 bits = [2^31,2^31) = 2^32 possible values
 * 
 * 
 * </pre>
 * 
 * @author sergiogp
 *
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
	}

	{
		int i = 8;
		System.out.println("byte = " + i + " bits = [-2^" + (i - 1) + ",2^" + (i - 1) + ") = [-"

				+ Math.pow(2, (i - 1)) + "," + Math.pow(2, (i - 1)) + ") = " +

				Math.pow(2, (i)) + " possible values \n");

		i = 16;
		System.out.println("short = " + i + " bits = [-2^" + (i - 1) + ",2^" + (i - 1) + ") = [-"

				+ Math.pow(2, (i - 1)) + "," + Math.pow(2, (i - 1)) + ") = " +

				Math.pow(2, (i)) + " possible values \n");
		i = 32;
		System.out.println("int = " + i + " bits = [-2^" + (i - 1) + ",2^" + (i - 1) + ") = [-"

				+ Math.pow(2, (i - 1)) + "," + Math.pow(2, (i - 1)) + ") = " +

				Math.pow(2, (i)) + " possible values \n");

	}

	public static void main(String[] string) {
		VeriifyingPrimitiveTypesCapacity v = new VeriifyingPrimitiveTypesCapacity();

		System.out.println();
	}
}
