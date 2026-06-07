package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo10 {
          public static void main(String[] args) {
                    Map<String, List<String>> subject = new HashMap<>();
                    subject.computeIfAbsent("Scout", key -> new ArrayList<String>()).add("java");
                    subject.computeIfAbsent("mohan", key -> new ArrayList<String>()).add("advance java");
                    IO.println(subject);

                    IO.println("----------------------");

                    subject.computeIfPresent("scout", (k, v) -> {
                              v.add("html");
                              return v;
                    });
                    IO.println(subject);
          }
}
