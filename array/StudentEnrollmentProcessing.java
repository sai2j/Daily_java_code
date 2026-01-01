package array;

import java.util.Scanner;

record Course(Integer id, String name, Double fees) {

}

record Offer(String offerText) {

}

record EducationInstitute(Course[] courses, Offer[] offers) {
          public void enrollStudentInCourse(int courseId, String studentName) {

                    for (Course c : courses) {
                              if (c.id() == courseId) {
                                        System.out.println(studentName + " enrolled in :" + c.name());
                                        return;
                              }
                    }
                    System.out.println("course with Id " + courseId + " not found.");
          }
}

record Student(String name, EducationInstitute institute) {
          public void viewcoursesAndFees() {
                    for (Course c : institute.courses()) {
                              System.out.println(c);
                    }
          }

          public void ViewOffers() {
                    for (Offer of : institute.offers()) {
                              System.out.println(of);
                    }

          }

          public void enrollInCourse(Integer courseId) {
                    institute.enrollStudentInCourse(courseId, name);
          }
}

public class StudentEnrollmentProcessing {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("ENTER YOUR NAME:");
                    String name = sc.nextLine();
                    Course[] course = { new Course(1, "java", 5000d),
                                        new Course(2, ".net", 4000d),
                                        new Course(3, "python", 3000d)

                    };
                    Offer[] offer = { new Offer("Special discount: Get 20% off on all courses!"),
                                        new Offer("Limited time offer: Enroll in any two courses and get one course free!") };
                    EducationInstitute ed = new EducationInstitute(course, offer);
                    Student stu = new Student(name, ed);
                    stu.viewcoursesAndFees();
                    stu.ViewOffers();
                    System.out.println("ENTER YOUR ID:");
                    int id = Integer.parseInt(sc.nextLine());
                    stu.enrollInCourse(id);

          }
}
