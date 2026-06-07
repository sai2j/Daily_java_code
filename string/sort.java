package string;

public class sort {
          public static void main(String[] args) {
                    String str = "mfaolos";
                    char ch[] = str.toCharArray();
                    for (int i = 0; i < str.length(); i++) {
                              for (int j = i + 1; j < str.length(); j++) {
                                        if (ch[i] > ch[j]) {
                                                  char temp = ch[i];
                                                  ch[i] = ch[j];
                                                  ch[j] = temp;
                                        }
                              }
                              System.out.print(ch[i]);
                    }
          }
}
