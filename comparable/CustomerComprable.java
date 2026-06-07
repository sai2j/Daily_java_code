package comparable;

import java.util.Collections;
import java.util.Vector;

record Customer(Integer id, String name) implements Comparable<Customer> {

          @Override
          public int compareTo(Customer c2) {
                    return this.name.compareTo(c2.name);

          }
}

public class CustomerComprable {
          public static void main(String[] args) {
                    Vector<Customer> listofcustomer = new Vector<>();
                    listofcustomer.add(new Customer(111, "sharl"));
                    listofcustomer.add(new Customer(333, "maya"));
                    listofcustomer.add(new Customer(222, "faju"));

                    Collections.sort(listofcustomer);

                    for (Customer customer : listofcustomer) {
                              System.out.println(customer);
                    }

          }
}
