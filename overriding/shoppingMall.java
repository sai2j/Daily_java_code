package overriding;

import java.util.Scanner;

public class shoppingMall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int item = Integer.parseInt(sc.nextLine());
        double itemprice[] = new double[item];
        for (int i = 0; i < itemprice.length; i++) {
            String itemname = sc.nextLine();
            double itemprice1 = Double.parseDouble(sc.nextLine());
            itemprice[i] = itemprice1;
        }
        Customer customer = null;
        switch (choice) {
            case 1 -> {
                customer = new generalCustomer(name);
                generatebill(customer, itemprice);
            }
            case 2 -> {
                customer = new primeCustomer(name);
                generatebill(customer, itemprice);
            }
            case 3 -> {
                customer = new vipCustomer(name);
                generatebill(customer, itemprice);
            }
            
        }
        sc.close();

    }

    public static void generatebill(Customer customer, double... price) {
        customer.CalculateBill(price);
        customer.printDetails();
    }
}

class Customer {
    protected String name;
    protected double total;

    public Customer(String name) {
        super();
        this.name = name;
        if (name == null || name.isEmpty()) {
            System.out.println("error");
            System.exit(0);
        }
    }

    public double CalculateBill(double... prices) {
        double total = 0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            total = total + price;
        }
        return total;

    }

    public void printDetails() {
        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount: No discount for general customers.");

    }
}

class generalCustomer extends Customer {
    public generalCustomer(String name) {
        super(name);
    }

    public double CalculateBill(double... prices) {
        return total = super.CalculateBill(prices);
    }

}

class primeCustomer extends Customer {
    protected double discountrate = 10.0;

    public primeCustomer(String name) {
        super(name);
    }

    public double CalculateBill(double... prices) {
        return total = super.CalculateBill(prices);
    }

    public void printDetails() {
        double amount = (total * discountrate) / 100;
        double finalamount = total - amount;
        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount RS : " + amount);
        System.out.println("Final amount RS : " + finalamount);

    }

}

class vipCustomer extends Customer {
    protected double discountrate = 15.0;

    public vipCustomer(String name) {
        super(name);
    }

    public double CalculateBill(double... prices) {
        return total = super.CalculateBill(prices);
    }

    public void printDetails() {
        double amount = total * discountrate / 100;
        double finalamount = total - amount;
        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount RS : " + amount);
        System.out.println("Final amount RS : " + finalamount);

    }

}