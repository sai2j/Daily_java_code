package exceptionhandling;

public class TryCatchWithReturn {
          public static void main(String[] args) {
                    System.out.println(returnValue());
          }

          public static int returnValue() {
                    try {
                              int x = 10 / 0;
                              return 100;
                    } catch (Exception e) {
                              return 200;
                    }
          }
}
