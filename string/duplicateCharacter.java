package string;

public class duplicateCharacter {
          public static void main(String[] args) {
                    String str = "ravishankar";
                    int count = 0;

                    for (int i = 0; i < str.length(); i++) {
                              for (int j = i + 1; j < str.length(); j++) {
                                        if (str.charAt(i) == str.charAt(j)) {
                                                  count++;

                                                  break;
                                        }
                              }

                    }

                    System.out.println(count);
          }
}
