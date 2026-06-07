package StreamApi;

import java.util.Arrays;
import java.util.List;

public class mapDemo {
        public static void main(String[] args) {
          List<String>  listofcharacter =  Arrays.asList("java","arnav","varun","aryan");
          List<Character> listofcaharacter = listofcharacter.stream().map(name->name.charAt(0)).toList();
          IO.print(listofcaharacter);
        }  
}
