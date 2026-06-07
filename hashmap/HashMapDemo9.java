package hashmap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo9 {
          public static void main(String[] args) {
                    Map<String, Integer> flight = new HashMap<>();
                    flight.put("mumbai", 8000);
                    flight.put("delhi", 7000);
                    flight.put("nagpur", 5000);

                    Entry<String, Integer> entry = Collections.min(flight.entrySet(),
                                        (f1, f2) -> f1.getValue().compareTo(f2.getValue()));

                    IO.println("hydrabed to " + entry.getKey() + " flight rate is: " + entry.getValue());

                    Entry<String, Integer> entry1 = Collections.max(flight.entrySet(),
                                        (f1, f2) -> f1.getValue().compareTo(f2.getValue()));
                    IO.println("hydrabed to " + entry1.getKey() + " flight rate is: " + entry1.getValue());

          }
}
