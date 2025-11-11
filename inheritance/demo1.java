package inheritance;

class Parents{
          public Parents(){
                    System.out.println("parents class constructor");
          }
}
class Child extends Parents{
          public Child(){
                    System.out.println("child class constructor");
          }

} 

public class demo1 {
          public static void main(String[] args) {
                    Child child = new Child();
                    System.out.println(child);
          }
          
}
