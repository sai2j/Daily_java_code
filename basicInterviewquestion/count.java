package basicInterviewquestion;

// public class count {
//           public static void main(String[] args) {
//                     int num = 12345;

//                     int count = 0;

//                     for(int i = num ;i!=0;i/=10){
//                               count++;
//                     }
//                     System.out.println(count);
//           }
// }

public class count {
          public static void main(String[] args) {
                    int n = 153;
                    int count = 0;

                    while (n > 0) {
                              count++;
                              n /= 10;
                    }
                    System.out.println(count);
          }
}