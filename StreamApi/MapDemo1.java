package StreamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
          public static void main(String[] args) {
                    List<Integer> listofnumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
                    listofnumber.stream().map(num -> num + 10).forEach(IO::println);

                    System.out.println("-----------------");
                    List<Integer> duplicatenumber = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6);
                    duplicatenumber.stream().distinct().filter(num -> {
                              return num % 2 == 0;
                    }).map(num -> num * num * num).forEach(IO::println);

          }

}
