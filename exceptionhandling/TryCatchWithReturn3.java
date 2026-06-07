package exceptionhandling;

public class TryCatchWithReturn3 {
          public static void main(String[] args) {
                    System.out.println(returnValue());
          }

          public static int returnValue() {
                    try {
                              return 10 / 0;

                    } catch (Exception e) {
                              return 200;
                    } finally {
                              return 300;
                    }
          }
}
