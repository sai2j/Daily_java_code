package has_a_relation;

import java.util.Scanner;

class Collage {
          private String name;
          private String location;

          public Collage(String name, String location) {
                    this.name = name;
                    this.location = location;
          }

          public String toString() {
                    return "Name: " + name + ", Location: " + location + "";
          }

}

class Student {
          private int id;
          private String name;
          private String address;
          private Collage collage;

          public Student(int id, String name, String address, Collage collage) {
                    this.id = id;
                    this.name = name;
                    this.address = address;
                    this.collage = collage;
          }

          public String toString() {
                    return "Id: " + id + ", Name: " + name + ", Address: " + address + ", Collage: " + collage + "";
          }
}

public class Aggregation {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    System.out.print("Enter your Id.no: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter your Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter your Local Address: ");
                    String address = sc.nextLine();

                    Collage collage = new Collage("Sirt", "Bhopal");
                    Student student = new Student(id, name, address, collage);
                    System.out.println(student);
                    sc.close();
          }

}
