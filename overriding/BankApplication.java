package overriding;

import java.util.Scanner;

class BankAccount {
    protected String accountholdername;
    protected String acccountnumber;
    protected double balance;
    public static final String ifscode = "SBIHYD151285";

    public BankAccount(String accountholdername, String acccountnumber, double balance) {
        this.accountholdername = accountholdername;
        this.acccountnumber = acccountnumber;
        this.balance = balance;
        if (balance < 0) {
            System.out.println("balanace cannot be negative");
            System.exit(0);
        }
    }

    public void calculateInterest() {

    }

    public void displayAccountDetails() {

    }

    public void checkOverDraftLimit() {

    }

    public String toString() {
        return "account holder " + accountholdername + " account number " + acccountnumber + " balance " + balance
                + " ifsc code " + ifscode + "";
    }

}

class SavingAccount extends BankAccount {
    protected double interestrate = 4.0;

    public SavingAccount(String accountholdername, String acccountnumber, double balance) {
        super(accountholdername, acccountnumber, balance);

    }

    public void calculateInterest() {
        balance = balance * interestrate / 100;
        System.out.println("Saving account interest RS " + balance);
    }
}

class CurrentAccount extends BankAccount {
    protected double overdraftLimit = 5000;

    public CurrentAccount(String accountholdername, String acccountnumber, double balance) {
        super(accountholdername, acccountnumber, balance);

    }

    public void calculateInterest() {
        System.out.println("Current account do not earn interest. ");
    }

    public void checkOverDraftLimit() {
        System.out.println("overDraft limit RS : " + overdraftLimit);
    }

}

class FixedDepositLimit extends BankAccount {
    protected double interestRate = 6.5;
    protected int year;

    public FixedDepositLimit(String accountholdername, String acccountnumber, double balance) {
        super(accountholdername, acccountnumber, balance);
    }

    public void calculateInterest() {
        balance = balance * interestRate / 100 * year;
        System.out.println("fixed deposit interest for " + year + " year RS : " + balance);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter account number");
        String accnumber = sc.nextLine();
        System.out.println("Enter balance");
        double balance = Double.parseDouble(sc.nextLine());
        System.out.println("Enter your choice");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                BankAccount sa = new SavingAccount(name, accnumber, balance);
                System.out.println(sa);
                sa.calculateInterest();

            }
            case 2 -> {
                BankAccount ca = new CurrentAccount(name, accnumber, balance);
                System.out.println(ca);
                ca.calculateInterest();
                ca.checkOverDraftLimit();

            }
            case 3 -> {
                System.out.println("Enter year");
                int year = Integer.parseInt(sc.nextLine());
                BankAccount fa = new BankAccount(name, accnumber, balance);
                System.out.println(fa);
                fa.calculateInterest();

            }

        }
    }
}
