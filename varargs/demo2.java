package varargs;

class hetro {
          public void acceptHetro(Object... x) {
                    for (Object y : x) {
                              System.out.print(y);
                    }
          }
}

public class demo2 {
          public static void main(String[] args) {
                    new hetro().acceptHetro(1, 3.5, "raju", false, new StringBuilder("java"));
          }

}
