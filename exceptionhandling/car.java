package exceptionhandling;

public class car {
          public static void main(String[] args) throws Exception {
                    CarTest.stop("stop");
                    CarTest.stop("go");
                    CarTest.puncture("move");
                    CarTest.puncture("move");
                    CarTest.heat("60");
                    CarTest.heat("40");

          }
}

class CarStopped extends Exception {
          public CarStopped(String stop) {

          }
}

class CarPuncture extends Exception {
          public CarPuncture(String puncture) {

          }

}

class CarHeat extends Exception {
          public CarHeat(String heat) {

          }

}

class CarTest {
          public static void stop(String stop) throws Exception {
                    if (stop.equalsIgnoreCase(stop)) {
                              try {
                                        throw new CarStopped(stop);
                              } catch (CarStopped e) {
                                        System.out.println("car stop fro sum reason");
                              }
                    } else {
                              System.out.println("car is stollen");
                    }
          }

          public static void puncture(String puncture) {

                    if (puncture.equalsIgnoreCase(puncture)) {
                              try {
                                        throw new CarPuncture("puncture");
                              } catch (CarPuncture e) {
                                        System.out.print("car is punctured");
                              }
                    } else {
                              System.out.println("car not puncture");

                    }
          }

          public static void heat(String heat) {
                    if (heat.equalsIgnoreCase("heat")) {
                              try {
                                        throw new CarHeat("heat");
                              } catch (CarHeat e) {
                                        System.out.println("car is heated more then 50 degree cels");
                              }

                    } else {
                              System.out.println("car termperature normal");
                    }
          }

}
