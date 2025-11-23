import java.util.Scanner;

class student {
          protected int id;
          protected String name;
          protected double fees;

          public student(int id, String name, double fees) {
                    this.id = id;
                    this.name = name;
                    this.fees = fees;
          }

          @Override
          public String toString() {
                    return "[Id: " + id + ", Name: " + name + ", Fees: " + fees + "";
          }

}

class Hosteller extends student {
          protected double hostelfee;

          public Hosteller(int id, String name, double fees, double hostelfee) {
                    super(id, name, fees);
                    this.hostelfee = hostelfee;
          }

          public String toString() {
                    return super.toString() + ", Hostelfees: " + hostelfee + "]";
          }

}

class DayScholar extends student {
          protected double transportfee;

          public DayScholar(int id, String name, double fees, double transportfee) {
                    super(id, name, fees);
                    this.transportfee = transportfee;
          }

          public String displayetail1() {
                    return super.toString() + ", Transportfee: " + transportfee + "]";
          }

}

public class DayScholarHosteller {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter your choice (1/2) : ");
                    int choice = Integer.parseInt(sc.next());
                    if (choice >= 3) {
                              System.out.println("Invalid Choice!");
                              System.exit(0);
                    }
                    switch (choice) {
                              case 1 -> {
                                        System.out.print("Enter ID number: ");
                                        int id = Integer.parseInt(sc.next());
                                        System.out.print("Enter name:");
                                        String name = sc.next();
                                        System.out.print("Enter your Exam fess: ");
                                        double examFee = Double.parseDouble(sc.next());
                                        System.out.print("Enter Transport fess: ");
                                        double transportFee = Double.parseDouble(sc.next());
                                        System.out.print("Enter amount: ");
                                        double amount = Double.parseDouble(sc.next());
                                        if (amount <= 0) {
                                                  System.out.println("amount should be Positive.");
                                                  System.exit(0);
                                        }
                                        DayScholar scollar = new DayScholar(id, name, examFee, transportFee);
                                        System.out.println(scollar.displayetail1());         
                              }
                              case 2 -> {
                                        System.out.print("Enter ID number: ");
                                        int id = Integer.parseInt(sc.next());
                                        System.out.print("Enter name:");
                                        String name = sc.next();
                                        System.out.print("Enter your Exam fess: ");
                                        double examFee = Double.parseDouble(sc.next());
                                        System.out.print("Enter Hostel fess: ");
                                        double hostelFee = Double.parseDouble(sc.next());
                                        System.out.print("Enter amount: ");
                                        double amount = Double.parseDouble(sc.next());
                                        if (amount <= 0) {
                                                  System.out.println("amount should be Positive.");
                                                  System.exit(0);
                                        }
                                        Hosteller hosteller = new Hosteller(id, name, examFee, hostelFee);
                                        System.out.println(hosteller.toString());
                              }
                    }
          }
}
