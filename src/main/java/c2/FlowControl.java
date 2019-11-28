package c2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlowControl {

  public static void main(String[] args) {
    labelInForLoop();
    labelInIfStatement();
  }

  public static void labelInForLoop() {
    FIRST_CHAR_LOOP:
    for (int a = 1; a <= 4; a++) {
      for (char x = 'a'; x <= 'c'; x++) {
        if (a == 2 || x == 'b') {
          continue FIRST_CHAR_LOOP;
        }
        System.out.print(" " + a + x);
      }
    }
  }


  public static void labelInIfStatement() {
    List<String> myList = new ArrayList<>();
    myList.add("a");
    myList.add("b");
    myList.add("c");
    myList.add("e");
    Iterator<String> iterator = myList.iterator();
    MY_LABEL_FOR_IF_STATEMENT:
    if (iterator.hasNext()) {
      System.out.println("here");
      do {
        String myChar = iterator.next();
        System.out.println(myChar);
        if ("c".equals(myChar)) {
          break MY_LABEL_FOR_IF_STATEMENT;
        }
      } while (true);
    }
    System.out.println(iterator.hasNext());


     iterator = myList.iterator();
    MY_LABEL_FOR_IF_STATEMENT:
    if (iterator.hasNext()) {
      System.out.println("here");
      do {
        String myChar = iterator.next();
        System.out.println(myChar);
        if ("c".equals(myChar)) {
          return;// MY_LABEL_FOR_IF_STATEMENT;
        }
      } while (true);
    }
    //this time the System.out is not executed, as the return statement will go out from the method
    System.out.println(iterator.hasNext());
  }
}
