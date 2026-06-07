package Comparator;

import java.util.Arrays;
import java.util.Comparator;

record Manager(Integer id, String name) {

}

public class managerComprator {

          public static void main(String[] args) {
                    Manager manager[] = new Manager[2];
                    manager[1] = new Manager(222, "juber");
                    manager[0] = new Manager(111, "shakil");

                    Comparator<Manager> cmpid = new Comparator<>() {
                              public int compare(Manager m1, Manager m2) {
                                        return Integer.compare(m1.id(), m2.id());
                              }
                    };
                    Arrays.sort(manager, cmpid);

                    for (Manager managers : manager) {
                              System.out.println(managers);
                    }
                    Comparator<Manager> cmpname = new Comparator<Manager>() {
                              public int compare(Manager m3, Manager m4) {
                                        return m3.name().compareTo(m4.name());
                              }
                    };
                    Arrays.sort(manager, cmpname);
                    for (Manager managers : manager) {
                              System.out.println(managers);
                    }

          }
}