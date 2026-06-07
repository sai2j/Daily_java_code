package vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo5 {
          public static void main(String[] args) {
                    Vector<String> listofcity = new Vector<>();
                    listofcity.add("surat");
                    listofcity.add("pune");
                    listofcity.add("bharuch");

                    Collections.sort(listofcity);
                    listofcity.forEach(System.out::println);

                    Vector<Integer> listofnumber = new Vector<>();
                    listofnumber.add(100);
                    listofnumber.add(500);
                    listofnumber.add(300);
                    listofnumber.add(200);

                    Collections.sort(listofnumber);
                    listofnumber.forEach(System.out::println);

                    Collections.sort(listofnumber, (i1, i2) -> Integer.compare(i2, i1));
                    System.out.println(listofnumber);

                    Vector<String> listoffruit = new Vector<>();
                    listoffruit.add("orange");
                    listoffruit.add(("banana"));
                    Object[] fruit = listoffruit.toArray();
                    System.out.println(Arrays.toString(fruit));

          }
}