package StreamApi;

import java.util.Arrays;

public class FilterDemo5 {
          public static void main(String[] args) {
                    int[] number = { 2, 3, 5, 6, 7, 8, 9 };
                    int[] primeNumber = Arrays.stream(number).filter(num -> FilterDemo5.isPrime(num)).toArray();
                    IO.print("Prime Numbers: " + Arrays.toString(primeNumber));
          }

          private static boolean isPrime(int num) {
                    if (num < 2) {
                              return false;
                    }
                    for (int i = 2; i < Math.sqrt(num); i++) {
                              if (num % i == 0) {
                                        return false;
                              }
                    }
                    return true;
          }
}
