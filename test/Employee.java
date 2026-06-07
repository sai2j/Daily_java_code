package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

record EmployeeTest(int id, String name, double salary) {
}

class Employee {
          public static void main(String[] args) {
                    ArrayList<EmployeeTest> list = new ArrayList<>();
                    // for (int i = 1; i <= 5; i++) {
                    // int id = Integer.parseInt(IO.readln());
                    // String name = IO.readln();
                    // double salary = Double.parseDouble(IO.readln());

                    // list.add(new EmployeeTest(name, id, salary));
                    // }

                    // Step 2: Add employee details
                    list.add(new EmployeeTest(101, "Ravi", 45000d));
                    list.add(new EmployeeTest(102, "Anu", 30000d));
                    list.add(new EmployeeTest(103, "Kiran", 38000d));
                    list.add(new EmployeeTest(104, "Bala", 50000d));
                    list.add(new EmployeeTest(105, "Chitra", 41000d));
                    Collections.sort(list, new Comparator<EmployeeTest>() {
                              public int compare(EmployeeTest e1, EmployeeTest e2) {
                                        return e1.name().compareTo(e2.name());
                              }
                    });

                    for (EmployeeTest e : list) {
                              System.out.println(e.name() + " " + e.id() + " " + e.salary());
                    }
          }

}
