package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(Integer id, String name, Double salary) {

}

public class FilterDemo3 {

          public static void main(String[] args) {
                    Employee e1 = new Employee(111, "juber", 80000D);
                    Employee e2 = new Employee(222, "juned", 30000D);
                    Employee e3 = new Employee(333, "manish", 50000D);
                    Employee e4 = new Employee(444, "sahil", 90000D);

                    List<Employee> collect = Stream.of(e1, e2, e3, e4).filter(emp -> emp.salary() > 50000)
                                        .collect(Collectors.toList());
                    collect.forEach(emp -> IO.println(emp.name()));

                    IO.println("------------------");

                    List<Employee> list = Arrays.asList(e1, e2, e3, e4).stream().filter(emp -> emp.salary() > 50000)
                                        .toList();
                    list.forEach(e -> IO.println(e.name()));

          }
}
