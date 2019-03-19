package c2;

/**
 * Things to remeber
 * <p>
 * 1. Increment and Decrement Operators have the highest order of precedence
 */
public class WorkingWithUnaryArithmeticOperators {
    /**
     * <pre>
     *
     *
     * Java unary operators
     * Unary operator   Description
     *
     * +                Indicates a number is positive, although numbers are assume to be positive in Java unless
     *                  accompanied by a negative unary operator
     * -                Indicates a literal number is negative or negates an expression
     * ++               Increments a value by 1
     * --               Decrements a value by 1
     * !                Inverts a Boolean’s logical value
     * </pre>
     */


    public static void assignmentOperators() {
    }

    public static void unaryOperators() {
        int x = 3;

        /*java will solve all operand from left to right and then will operate them */
        int y = ++x * 5 / x-- + --x;

        System.out.println(y);
    }

}
