package lambda;

interface calculate{
          void doSum(int a,int b);
}

public class LambdaDemo2 {
          public static void main(String[] args) {
                    calculate c1 = (a,b) -> System.out.println("sum is : "+(a+b));
                    c1.doSum(20, 30);
          }
}
