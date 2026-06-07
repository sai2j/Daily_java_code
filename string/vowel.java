package string;

public class vowel {
          public static void main(String[] args) {
                    String str = "raju";
                    int count = 0;

                    for (int i = 0; i < str.length(); i++) {
                              char ch = str.charAt(i);

                              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                        count++;
                              }
                    }

                    if (count > 0) {
                              System.out.println("contains vowel");
                    } else {
                              System.out.println("does not contain vowel");
                    }
          }
}
