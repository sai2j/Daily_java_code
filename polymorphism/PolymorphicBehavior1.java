package polymorphism;

class Animal {
          public void sleep() {
                    System.out.println("generic sleep");

          }
}

class Dog extends Animal {
          public void sleep() {
                    System.out.println("dog sleep");
          }

}

class Lion extends Animal {
          public void sleep() {
                    System.out.println("lion sleep");
          }
}

public class PolymorphicBehavior1 {
          public static void main(String[] args) {
                    Animal a1;
                    a1 = new Dog();
                    a1 = new Lion();
                    exicuteanimal(a1);
          }

          public static void exicuteanimal(Animal animal) {
                    animal.sleep();
          }

}
