package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryInsideCatch {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    try (sc) {
                              System.out.println("Enter your rollnumber:");
                              int roll = sc.nextInt();
                              System.out.println("my Rollno is :" + roll);
                    } catch (InputMismatchException e) {
                              System.out.println("Provide valid input");
                              try {
                                        System.out.println("10/0");
                              } catch (ArithmeticException e1) {
                                        System.out.println("Divide by zero problem");
                              }
                    } finally {
                              System.out.println("finally block");
                              try {
                                        Object obj[] = new Integer[3];
                                        obj[0] = 12;
                                        obj[1] = 45;
                                        obj[2] = "34";

                              } catch (ArrayStoreException e) {
                                        System.out.println("Invalid element can store in array.");

                              }
                    }
          }
}
