package abastract;

abstract class Animal {
          public abstract void checkup();
}

class Dog extends Animal {
          public void checkup() {
                    System.out.println("dog checkup");
          }
}

class Lion extends Animal {
          public void checkup() {
                    System.out.println("Lion checkup");
          }
}

class Tiger extends Animal {
          public void checkup() {
                    System.out.println("Tiger checkup");
          }
}

class Monkey extends Animal {
          public void checkup() {
                    System.out.println("monkey checkup");
          }
}

class Bird extends Animal {
          public void checkup() {
                    System.out.println("Bird checkup");
          }
}

public class AbstractDemo4 {
          public static void main(String[] args) {
                    Lion lion[] = {new Lion(),new Lion(),new Lion()};
                    
                    Bird birds[] = new Bird[2];
                    birds[0]=new Bird();
                    birds[1]= new Bird();

                    Dog dog[] =new Dog[] {new Dog(),new Dog(),new Dog()};

                    Monkey monkey = new Monkey();
                    Tiger tiger= new Tiger();
                    Animalcheckup(monkey,tiger);
          }
          public static void Animalcheckup(Animal ...animals){
                    for(Animal animal:animals){
                              animal.checkup();
                    }
          }
}
