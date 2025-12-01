package overriding;

class payment {
          public void makepayment() {
                    System.out.println("payment generic");
          }

}

class creditcard extends payment {
          public void makepayment() {
                    System.out.println("payment by creditcard");
          }

}

class debitcard extends payment {
          public void makepayment() {
                    System.out.println("payment by debitcard");
          }

}

class upi extends payment {
          public void makepayment() {
                    System.out.println("payment by upi");

          }

}

public class demo2 {
          public static void main(String[] args) {
                    payment p = null;
                    p = new debitcard();
                    p.makepayment();
                    p = new creditcard();
                    p.makepayment();
                    p = new upi();
                    p.makepayment();

          }

}
