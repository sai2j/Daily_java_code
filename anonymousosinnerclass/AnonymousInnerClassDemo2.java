package anonymousosinnerclass;

abstract class Vechicle {
          public abstract void run();
}

public class AnonymousInnerClassDemo2 {
          public static void main(String[] args) {
                    Vechicle car = new Vechicle() {
                              public void run() {
                                        System.out.println("vechicle run ...");
                              }
                    };
                    car.run();
                    Vechicle bike = new Vechicle() {
                              public void run() {
                                        System.out.println("bike running ...");
                              }
                    };
                    bike.run();
                    new Vechicle() {
                              public void run() {
                                        System.out.println("bus running ...");
                              }
                    }.run();
          }
}
