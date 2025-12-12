package interfaces;

interface bank {
          void diposit(double amount);
          void withdrawl(double amount);
}

class sbi implements bank {
          protected double balance = 1200;

          public void diposit(double amount) {
                    if (amount < 0) {
                              System.out.println("Amount can not be negative");
                              System.exit(0);
                    }
                    balance = balance + amount;
                    System.out.println("deposit amount " + balance);
          }

          public void withdrawl(double amount) {
                    if (amount < 0) {
                              System.out.println("Amount can not be negative");
                              System.exit(0);
                    }
                    balance = balance + amount;
                    System.out.println("deposit amount " + balance);
          }
}

public class InterfaceDemo3 {
          public static void main(String[] args) {
                    sbi s = new sbi();
                    s.diposit(500);
                    s.withdrawl(300);

          }
}
