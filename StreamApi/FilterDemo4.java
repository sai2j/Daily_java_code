package StreamApi;

import java.util.Arrays;

public class FilterDemo4 {
          public static void main(String[] args) {
                    String[] names = {"scot","james","smith","sachin"};
                    Object[] array=Arrays.stream(names).filter(name-> name.length()>3).toArray();

                    IO.print(Arrays.toString(array));
          }
}
