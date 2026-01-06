package comparable;

import java.util.Arrays;

record Employee(int id, String name) implements Comparable<Employee> {
          public int compareTo(Employee e2) {
                    return this.name.compareTo(e2.name);
          }
}

public class EmployeeComprable {
          public static void main(String[] args) {
                    Employee employee[] = new Employee[2];
                    employee[0] = new Employee(1, "Raja");
                    employee[1] = new Employee(2, "Ramu");
                    Arrays.sort(employee);

                    for(Employee emp:employee){
                              System.out.println(emp);
                    }
          }
}
