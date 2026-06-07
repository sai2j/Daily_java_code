package StreamApi;

import java.util.List;

import java.util.Arrays;

public class FlatMapDemo1 {
   public static void main(String[] args) {
      List<String> indplayer = Arrays.asList("dhoni", "kolhi");
      List<String> nzplayer = Arrays.asList("rachin", "sodhi");

      List<List<String>> nest = Arrays.asList(indplayer, nzplayer);
      List<String> flat = nest.stream().flatMap(list -> list.stream()).toList();
      IO.print(flat);
   }
}
