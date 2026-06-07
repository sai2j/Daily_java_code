package basicInterviewquestion;

public class smallAndLargeDigit {
      public static void main(String[] args) {

        int num = 5274;
        int small = 9, large = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit < small) small = digit;
            if (digit > large) large = digit;

            num = num / 10;
        }

        System.out.println("Smallest = " + small);
        System.out.println("Largest = " + large);
    }     
}
