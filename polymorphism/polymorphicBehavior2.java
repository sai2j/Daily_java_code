package polymorphism;

class Animal {
          public void sleep() {
                    System.out.println("generic sleep");
          }
}

class Dog extends Animal {
          public void sleep() {
                    System.out.println("Dog is sleeping");
          }

}

class Lion extends Animal {
          public void sleep() {
                    System.out.println("Lion is sleeping");
          }

}

public class polymorphicBehavior2 {
          public static void main(String[] args) {
                    Animal animal = new Dog();
                    accept(animal);
          }

          public static void accept(Animal animal) {
                    Dog dog = (Dog) animal;
                    dog.sleep();
          }

}
