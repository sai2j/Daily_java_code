package predicatefunction.predicate;

import java.util.Scanner;
import java.util.function.*;

public class PredicateDemo2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Predicate<String> p3 = name -> name.equals("ravi");
                    System.out.println("check string equal or not :" + p3.test("ravi"));
                    sc.close();
                    
          }
}
