package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
          public InvalidAgeException() {
          }

          public InvalidAgeException(String errorMessage) {
                    super(errorMessage);
          }
}

public class CustomerCheckedException {
          public static void main(String[] args) {
                    try {
                              System.out.print("enter your age :");
                              Scanner sc = new Scanner(System.in);
                              int age = sc.nextInt();
                              validAge(age);
                              sc.close();
                    } catch (InvalidAgeException e) {
                              System.out.println(e.getMessage());
                              System.out.println(e);
                              e.printStackTrace();
                    }
          }

          public static void validAge(int age) throws InvalidAgeException {
                    if (age < 18) {
                              throw new InvalidAgeException("age greater then 18");
                    } else {
                              System.out.println("you can go for a movie");
                    }

          }
}
