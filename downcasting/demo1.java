package downcasting;

class Animal{
          public void eat(){
                    System.out.println("animal is eating");
          }
          
}
class Dog extends Animal{
          public void dog(){
                    System.out.println("dog is eating");
          }
          public void bark(){
                    System.out.println("dog is barking");
          }
}
public class demo1 {
          public static void main(String[] args) {
                    
                    Animal animal = new Dog();
                    Dog dog = (Dog)animal;
                    dog.bark();
                    dog.eat();
          }


}
