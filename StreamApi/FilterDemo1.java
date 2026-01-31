package StreamApi;

import java.util.*;

public class FilterDemo1 {
          public static void main(String[] args) {
                    List<Integer> listofnumber = Arrays.asList(1, 3, 3, 4, 5, 6, 7, 8, 9);

                    IO.println("Without Stream Api: ");
                    List<Integer> evenList = new ArrayList<>();

                    for (Integer number : listofnumber) {
                              if (number % 2 == 0) {
                                        evenList.add(number);
                              }
                    }
                    evenList.forEach(IO::println);

                    IO.println("With Stream Api: ");
                    listofnumber.stream().filter(number->number%2==0).forEach(IO::println);

          }
}
