package hashmap;

import java.util.*;

public class HashMapDemo1 {
          public static void main(String[] args) {
                    HashMap<Integer, String> map = new HashMap<>();
                    map.put(1, "vanila");
                    map.put(2, "choclate");
                    map.put(3, "butterscott");

                    System.out.println("hashmap entries are:");
                    IO.println(map);

                    System.out.println("by using for each");
                    map.forEach((key, value) -> IO.println("key is :" + key + " value is :" + value));

                    boolean haskey = map.containsKey(3);
                    System.out.println("hashmap contain key 3:" + haskey);

                    boolean hasvalue = map.containsValue("vanila");
                    System.out.println("hashmap contain value vanila: " + hasvalue);

                    map.remove(3);
                    System.out.println(map);

                    System.out.println("iterating through iterator :");
                    Iterator<Map.Entry<Integer, String>> itr1 = map.entrySet().iterator();
                    itr1.forEachRemaining(System.out::println);

                    Iterator<Map.Entry<Integer, String>> itr2 = map.entrySet().iterator();
                    itr2.forEachRemaining(System.out::println);

                    System.out.println("Iterator through hashmap");
                    for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
                              System.out.println(entry.getKey() + " : " + entry.getValue());
                    }

                    for(HashMap.Entry<Integer,String> entry :map.entrySet()){
                              System.out.println(entry.getKey()+" : "+entry.getValue());
                    }
                    int size = map.size();
                    System.out.println(size);

                    map.clear();
                    System.out.println(map);
                    System.out.println(map.isEmpty());

          }

}
