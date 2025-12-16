package predicatefunction.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1 {
          public static void main(String[] args) {
                    Function<String, Integer> fn1 = str -> str.length();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter city name : ");
                    var cityName = sc.nextLine();

                    System.out.println(cityName + "city lenght is :" + fn1.apply(cityName));
                    sc.close();
          }
}
