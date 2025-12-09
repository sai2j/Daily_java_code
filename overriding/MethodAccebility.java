package overriding;

class Super{
          private void m1(){
                    System.out.println("m1 is super class");
          }

}
class Sub extends Super{
          public void m1(){
                    System.out.println("m1 is sub class");
          }

}
public class MethodAccebility {
          public static void main(String[] args) {
                new Sub().m1();    
          }
}
