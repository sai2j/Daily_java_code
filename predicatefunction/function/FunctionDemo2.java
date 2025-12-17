package predicatefunction.function;

import java.util.function.Function;
import java.util.Scanner;

public class FunctionDemo2 {
          public static void main(String[] args) {
                    Function<String, Boolean> fn2 = str -> str.startsWith("R");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter your name :");
                    String name = sc.nextLine();
                    System.out.println("IS " + name + " starts with character 'R' : " + fn2.apply(name));
                    sc.close();
          }
}
