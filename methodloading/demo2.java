package methodloading;

import string.startWith;

record Student(int roll, String name) {

}

record Employee(int id, double salary) {

}

class Sample {
          public static void accept(Student student) {
                    System.out.println(student.roll());
                    System.out.println(student.name());

          }

          public static void accept(Employee employee) {
                    System.out.println(employee.id());
                    System.out.println(employee.salary());
          }
}

public class demo2 {
          public static void main(String[] args) {
                    Sample.accept(new Employee(101, 80000));
                    Sample.accept(new Student(1, "raj"));
          }

}
