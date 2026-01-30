package hashmap;

import java.util.HashMap;

record Employee(int id, String name) {

}

public class HashMapDemo4 {
          public static void main(String[] args) {
                    Employee e1 = new Employee(101, "rahul");
                    Employee e2 = new Employee(102, "manish");

                    Employee e3 = e2;

                    HashMap<Employee, String> hm4 = new HashMap<>();
                    hm4.put(e1, "rajasthan");
                    hm4.put(e2, "delhi");

                    IO.println(hm4);
                    hm4.forEach((k,v)->IO.println(k+": "+v));

          }

}
