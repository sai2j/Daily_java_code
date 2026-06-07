package StreamApi;

import java.util.ArrayList;

record Employee(Integer id, String name, Double salary) {

}

public class MapDemo2 {
          public static void main(String[] args) {
                    ArrayList<Employee> listofEmployees = new ArrayList<>();
                    listofEmployees.add(new Employee(1, "rahil", 30000D));
                    listofEmployees.add(new Employee(2, "rahul", 40000D));
                    listofEmployees.add(new Employee(3, "rakesh", 50000D));
                    listofEmployees.add(new Employee(4, "ramesh", 60000D));
                    listofEmployees.add(new Employee(5, "rajesh", 70000D));

                    listofEmployees.forEach(IO::println);

                    listofEmployees.stream().map(emp->emp.salary()+5000).forEach(IO::println);

          }
}
