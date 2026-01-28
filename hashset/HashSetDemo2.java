package hashset;

import java.util.*;

public class HashSetDemo2 {
          public static void main(String[] args) {
                    HashSet<String> set = new HashSet<>();
                    set.add("Ravi");
                    set.add("vijay");
                    set.add(new String("Ravi"));
                    set.add(null);
                    set.add(null);


                    set.forEach(str -> IO.println(str));
          }
}
