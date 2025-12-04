package polymorphism;

class Payment{
          public double makePayment(double amount){
                    return 0.0;
          }

}
class CreditCard extends Payment{
          public double makePayment(double amount){
                    return amount;

          }
          public void offer(){
                    System.out.println("getting offer");
          }
}
class DebitCard extends Payment{
          public double makePayment(double amount)
          {
                    return amount;
          }

}
class UPI extends Payment{
          public double makePayment(double amount){
                    return amount;
          }
          public void offer(){
                    System.out.println("getting offer");
          }
}
public class PolymorphicBehavior4 {
          public static void main(String[] args) {
                    Payment p = null;
                    p = new CreditCard();
                    paymnetgateway(p);
                    p = new DebitCard();
                    paymnetgateway(p);
                    p = new UPI();
                    paymnetgateway(p);
                
          }
          public static void paymnetgateway(Payment payment){
                    if(payment instanceof CreditCard card){
                              double amount = card.makePayment(2000);
                              System.out.println("making a payment of credit card "+amount);
                    }
                    else if(payment instanceof DebitCard card){
                              double amount = card.makePayment(7000);
                              System.out.println("making a payment of debit card "+amount);
                    }
                    else if(payment instanceof UPI upi){
                              double amount = upi.makePayment(1000);
                              System.out.println("making a payment of upi "+amount);
                    }

          }
          
}
