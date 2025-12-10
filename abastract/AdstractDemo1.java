package abastract;

abstract class Shape {
          public abstract void draw();
}

class Square extends Shape {
          public void draw() {
                    System.out.println("Square shape");
          }
}

class Rectangle extends Shape {
          public void draw() {
                    System.out.println("rectangle shape");
          }
}

public class AdstractDemo1 {
          public static void main(String[] args) {
                    Shape shape = new Square();
                    Shape shape2 = new Rectangle();
                    shape.draw();
                    shape2.draw();

          }
}
