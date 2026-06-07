package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo8 {
          public static void main(String[] args) {
                    Map<String, Integer> map = new HashMap<>();
                    map.merge("Apple", 10, (oldvalue, newvalue) -> oldvalue + newvalue);
                    map.merge("mango", 20, (oldvalue, newvalue) -> oldvalue + newvalue);
                    map.merge("orange", 10, (v1, v2) -> v1 * v2);
                    map.merge(null, 30, (v1, v2) -> v1 + v2);
                    IO.println(map);

                    IO.println("---------------------------------");
                    Map<String, Integer> map1 = new HashMap<String, Integer>();
                    map1.computeIfAbsent("A", key -> key.length());
                    map1.computeIfAbsent("b", key -> 10);
                    IO.println(map1);
                    map1.merge("b", 15, (v1,v2)->v1+v2);
                    IO.println(map1);

          }
}
