package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
          public static void main(String[] args) {

                    TreeMap<String, Float> employees = new TreeMap<>();

                    employees.put("John", 30000f);
                    employees.put("Ravi", 28000f);
                    employees.put("Meera", 35000f);
                    employees.put("Asha", 27000f);
                    employees.put("Kiran", 40000f);

                    List<Map.Entry<String, Float>> entryList = new ArrayList<>(employees.entrySet());
                    ListIterator<Map.Entry<String, Float>> iterator = entryList.listIterator();
                    while (iterator.hasNext()) {
                              Map.Entry<String, Float> entry = iterator.next();
                              Float updatesalaey = entry.getValue() + 5000f;
                              entry.setValue(updatesalaey);
                    }

                    for (Map.Entry<String, Float> entry : entryList) {
                              System.out.println(entry.getKey() + "  " + entry.getValue());
                    }

          }
}