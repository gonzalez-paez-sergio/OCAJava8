package c1;

/**
 * 1. Fields and instance initializer blocks ( static code blocks) are run in the order in which
 * they appear in the file
 *
 * <p>1.5 A class can have more than 1 static code block
 *
 * <p>2. The constructor runs after all fields and instance initializer blocks have run
 *
 * @author sergiogp
 */
public class InitializationStaticBlockNVariables {

  private String name = "Fluffy";

  {
    System.out.println("first static block");
  }

  public InitializationStaticBlockNVariables() {
    name = "Tiny";
    System.out.println("setting constructor");
  }

  {
    System.out.println("second static block");
  }

  public static void main(String[] args) {
    InitializationStaticBlockNVariables chick = new InitializationStaticBlockNVariables();
    System.out.println(chick.name);
  }
}
