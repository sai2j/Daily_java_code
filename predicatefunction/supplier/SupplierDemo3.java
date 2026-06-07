package predicatefunction.supplier;

import java.util.function.Supplier;
import java.util.Scanner;

record Product(Integer id, String name, Double price) {

}

public class SupplierDemo3 {
          public static void main(String[] args) {
                    Supplier<Product> s2 = () -> {
                              Scanner sc = new Scanner(System.in);
                              System.out.println("Enter your id: ");
                              var id = Integer.parseInt(sc.nextLine());
                              System.out.println("Enter your name: ");
                              var name = sc.nextLine();
                              System.out.println("Enter your Price: ");
                              var price = Double.parseDouble(sc.nextLine());

                              return new Product(id, name, price);
                    };
                    Product product = s2.get();
                    System.out.println(product);
          }
}
