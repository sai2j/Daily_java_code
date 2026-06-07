package predicatefunction.consumer;

import java.util.function.BiConsumer;

public class BiconsumerFunction {
          public static void main(String[] args) {
                    BiConsumer<Integer, String> updateVariable = (num, str) -> {
                              num = num * 2;
                              str = str.toUpperCase();
                              System.out.println("Update values : " + num + " , " + str);
                    };

                    int number = 15;
                    String text = "nit";
                    updateVariable.accept(number, text);
                    System.out.println("Original value : " + number + " , " + text);
          }
}
