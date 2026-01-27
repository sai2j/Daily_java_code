package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
          public static void main(String[] args) {
                    HashMap<Integer, String> hm2 = new HashMap<>();

                    hm2.put(1, "ramu");
                    hm2.put(2, "karan");

                    IO.println(hm2);

                    int id = Integer.parseInt(IO.readln("Enter your id : "));
                    String name = hm2.get(id);

                    if (name != null) {
                              System.out.println(name);
                    } else {
                              IO.println(id + " is not in Record");
                    }
                    IO.println(hm2.put(1, "manish"));
                    System.out.println("Update record" + hm2);

                    hm2.remove(1);
                    IO.println("Record after removal " + hm2);

                    id = 1;
                    System.out.println("does id " + id + " exist ? " + hm2.containsKey(id));

                    name = "karan";
                    System.out.println("does name " + name + " exist ? " + hm2.containsValue(name));

                    System.out.println("Iteration through record: ");
                    for (Map.Entry<Integer, String> itr : hm2.entrySet()) {
                              System.out.println("ID :" + itr.getKey() + " Name :" + itr.getValue());
                    }

                    hm2.clear();
                    System.out.println("All records are clear :" + hm2);

          }

}
