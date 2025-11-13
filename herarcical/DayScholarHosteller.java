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
                    return "[id=" + id + ", name=" + name + ", fees=" + fees + "";
          }

}

class Hosteller extends student {
          protected double hostelfee;

          public Hosteller(int id, String name, double fees, double hostelfee) {
                    super(id, name, fees);
                    this.hostelfee = hostelfee;
          }

          public String toString() {
                    return toString() + "hostelfees=" + hostelfee + "]";
          }

}

class DayScholar extends student {
          protected double transportfee;

          public DayScholar(int id, String name, double fees, double transportfee) {
                    super(id, name, fees);
                    this.transportfee = transportfee;
          }

          public String displayetail1() {
                    return toString() + "transportfee=" + transportfee + "]";
          }

}

public class DayScholarHosteller {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int choice = Integer.parseInt(sc.next());
                    if (choice >= 3) {
                              System.out.println("Invalid Choice!");
                              System.exit(0);
                    }
                    switch (choice) {
                              case 1 -> {
                                        int id = Integer.parseInt(sc.next());
                                        String name = sc.next();
                                        double examFee = Double.parseDouble(sc.next());
                                        double transportFee = Double.parseDouble(sc.next());
                                        double amount = Double.parseDouble(sc.next());
                                        if (amount <= 0) {
                                                  System.out.println("amount should be Positive.");
                                                  System.exit(0);
                                        }
                                        DayScholar scollar = new DayScholar(transportFee, id, name, examFee);
                                        System.out.println(scollar.displaydetail1());
                                        scollar.payfee(amount);
                              }
                              case 2 -> {
                                        int id = Integer.parseInt(sc.next());
                                        String name = sc.next();
                                        Double examFee = Double.parseDouble(sc.next());
                                        double HosteleFee = Double.parseDouble(sc.next());
                                        double amount = Double.parseDouble(sc.next());
                                        if (amount <= 0) {
                                                  System.out.println("amount should be Positive.");
                                                  System.exit(0);
                                        }
                                        Hosteller hostel = new Hosteller(HosteleFee, id, name, examFee);
                                        System.out.println(hostel.displaydetail2());
                                        hostel.payfee(amount);
                              }
                    }
          }
}
