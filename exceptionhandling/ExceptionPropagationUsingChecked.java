package exceptionhandling;

class foo {
          static {
                    System.out.println("static block of foo class");
          }
}

public class ExceptionPropagationUsingChecked {
          public static void main(String[] args) {
                    System.out.println("main method started");
                    try {
                              m1();
                    } catch (ClassNotFoundException e) {
                              System.out.println("handle the exception");
                    }

          }

          public static void m1() throws ClassNotFoundException {
                    System.out.println("m1 method started");
                    m2();
                    System.out.println("m1 method ended");
          }

          public static void m2() throws ClassNotFoundException{
                    System.out.println("m2 method started");
                    Class.forName("com.ravi.exception.foo");
                    System.out.println("m2 method ended");

          }
}
