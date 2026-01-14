package vector;

import java.util.Vector;

record Employees(Integer id, String name, Double salary) {

}

public class VectorDemo3 {
          public static void main(String[] args) {
                    Vector<Employees> v1 = new Vector<>();
                    v1.add(new Employees(111, "raju", 500D));
                    v1.add(new Employees(222, "kiran", 1000D));

                    System.out.println("print data with condition: ");
                    for (Employees employees : v1) {
                              if (employees.salary() >= 500)
                                        System.out.println(employees);
                    }
                    System.out.println("sorting id wise:");
                    v1.sort((e1, e2) -> e1.id().compareTo(e2.id()));
                    for (Employees employees : v1) {
                              System.out.println(employees);
                    }
          }
}
