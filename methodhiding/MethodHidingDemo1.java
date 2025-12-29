package methodhiding;

class Bird {
          protected static double heigth = 2.2;

          public static void fly() {
                    System.out.println("Bird fly");
          }
}

class Parrot extends Bird {
          protected static double heigth = 1.2;

          public static void fly() {
                    System.out.println("Parrot fly");
          }
}

class Sparrow extends Bird {
          protected static double heigth = 1.0;

          public static void fly() {
                    System.out.println("Sparrow fly");
          }

}

public class MethodHidingDemo1 {
          public static void main(String[] args) {
                    Bird bird = new Sparrow();
                    System.out.println( "height is : " + bird.heigth);
                    bird.fly();

          }

}
