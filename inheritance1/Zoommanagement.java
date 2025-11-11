package inheritance1;

import java.util.Scanner;

class Animal{
private String name;
public Animal(String name){
this.name = name;
}
public String getName() {
          return name;
}

public String toString1() {
          return "Animal [name=" + name + "]";
}

}
class Mammal extends Animal{
private boolean hasfur;
public Mammal(boolean hasfur,String name){
          super(name);
          this.hasfur=hasfur;
}
public boolean isHasfur() {
          return hasfur;
}

public String toString2() {
          return "Mammal [getName()=" + getName() + ", getName()=" + hasfur + "]";
}

}
class Dog extends Mammal{
private String breed;
public Dog(String breed,boolean hasfur,String name){
          super(hasfur,name);
          this.breed=breed;
}
public String getBreed() {
          return breed;
}
@Override
public String toString() {
          return "Dog [breed=" + breed + ", getName()=" + getName() + ", getBreed()=" + getBreed() + "]";
}
}
public class Zoommanagement {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.err.println("enter your name");
          String name = sc.nextLine();
          System.out.println("enter true or false");
          boolean hasfur = Boolean.parseBoolean(sc.nextLine());
          System.out.println("enter your breed");
          String breed = sc.nextLine();
          Dog dog = new Dog(breed, hasfur, name);

          int choice = sc.nextInt();
          switch (choice) {
                    case 1 ->System.out.println(dog);
                    case 2 ->System.out.println(dog.toString1());
                    case 3 ->System.out.println(dog.toString2());
          }
       
        }  
}

