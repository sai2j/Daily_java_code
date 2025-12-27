package exceptionhandling;

public class ExceptionpropagationUsingUnchecked {
          public static void main(String[] args) {
                    System.out.println("main method started");
                    try {
                              m1();
                    } catch (ArithmeticException e) {
                              System.out.println("handel by main method");
                    }
                    System.out.println("main method ended");
          }

          public static void m1() {
                    System.out.println("m1 method started");
                    m2();
                    System.out.println("m1 method ended");
          }

          public static void m2() {
                    System.out.println("m2 method started");
                    int z = 10 / 0;
                    System.out.println("m2 method ended");
          }
}
