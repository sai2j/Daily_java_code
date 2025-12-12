package interfaces;

sealed interface Moveable {
          int speed = 100;

          void move();
}

non-sealed class Car implements Moveable {
          public void move() {
                    int speed = 120;
                    System.out.println("speed of the car is " + speed);
          }

}

public class InterfaceDemo2 {
          public static void main(String[] args) {
                    Moveable m = new Car();
                    m.move();
                    System.out.println("speed is " + Moveable.speed);
          }

}
