package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
          public InvalidAgeException() {

          }

          public InvalidAgeException(String message) {
                    super(message);
          }
}

public class customCheckedException {
          public static void main(String[] args) {
                    try {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter your age:");
                              int age = Integer.parseInt(sc.nextLine());
                              validateaAge(age);

                    } catch (InvalidAgeException e) {
                              System.out.println(e);
                              System.out.println(e.getMessage());
                              e.printStackTrace();
                    }

          }

          public static void validateaAge(int age) throws InvalidAgeException {
                    if (age < 18) {
                              throw new InvalidAgeException();
                    } else {
                              System.out.println("you can go for a movie");
                    }
          }
}
