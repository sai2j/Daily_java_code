package lambda;
interface vechicle{
          void run();
}

public class LambdaDemo1 {
          public static void main(String[] args) {
                    vechicle car = ()-> System.out.println("car is running");
                    car.run();
                    vechicle bike =()-> System.out.println("bike is running");
                    bike.run();
          }
}
