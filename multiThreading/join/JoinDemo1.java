package multiThreading.join;

class Join extends Thread {
          public void run() {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " Thread started");

                    for (int i = 1; i <= 5; i++) {
                              System.out.println(i + " by " + name + " thread ");

                              try {
                                        Thread.sleep(1000);
                              } catch (InterruptedException e) {

                              }
                    }
                    System.out.println(name+" thread commpleted!!!");
          }
}

public class JoinDemo1 {

          public static void main(String[] args) throws InterruptedException {
                    System.out.println("main thread started");
                    Join j1 = new Join();
                    Join j2 = new Join();
                    Join j3 = new Join();

                    j1.setName("j1");
                    j2.setName("j2");
                    j3.setName("j3");

                    j1.start();
                    j1.join();
                    IO.print("main thread walk up");
                    j2.start();
                    j3.start();

                    System.out.println("main thread ended");

          }

}
