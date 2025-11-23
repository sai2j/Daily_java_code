package basic;

public class armstrong {
          public static void main(String[] args) {
                    int num = 153;
                    int itt = 0;
                    int sum = 0;
                    for (int i = num; i != 0; i /= 10) {
                              itt++;
                    }
                    for (int i = num; i != 0; i /= 10) {
                              int mul = 1;
                              for (int j = 0; j < itt; j++) {
                                        mul = mul * (i % 10);

                              }
                              sum += mul;
                    }
                    if (sum == num) {
                              System.out.println("armstrong");

                    } else {
                              System.out.println("not armstrong");

                    }
          }

}
