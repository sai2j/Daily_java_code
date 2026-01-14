package vector;

import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;

public class VectorDemo2 {
          public static void main(String[] args) {
                    Vector<Integer> v = new Vector<>();
                    int x[] = { 22, 10, 20, 40, 15, 50 };
                    for (int i = 0; i < x.length; i++) {
                              v.add(x[i]);
                    }
                    v.sort((i1, i2) -> i2 - i1);
                    System.out.println("max value is :" + Collections.max(v));
                    System.out.println("min value is :" + Collections.min(v));
                    v.forEach(y -> System.out.println(y));

                    Collections.reverse(v);
                    System.out.println("after reverse");
                    v.forEach(y -> System.out.println(y));

                    Object[] array = v.toArray();
                    System.out.println(Arrays.toString(array));

          }
}
