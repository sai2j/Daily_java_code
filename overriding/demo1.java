package overriding;

class Animal {
          public void eat() {
                    System.out.println("generic eating");
          }
}

class Dog extends Animal {
          public void eat() {
                    System.out.println("dog is eating");
          }
}

public class demo1 {
          public static void main(String[] args) {
                    Animal animal = new Dog();
                    animal.eat();
          }

}
