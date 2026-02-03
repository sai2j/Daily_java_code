package StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo6 {
          public static void main(String[] args) {

                    /*List<String> fruit = Arrays.asList("Apple", "Banana", "Cherry");
                     * fruit.stream().filter(fruits -> {
                     * IO.print("Filter" + fruit);
                     * return fruits.startsWith("A");
                     * });
                     */
                    System.out.println("--------------------------------------------");
                    List<String> fruit = Arrays.asList("Apple", "Banana", "Cherry");
                    fruit.stream().filter(fruits -> {
                              IO.print("Filtering: " + fruit);
                              return fruits.startsWith("A");
                    }).forEach(IO::print);

          }
}
