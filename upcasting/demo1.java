package upcasting;

class animal {
          public void eat() {
                    System.out.println("animal is eating");
          }
}

class dog extends animal {
          public void eat() {
                    System.out.println("dog is eating");
          }

}

public class demo1 {
          public static void main(String[] args) {
                    animal a1 = new dog(); // upcasting
                    a1.eat();


          }
}
