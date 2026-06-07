package predicatefunction.supplier;

import java.util.function.Supplier;

public class SuppelierDemo1 {
          public static void main(String[] args) {
                    Supplier<String> s1 = () -> 12 + 12 + " java " + 20 + 20;
                    System.out.println(s1.get());
          }
}
