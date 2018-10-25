package c2;


import org.junit.Test;

public class UnderstandingJavaOperatorsTest {

    @Test
    public void testConstructor() {
        System.out.println("constructor");
        new UnderstandingJavaOperators();
    }

    @Test
    public void getY() {
        System.out.println("gere");
        UnderstandingJavaOperators.getY();
    }

    @Test
    public void setY() {

        UnderstandingJavaOperators.setY(2);
    }

    @Test
    public void doubleExpression() {
    }
}