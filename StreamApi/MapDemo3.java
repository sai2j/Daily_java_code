package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Player(Integer id, String name) {

}

public class MapDemo3 {
          public static void main(String[] args) {
                    Set<String> playername = getPlayerList().stream().map(player -> player.name().toUpperCase())
                                        .collect(Collectors.toSet());
                    playername.forEach(IO::println);
          }

          public static List<Player> getPlayerList() {
                    List<Player> listofPlayer = new ArrayList<>();
                    listofPlayer.add(new Player(121, "karan"));
                    listofPlayer.add(new Player(124, "manisha"));
                    return listofPlayer;
          }
}
