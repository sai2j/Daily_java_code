package co_varient;

class RBI{
          public Number loan(){
                    System.out.println("rbi pass the loan");
                    return null;
          }
}
class SBI extends RBI{
          public Float loan(){
                    System.out.println("sbi pass the loan");
                    return null;
          }

}
public class CovarientDemo2 {
          public static void main(String[] args) {
                    RBI rbi = new SBI();
                    rbi.loan();

          }
          
}
