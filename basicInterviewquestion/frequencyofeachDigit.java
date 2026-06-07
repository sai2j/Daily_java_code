package basicInterviewquestion;

public class frequencyofeachDigit {
          public static void main(String[] args) {

                    int num = 112233;

                    for (int i = 0; i <= 9; i++) {
                              int count = 0;
                              int temp = num;

                              while (temp > 0) {
                                        int digit = temp % 10;

                                        if (digit == i)
                                                  count++;

                                        temp = temp / 10;
                              }

                              if (count > 0)
                                        System.out.println(i + " = " + count);
                    }
          }
}
