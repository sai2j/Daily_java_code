package vector;

import java.util.Vector;

record manager(Integer id, String name) {

}

public class VectorDemo6 {
          public static void main(String[] args) {
                    Vector<manager> listofmanger = new Vector<>();
                    listofmanger.add(new manager(12, "daji"));
                    listofmanger.add(new manager(13, "damu"));
                    listofmanger.add(new manager(14, "ramu"));
                    for (manager managers : listofmanger) {
                              Integer id = 14;
                              if (managers.id() == id) {
                                        listofmanger.remove(managers);
                                        break;
                              }
                    }
                    listofmanger.forEach(System.out::println);

          }

}
