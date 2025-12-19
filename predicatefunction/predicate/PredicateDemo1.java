package predicatefunction.predicate;

import java.util.Scanner;
import java.util.function.*;

public class PredicateDemo1 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    Predicate<Integer> p1 = age -> age >= 18;
                    System.out.print("enter your age : ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("your age is :" + p1.test(age));
                    sc.close();
          }
}
