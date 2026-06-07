package hashmap;

import java.util.HashMap;

public class HashmapDemo6 {
          public static void main(String[] args) {
                    
                    String text = "java is fun is powerful java is great";
                    
                    String words[] = text.split(" ");
                    HashMap<String, Integer> wordcount = new HashMap<>(); 
                    for (String word : words) {
                              wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
                    }
                    System.out.println("Word Frequwncy :  " + wordcount);
          }
}
