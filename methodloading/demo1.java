package methodloading;

class Addition {
          public int dosum(int a, int b) {
                    return (a + b);
          }

          protected double dosum(double a, double b) {
                    return (a + b);
          }

          public String dosum(String a, String b) {
                    return (a + b);

          }
}

public class demo1 {
          public static void main(String[] args) {
                    Addition addition = new Addition();
                    System.out.println(addition.dosum("sahil", "kolhe"));
                    System.out.println(addition.dosum(3, 3));
                    System.out.println(addition.dosum(2.5, 2.5));
          }

}
