package co_varient;

class Alpha {

}

class Beta extends Alpha{

}

class Vechicle {
          public Alpha run(){
                    System.out.println("alpha run");
                    return null;
          }

}

class Car extends Vechicle {
          public Beta run(){
                    System.out.println("beta run");
                    return null;

          }
}

public class CovarientDemo1 {
          public static void main(String[] args) {

                    Vechicle vechicle = new Car();
                    vechicle.run();
          }
}
