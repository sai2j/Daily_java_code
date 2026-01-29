package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {
          public static void main(String[] args) {
                    HashMap<Integer, String> hm3 = new HashMap<>();
                    HashMap<Integer, String> hm4 = new HashMap<>();

                    hm3.put(1, "ocpjp");
                    hm3.put(2, "is");
                    hm3.put(3, "best");

                    System.out.println("values in hm3 : " + hm3);
                    hm4.put(4, "Exam");
                    System.out.println("Values in hm4 : " + hm4);

                    IO.println("After putAll");
                    hm3.putAll(hm4);
                    IO.println(hm3);

                    hm3.forEach((k,v)->IO.println(k+" : "+v));
                    System.out.println("All key are : ");
                    Set<Integer> key = hm3.keySet();
                    IO.println(key);

                    IO.print("All value are : ");
                    Collection<String> value = hm3.values();
                    IO.println(value);

                    //loose coupling
                    HashMap<String,String> map1 = new HashMap<>();
                    map1.put("raj@gmail", "raj123");
                    map1.put("ravi@gmail", "rav123");
                    IO.println(map1);

                    HashMap<String,String> map2 = new HashMap<>(map1);
                    IO.println(map2);
          }

}
