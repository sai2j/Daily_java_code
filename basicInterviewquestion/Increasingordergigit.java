package basicInterviewquestion;

public class Increasingordergigit {

          public static void main(String[] args) {

                    int num = 1234;
                    int prev = 10;
                    boolean increasing = true;

                    while (num > 0) {
                              int digit = num % 10;

                              if (digit >= prev) {
                                        increasing = false;
                                        break;
                              }

                              prev = digit;
                              num = num / 10;
                    }

                    if (increasing)
                              System.out.println("Increasing Order");
                    else
                              System.out.println("Not Increasing");
          }

}
