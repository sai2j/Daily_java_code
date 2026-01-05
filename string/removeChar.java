package string;

public class removeChar {
          public static void main(String[] args) {
                    String str = "ravi";
                    char removeChar = 'v';

                    StringBuilder result = new StringBuilder();
                    for (int i = 0; i < str.length(); i++) {
                              char c = str.charAt(i);
                              if (c != removeChar) {
                                        result.append(c);
                              }

                    }
                    System.out.println(result);
          }
}