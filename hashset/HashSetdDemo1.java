package hashset;

import java.util.*;

public class HashSetdDemo1 {
          public static void main(String[] args) {
                    Set<Integer> set = new HashSet<>();
                    set.add(67);
                    set.add(89);
                    set.add(60);

                    set.forEach(num -> System.out.println(num));
          }
}
