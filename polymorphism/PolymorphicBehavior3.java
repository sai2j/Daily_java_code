package polymorphism;

class Animal{
          public void sleep(){
                    System.out.println("generic sleep");
          }
          

}
class Dog extends Animal{
          public void sleep(){
                    System.out.println("dog is sleeping");
          }
          public void bark(){
                    System.out.println("dog bark");
          }
}
class Lion extends Animal{
          public void sleep(){
                    System.out.println("lion is sleeping");
          }
          public void roar(){
                    System.out.println("lion roar");
          }

}
public class PolymorphicBehavior3 {
          public static void main(String[] args) {
                    Animal animal = new Dog();
                    accept(animal);
                    System.out.println("-------------------");
                    animal = new Lion();
                    accept(animal);
          }
          public static void accept(Animal animal){
                    if(animal instanceof Dog ){
                              Dog dog = (Dog) animal;
                              dog.sleep();
                              dog.bark();
                    }
                    else if(animal instanceof Lion lion){
                              lion.sleep();
                              lion.roar();
                    }

          }
}
