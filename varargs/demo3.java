package varargs;

class Addition {
          public void sum(int... values) {
                    int sum = 0;
                    for (int value : values) {
                              sum = sum + value;
                    }
                    System.out.println(sum);
          }
}

public class demo3 {
          public static void main(String[] args) {
                    Addition a = new Addition();
                    a.sum(1, 2, 3, 4, 5);
          }

}
