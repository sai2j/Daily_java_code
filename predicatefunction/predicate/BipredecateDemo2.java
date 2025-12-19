package predicatefunction.predicate;

import java.util.function.*;

public class BipredecateDemo2 {
          public static void main(String[] args) {
                    BiPredicate<Integer, Integer> isSum = (a, b) -> (a + b) % 2 == 0;
                    System.out.println(isSum.test(100, 200));
                    System.out.println(isSum.test(300, 50));

          }
}
