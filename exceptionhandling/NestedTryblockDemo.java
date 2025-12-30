package exceptionhandling;

class Nested {
          public static void nestedTry() {
                    try {
                              String str = "null";
                              System.out.println(str.toUpperCase());
                              try {
                                        str = "456";
                                        Integer value = Integer.valueOf(str);
                                        System.out.println(value);
                              } catch (NullPointerException e) {
                                        System.out.println("number is not in a proper format");

                              }
                    } catch (NullPointerException e) {
                              System.out.println("reference is pointing to null");
                    }
          }
}

public class NestedTryblockDemo {
          public static void main(String[] args) {
                    Nested.nestedTry();
          }
}
