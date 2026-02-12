package multiThreading;

public class AnnonymousWithRef {
          void main() {
                    Thread t1 = new Thread() {

                              public void run() {
                                        String name = Thread.currentThread().getName();
                                        IO.println("Running thread name is : " + name);

                              }
                    };
                    t1.start();

          }
}