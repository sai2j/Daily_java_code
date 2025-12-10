package abastract;

abstract class Alpha{
          public abstract void show();
          public abstract void demo();

}
abstract class Beta extends Alpha{
          public void show(){
                    System.out.println("show method");
          }

}
class Gamma extends Beta{

         public void demo(){
System.out.println("demo method");
         } 
}

public class AbstractDemo3 {
          public static void main(String[] args) {
                    Gamma gamma = new Gamma();
                    gamma.demo();
                    gamma.show();
          }
          
}
