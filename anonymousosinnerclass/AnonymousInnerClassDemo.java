package anonymousosinnerclass;

class Super {
          public void show() {
                    System.out.println("show method");
          }
}

public class AnonymousInnerClassDemo {
          public static void main(String[] args) {
                    Super sup = new Super() {
                              public void show() {
                                        System.out.println("show inner class");
                              }
                    };
                    sup.show();
          }
}
