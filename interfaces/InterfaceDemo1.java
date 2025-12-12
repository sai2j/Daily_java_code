package interfaces;

interface Vechicle {
          public void run();
     
}

public class InterfaceDemo1 {
          public static void main(String[] args) {
                    Vechicle car = new Vechicle() {
                              public void run() {
                                        System.out.println("car running ...");
                              }

                    };
                    car.run();
                    Vechicle bike = new Vechicle() {
                              public void run() {
                                        System.out.println("bike running ...");
                              }
                    };
                    bike.run();

          }
}
