package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
          public static void main(String[] args) {
                    try {
                              String str = "java";
                              Integer val = Integer.valueOf(str);
                              System.out.println(val);
                    } catch (NumberFormatException e) {
                              System.out.println("number is not a proper formate");
                    }

                    try {
                              Object obj[] = new Integer[3];
                              obj[0] = 100;
                              obj[1] = 200;
                              obj[2] = true;
                    } catch (ArrayStoreException e) {
                              System.out.println("Inserting illegal deal in the array");
                    }

                    try {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter your age");
                              int age = Integer.parseInt(sc.nextLine());
                              System.out.println("your age is :" + age);
                              sc.close();
                    } catch (InputMismatchException e) {
                              System.out.println("Input data is not a valid formate");
                    }
          }
}
