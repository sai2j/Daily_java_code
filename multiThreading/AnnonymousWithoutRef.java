package multiThreading;

public class AnnonymousWithoutRef {
          public static void main(String[] args) {

                    new Thread() {
                              public void run() {
                                        String name = IO.readln();
                                        System.out.println("Running thread name is: " + name);
                              }

                    }.start();

          }
}
