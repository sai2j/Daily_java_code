
class Main {
          public static void main(String[] args) {
                    int n = 2;
                    int c = 0;
                    int count;
                    for (int i = 2;; i++) {
                              count = 0;
                              for (int j = 1; j <= i; j++) {
                                        if (i % j == 0)
                                                  count++;
                              }
                              if (count == 2) {
                                        c++;
                                        if (c == n) {
                                                  System.out.println(i);
                                                  break;
                                        }
                              }
                    }
          }
}