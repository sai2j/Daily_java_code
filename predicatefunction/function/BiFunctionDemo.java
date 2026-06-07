package predicatefunction.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
          public static void main(String[] args) {
                    BiFunction<String, String, String> concatenateString = (Str1, Str2) -> Str1 + Str2;
                    String result = concatenateString.apply("hello", "java");
                    System.out.println(result);

                    BiFunction<String, String, Integer> calculateLength = (Str1, Str2) -> Str1.length() + Str2.length();
                    Integer result1 = calculateLength.apply("result", "java");
                    System.out.println(result1);
          }
}
