package instanceof_operator;

class Test {

}

public class InstanceOfDemo1 {
          public static void main(String[] args) {
                    Test test = new Test();
                    if (test instanceof Test) {
                              System.out.println("test is pointing to Test object");
                    }

          }

}
