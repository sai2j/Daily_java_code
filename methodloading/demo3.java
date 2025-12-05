package methodloading;

//char->int->long->float->double 
//byte->short->int->long->float->double
class Alpha {
          public void accept(int x) {
                    System.out.println("integer");
          }

          public void accept(Long x) {
                    System.out.println("long");
          }
}

class Beta extends Alpha {
          public void accept(float x) {
                    System.out.println("float");
          }

          public void accept(double x) {
                    System.out.println("double");
          }
}

public class demo3 {
          public static void main(String[] args) {
                    Beta beta = new Beta();
                    beta.accept('a');
          }

}
