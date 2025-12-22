package predicatefunction.predicate;

import java.util.function.Predicate;

record Student(Integer id, String name, Double marks) {

}

public class PredicateDemo4 {
          public static void main(String[] args) {
                    Predicate<Student> p4 = student -> student.marks() >= 80;
                    Student s1 = new Student(101, "sahil", 80D);

                    if (p4.test(s1)) {
                              System.out.println( s1 );
                    } else {
                              System.out.println("Fail");
                    }
                    
          }

}
