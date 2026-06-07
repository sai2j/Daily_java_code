package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo3 {
          public static void main(String[] args) {
                    Boolean value[] = new Boolean[6];

                    HashSet<Object> hs = new HashSet<>();
                    value[0] = hs.add(12);
                    value[1] = hs.add(12);
                    value[2] = hs.add("java");
                    value[3] = hs.add(new String("java"));
                    value[4] = hs.add(new StringBuffer("java"));
                    System.out.println(Arrays.toString(value));

                    IO.println("hashset Element");
                    hs.forEach(System.out::println);

          }
}
