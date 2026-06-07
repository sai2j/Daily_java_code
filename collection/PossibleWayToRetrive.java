package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class PossibleWayToRetrive {
          public static void main(String[] args) {
                    Vector<String> ListOfCity = new Vector<>();
                    ListOfCity.add("hyd");
                    ListOfCity.add("pune");
                    ListOfCity.add("noida");

                    System.out.println("using toString method");
                    System.out.println(ListOfCity.toString());

                    System.out.println("using urdinary loop");
                    for (int i = 0; i < ListOfCity.size(); i++) {
                              System.out.println(ListOfCity.get(i));
                    }

                    System.out.println("using for-each loop");
                    for (String s1 : ListOfCity) {
                              System.out.println(s1);
                    }

                    System.out.println("using Enumeration Interface");
                    Enumeration<String> element = ListOfCity.elements();
                    while (element.hasMoreElements()) {
                              System.out.println(element.nextElement());
                    }

                    System.out.println("using Iterator interface");
                    Iterator<String> i1 = ListOfCity.listIterator();
                    i1.forEachRemaining(str -> System.out.println(str));

          }
}
