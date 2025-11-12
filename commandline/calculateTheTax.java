public class calculateTheTax {
          public static void main(String[] args) {
                    int income = Integer.parseInt(args[0]);

                    double tax = income * (4.9 / 100);
                    double Applytax = income - tax;

                    System.out.println("the tax rate is fixed at 4.9% :" + Applytax);
          }

}
