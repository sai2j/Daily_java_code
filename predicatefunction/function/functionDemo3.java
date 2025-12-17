package predicatefunction.function;

import java.util.function.Function;

record Employee(Integer id, String name, Double salary) {

}

public class functionDemo3 {
          public static void main(String[] args) {
                    Employee e1 = new Employee(02, "elon", 52000D);
                    Function<Employee, String> fn3 = emp -> emp.name();
                    System.out.println("name of the employee is :" + fn3.apply(e1));

                    Function<Employee, Double> fn4 = emp -> emp.salary();
                    System.out.println("salary of the employee is :" + fn4.apply(e1));

          }
}
