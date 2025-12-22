package predicatefunction.predicate;

import java.util.Scanner;
import java.util.function.*;

public class PredicateDemo3 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Predicate<String> p3 = name -> name.toLowerCase().startsWith("p");
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    System.out.println("" + p3.test(name));
                    sc.close();
          }
}
