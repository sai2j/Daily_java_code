package has_a_relation;

import java.util.Scanner;

class Engine {
          private String type;
          private int horsepower;

          public Engine(String type, int horsepower) {
                    this.type = type;
                    this.horsepower = horsepower;
          }

          public String toString() {
                    return "[Type: " + type + ",Horsepower: " + horsepower + "]";
          }
}

class Car {
          private String name;
          private int model;
          private Engine engine; // has-a relation

          public Car(String name, int model) {
                    super();
                    this.name = name;
                    this.model = model;
                    this.engine = new Engine("petrole", 1200);
          }

          public String toString() {
                    return "Name: " + name + ",Model: " + model + ",Engine: " + engine + "";
          }

}

public class Compositon {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter car name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter car model: ");
                    int model = Integer.parseInt(sc.nextLine());

                    Car car = new Car(name, model);
                    System.out.println(car);

                    sc.close();
          }
}
