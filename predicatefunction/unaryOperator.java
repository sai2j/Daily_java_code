package predicatefunction;

import java.util.function.UnaryOperator;

public class unaryOperator {
          public static void main(String[] args) {
                    UnaryOperator<Integer> square = x -> x * x;
                    System.out.println(square.apply(5));

                    UnaryOperator<String> concate = str -> str.concat("base");
                    System.out.println(concate.apply("Date"));
          }
}
