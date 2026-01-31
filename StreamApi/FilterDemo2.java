package StreamApi;

import java.util.List;

public class FilterDemo2 {
          public static void main(String[] args) {
                    List<String> listofname = List.of("Arayn", "aniket", "Atul", "Ayushi", "rahul");
                    IO.println(listofname);

                    IO.println("-----------------------");

                    listofname.stream().filter(name -> name.startsWith("A")).forEach(IO::println);
          }
}
