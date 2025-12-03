package overriding;

class Shape {
          public void draw() {
                    System.out.print("generic draw");
          }
}

class Square extends Shape {
          @Override
          public void draw() {
                    System.out.println("square draw");
          }

}

public class Annotation {
          public static void main(String[] args) {
                    Shape shape = new Square();
                    shape.draw();
          }
}
