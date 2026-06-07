package basicInterviewquestion;

// public class one_digit_value {
//           public static void main(String[] args) {
//                     int num = 999;
//                     for (; num > 9;) {
//                               int sum = 0;
//                               for (int j = num; j != 0; j /= 10) {
//                                         sum = sum + (j % 10);
//                               }
//                               num = sum;
//                     }
//                     System.out.println(num);
//           }

// }

public class one_digit_value {
          public static void main(String[] args) {
                    int num = 999;
                    while (num > 9) {
                              int sum = 0;
                              while (num > 0) {
                                        sum = sum + (num % 10);
                                        num = num / 10;

                              }
                              num = sum;

                    }
                    System.out.println(num);
          }

}
