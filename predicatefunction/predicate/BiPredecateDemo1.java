package predicatefunction.predicate;

import java.util.function.*;

public class BiPredecateDemo1 {
          public static void main(String[] args) {
                    BiPredicate<String, Integer> filter = (x, y) -> {
                              return x.length() == y;
                    };
                    Boolean result = filter.test("ravi", 4);
                    System.out.println(result);

                    result = filter.test("hydrebad", 10);
                    System.out.println(result);

          }
}
