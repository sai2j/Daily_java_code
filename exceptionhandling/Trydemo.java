package exceptionhandling;

import java.util.Scanner;

public class Trydemo {
          public static void main(String[] args) {
                    try {
                              Scanner sc = new Scanner(System.in);
                              System.out.print("Enter the value of x :");
                              int x = Integer.parseInt(sc.nextLine());
                              System.out.print("Enter the value of y :");
                              int y = Integer.parseInt(sc.nextLine());
                              int result = x / y;
                              System.out.print("The result is: " + result);

                    } catch (Exception e) {
                              System.out.println("Inside catch block");
                              System.out.println(e);

                    }
          }
}
