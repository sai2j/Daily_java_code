package predicatefunction;

import java.util.function.Predicate;

record Student(Integer id, String name, Double marks) {
}

public class PredecateDemo5 {

    public static void main(String[] args) {

        Predicate<Student> p5 = student -> student.marks() >= 80;

        Student[] students = {
                new Student(101, "Scott", 90D),
                new Student(102, "Elev", 70D),
                new Student(103, "Bile", 85D),
                new Student(104, "David", 60D)
        };

        for (Student student : students) {
            if (p5.test(student)) {
                System.out.println(student);
            }
        }
    }
}
