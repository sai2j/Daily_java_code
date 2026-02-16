package hashmap;

import java.util.*;

public class HashMapDemo5 {
          public static void main(String[] args) {
                    HashMap<String, Boolean> library = new HashMap<>();
                    library.put("java", true);
                    library.put("c++", true);

                    System.out.println("Display All book");
                    library.forEach((k, v) -> IO.println(k + " : " + v));
                    String bookBorrow = "java";

                    if (library.containsKey(bookBorrow) && library.get(bookBorrow)) {
                              library.put(bookBorrow, false);
                              IO.println(bookBorrow + " has been borrowed successfully...");
                    } else {
                              IO.println(bookBorrow + " Book is not Available.");
                    }
                    String bookreturn = "java";
                    if(library.containsKey(bookreturn) && !library.get(bookreturn)){
                              library.put(bookreturn, true);
                              IO.print(bookreturn+" book return by the use.");
                    }
                    else{
                              IO.println(bookBorrow+" is not in the library");
                    }

          }
}