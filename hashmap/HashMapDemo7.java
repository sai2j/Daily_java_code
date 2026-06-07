package hashmap;

import java.util.*;

public class HashMapDemo7 {
          public static void main(String[] args) {
                    Map<String, Integer> map = new HashMap<>();
                    map.computeIfAbsent("A", key -> 12);
                    map.computeIfAbsent("A", key -> 14);
                    map.computeIfAbsent("C", key -> key.length());
                    map.computeIfAbsent(null, key -> 500);
                    map.computeIfAbsent("D", null);
                    IO.print(map);
          } 
}
