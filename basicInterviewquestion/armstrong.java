package basicInterviewquestion;

// public class armstrong {
//           public static void main(String[] args) {
//                     int num = 153;
//                     int itt = 0;
//                     int sum = 0;
//                     for (int i = num; i != 0; i /= 10) {
//                               itt++;
//                     }
//                     for (int i = num; i != 0; i /= 10) { 
//                               int mul = 1;
//                               for (int j = 0; j < itt; j++) {
//                                         mul = mul * (i % 10);

//                               }
//                               sum += mul;
//                     }
//                     if (sum == num) {
//                               System.out.println("armstrong");

//                     } else {
//                               System.out.println("not armstrong");

//                     }
//           }

// }

public class armstrong {
          public static void main(String[] args) {
                    int n = 153;

                    int temp = n;
                    int sum = 0;

                    while (temp > 0) {
                              int r = temp % 10;
                              sum = sum + (r * r * r);
                              temp = temp / 10;

                    }
                    if (sum == n) {

                              System.err.println("armstrong");
                    } else {
                              System.out.println("not a armstrong");
                    }
          }
}
