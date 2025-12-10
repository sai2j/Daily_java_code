package abastract;

abstract class Vechicle {
          protected String name;

          public Vechicle(String name) {
                    super();
                    this.name = name;
          }

          public abstract void run();
}

class Bike extends Vechicle {
          public Bike(String name) {
                    super(name);

          }

          public void run() {
                    System.out.println("bike is running");
          }

          public String getBikeName() {
                    return this.name;

          }
}

public class AbstractDemo2 {
          public static void main(String[] args) {
                    Vechicle vechicle = new Bike("ktm");
                    Bike bike = (Bike) vechicle;
                    System.out.println(bike.getBikeName());
                    vechicle.run();
          }
}
